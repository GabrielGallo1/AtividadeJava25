package atividadeJava;

import java.util.Scanner;
public class Atividade17JAva {

	public class MaioresDeIdade {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int contador = 0;
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite a idade:");
	            int idade = scanner.nextInt();
	            if (idade >= 18) {
	                contador++;
	            }
	        }
	        
	        System.out.println("N�mero de pessoas maiores de idade: " + contador);
	        
	        scanner.close();
	    }
	}

}
