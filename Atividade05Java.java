package atividadeJava;

import java.util.Scanner;
public class Atividade05Java {

	public class ClassEleitoral {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a idade: ");
	        int idade = scanner.nextInt();

	        if (idade < 16) {
	            System.out.println("Nao eleitor");
	        } else if (idade >= 18 && idade < 65) {
	            System.out.println("Eleitor obrigatorio");
	        } else {
	            System.out.println("Eleitor facultativo");
	        }
	    }
	}

}
