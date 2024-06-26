package atividadeJava;

import java.util.Scanner;
public class Atividade08Java {

	public class ValorTotalIPI {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a porcentagem do IPI:");
	        double ipi = scanner.nextDouble();

	        System.out.println("Digite o código da peça 1:");
	        int codigoPeca1 = scanner.nextInt();
	        System.out.println("Digite o valor unitário da peça 1:");
	        double valorPeca1 = scanner.nextDouble();
	        System.out.println("Digite a quantidade da peça 1:");
	        int quantidadePeca1 = scanner.nextInt();

	        System.out.println("Digite o código da peça 2:");
	        int codigoPeca2 = scanner.nextInt();
	        System.out.println("Digite o valor unitário da peça 2:");
	        double valorPeca2 = scanner.nextDouble();
	        System.out.println("Digite a quantidade da peça 2:");
	        int quantidadePeca2 = scanner.nextInt();

	        double valorTotal = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (ipi / 100 + 1);

	        System.out.println("Valor total a ser pago: " + valorTotal);
	    }
	}

}
