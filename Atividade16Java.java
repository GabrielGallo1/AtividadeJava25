package atividadeJava;

import java.util.Scanner;
public class Atividade16Java {

	public class MediaIdades {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int soma = 0;
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite a idade:");
	            int idade = scanner.nextInt();
	            soma += idade;
	        }
	        
	        double media = soma / 20.0;
	        
	        System.out.println("A média das idades é: " + media);
	        
	        scanner.close();
	    }
	}

}
