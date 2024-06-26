package atividadeJava;

import java.util.Scanner;
public class Atividade15Java {

	public class SomaIdades {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int soma = 0;
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite a idade: ");
	            int idade = scanner.nextInt();
	            soma += idade;
	        }
	        
	        System.out.println("A soma das idades e: " + soma);
	        
	        scanner.close();
	    }
	}

}
