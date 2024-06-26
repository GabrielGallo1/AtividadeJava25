package atividadeJava;

import java.util.Scanner;
public class Atividade01Java {

	public class CaloriasRef {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] caloriasPrato = {180, 230, 250, 350}; // Vegetariano, Peixe, Frango, Carne
	        int[] caloriasSobremesa = {75, 110, 170, 200}; // Abacaxi, Sorvete diet, Mouse diet, Mouse chocolate
	        int[] caloriasBebida = {20, 70, 100, 65}; // Chá, Suco de laranja, Suco de melão, Refrigerante diet

	        System.out.println("Escolha o prato (1-Vegetariano, 2-Peixe, 3-Frango, 4-Carne):");
	        int prato = scanner.nextInt();
	        
	        System.out.println("Escolha a sobremesa (1-Abacaxi, 2-Sorvete diet, 3-Mouse diet, 4-Mouse chocolate):");
	        int sobremesa = scanner.nextInt();
	        
	        System.out.println("Escolha a bebida (1-Chá, 2-Suco de laranja, 3-Suco de melão, 4-Refrigerante diet):");
	        int bebida = scanner.nextInt();

	        int totalCalorias = caloriasPrato[prato - 1] + caloriasSobremesa[sobremesa - 1] + caloriasBebida[bebida - 1];

	        System.out.println("A quantidade total de calorias da refeição é: " + totalCalorias);
	    }
	}

}
