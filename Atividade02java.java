package atividadeJava;

import java.util.Scanner;
public class Atividade02java {

	public class VerificadorDivisivel {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um numero: ");
	        int numero = scanner.nextInt();

	        if (numero % 10 == 0) {
	            System.out.println("O numero e divisivel por 10");
	        } else if (numero % 5 == 0) {
	            System.out.println("O numero e divisivel por 5");
	        } else if (numero % 2 == 0) {
	            System.out.println("O numero e divisivel por 2");
	        } else {
	            System.out.println("O numero nao e divisivel por 10, 5 ou 2");
	        }
	    }
	}

}
