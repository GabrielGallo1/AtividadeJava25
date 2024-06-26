package atividadeJava;

import java.util.Scanner;
import java.util.Arrays;
public class Atividade04Java {

	public class OrdenarValues {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor de A: ");
	        int A = scanner.nextInt();
	        System.out.println("Digite o valor de B: ");
	        int B = scanner.nextInt();
	        System.out.println("Digite o valor de C:" );
	        int C = scanner.nextInt();

	        int[] valores = {A, B, C};
	        Arrays.sort(valores);

	        System.out.println("Valores em ordem decrescente:");
	        for (int i = valores.length - 1; i >= 0; i--) {
	            System.out.println(valores[i]);
	        }
	    }
	}

}
