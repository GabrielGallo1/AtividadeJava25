package atividadeJava;

import java.util.Scanner;
public class Atividade11Java {

	public class SalarioVendedor {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome do vendedor:");
	        String nome = scanner.nextLine();

	        System.out.println("Digite o sal�rio fixo:");
	        double salarioFixo = scanner.nextDouble();

	        System.out.println("Digite o total de vendas efetuadas no m�s:");
	        double vendas = scanner.nextDouble();

	        double comissao = vendas * 0.15;
	        double salarioFinal = salarioFixo + comissao;

	    	}
	    }
	}
	
