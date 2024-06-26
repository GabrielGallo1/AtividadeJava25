package atividadeJava;

import java.util.Scanner;
public class Atividade22Java {

	public class NumerosEntreZeroCem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int contador = 0;
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite um número:");
	            int numero = scanner.nextInt();
	            if (numero >= 0 && numero <= 100) {
	                contador++;
	            }
	        }
	        
	        System.out.println("Quantidade de números entre 0 e 100: " + contador);
	        
	        scanner.close();
	    }
	}

}
