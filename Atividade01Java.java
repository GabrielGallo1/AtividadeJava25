package atividadeJava;

import java.util.Scanner;
public class Atividade01Java {

	public class Caloria {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] caloriasPrato = {180, 230, 250, 350};
	        int[] caloriasSobremesa = {75, 110, 170, 200};
	        int[] caloriasBebida = {20, 70, 100, 65};

	        System.out.println("Escolha o prato (1-Vegetariano, 2-Peixe, 3-Frango, 4-Carne): ");
	        int prato = scanner.nextInt();
	        
	        System.out.println("Escolha a sobremesa (1-Abacaxi, 2-Sorvete diet, 3-Mouse diet, 4-Mouse chocolate): ");
	        int sobremesa = scanner.nextInt();
	        
	        System.out.println("Escolha a bebida (1-Cha, 2-Suco de laranja, 3-Suco de melao, 4-Refrigerante diet): ");
	        int bebida = scanner.nextInt();

	        int totalCalorias = caloriasPrato[prato - 1] + caloriasSobremesa[sobremesa - 1] + caloriasBebida[bebida - 1];

	        System.out.println("A quantidade total de calorias da refei��o �: " + totalCalorias);
	    }
	}

}
