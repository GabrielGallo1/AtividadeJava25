package atividadeJava;

import java.util.Scanner;
public class Atividade09Java {

	public class SalariosMin {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor do sal�rio do usu�rio:");
	        double salarioUsuario = scanner.nextDouble();

	        double salarioMinimo = 1212.00;
	        double quantidadeSalarios = salarioUsuario / salarioMinimo;

	        System.out.println("O usu�rio ganha " + quantidadeSalarios + " sal�rios m�nimos.");
	    }
	}

}
