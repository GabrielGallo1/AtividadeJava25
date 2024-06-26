package atividadeJava;

import java.util.Scanner;
public class Atividade01Java {

	public class Caloria {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] CalPrato = {180, 230, 250, 350};
	        int[] CalSobremesas = {75, 110, 170, 200};
	        int[] CalBebida = {20, 70, 100, 65};

	        System.out.println("Escolha o prato (1-Vegetariano" + \n " 2-Peixe" + \n " 3-Frango" + \n " 4-Carne): ");
	        int prato = scanner.nextInt();
	        
	        System.out.println("Escolha a sobremesa (1.Abacaxi" + \n " 2.Sorvete diet" + \n " 3.Mouse diet" + \n " 4.Mouse chocolate): ");
	        int sobremesa = scanner.nextInt();
	        
	        System.out.println("Escolha a bebida (1.Cha" + \n " 2.Suco de laranja" + \n " 3.Suco de melao" + \n " 4-Refrigerante diet): ");
	        int bebida = scanner.nextInt();

	        int totalCalorias = CalPrato = 0 + CalSobremesas = 0 + CalBebida = 0;

	        
        switch (prato) {
            case 1:
                CalPrato = 180;
                break;
            case 2:
                CalPrato = 230;
                break;
            case 3:
                CalPrato = 250;
                break;
            case 4:
                CalPrato = 350;
                break;
        }

        switch (sobremesa) {
            case 1:
                caloriasSobremesa = 75;
                break;
            case 2:
                caloriasSobremesa = 110;
                break;
            case 3:
                caloriasSobremesa = 170;
                break;
            case 4:
                caloriasSobremesa = 200;
                break;
        }

        switch (bebida) {
            case 1:
                caloriasBebida = 20;
                break;
            case 2:
                caloriasBebida = 70;
                break;
            case 3:
                caloriasBebida = 100;
                break;
            case 4:
                caloriasBebida = 65;
                break;
        }

        int totalCalorias = CalPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("Calorias totais da refeiçăo: " + totalCalorias);

	}
	    }
	}

}
