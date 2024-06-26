package atividadeJava;

import java.util.Scanner;
import java.util.Arrays;
public class Atividade04Java {

	public class OrdenarValues {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor de A: " + \n);
	        int A = scanner.nextInt();
	        System.out.println("Digite o valor de B: " + \n);
	        int B = scanner.nextInt();
	        System.out.println("Digite o valor de C: "  + \n);
	        int C = scanner.nextInt();

	        int[] valores = {A, B, C};
	        Arrays.sort(valores);

	        System.out.println("Valores em ordem decrescente: ");
	        for (int i = valores.length - 1; i >= 0; i--) {
	            System.out.println(valores[i]);
	        }
	    }
	}

}
