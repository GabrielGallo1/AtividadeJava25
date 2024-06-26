package atividadeJava;

import java.util.Scanner;
public class Atividade24Java {

	public class SomaAteNegativo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int soma = 0;
	        while (true) {
	            System.out.println("Digite um numero:");
	            int num = scanner.nextInt();
	            if (num < 0) {
	                break;
	            }
	            soma += num;
	        }
	        
	        System.out.println("Soma dos numeros: " + soma);
	        scanner.close();
	    }
	}

}
