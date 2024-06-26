package atividadeJava;

import java.util.Scanner;
public class Atividade20Java {

	public class NumerosMaioresQueOito {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int contador = 0;
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite um numero: ");
	            int numero = scanner.nextInt();
	            if (numero > 8) {
	                contador++;
	            }
	        }
	        
	        System.out.println("Quantidade de numeros maiores que 8: " + contador);
	        
	        scanner.close();
	    }
	}

}
