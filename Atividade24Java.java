package atividadeJava;

import java.util.Scanner;
public class Atividade24Java {

	public class SomaAteNegativo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int soma = 0;
	        while (true) {
	            System.out.println("Digite um número:");
	            int numero = scanner.nextInt();
	            if (numero < 0) {
	                break;
	            }
	            soma += numero;
	        }
	        
	        System.out.println("Soma dos números: " + soma);
	        
	        scanner.close();
	    }
	}

}
