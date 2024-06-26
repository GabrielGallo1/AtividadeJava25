package atividadeJava;

import java.util.Scanner;
public class Atividade21Java {

	public class Prestacoes {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o valor da CP: ");
	        double VCP = scanner.nextDouble();
	        
	        double VPrestacao = VCP / 5;
	        
	        System.out.println("Valor de cada prestacao: " + VPrestacao);
	        
	        scanner.close();
	    }
	}

}
