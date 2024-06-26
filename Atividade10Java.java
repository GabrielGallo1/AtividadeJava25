package atividadeJava;

import java.util.Scanner;
public class Atividade10Java {

	public class SaldoReajuste {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o saldo: ");
	        double saldo = scanner.nextDouble();

	        double saldoReajustado = saldo * 1.015;

	        System.out.println("Saldo com reajuste de 1.5%: " + saldoReajustado);
	    }
	}

}
