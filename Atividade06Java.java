package atividadeJava;

import java.util.Scanner;
public class Atividade06Java {

	public class AntecessorSucess {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um numero: ");
	        int numero = scanner.nextInt();

	        System.out.println("Antecessor: " + (numero - 1));
	        System.out.println("Sucessor: " + (numero + 1));
	    }
	}

}
