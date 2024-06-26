package atividadeJava;

import java.util.Scanner;
public class Atividade09Java {

	public class SalariosMin {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor do salário do usuário:");
	        double salarioUsuario = scanner.nextDouble();

	        double salarioMinimo = 1212.00;
	        double quantidadeSalarios = salarioUsuario / salarioMinimo;

	        System.out.println("O usuário ganha " + quantidadeSalarios + " salários mínimos.");
	    }
	}

}
