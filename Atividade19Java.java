package atividadeJava;

import java.util.Scanner;
public class Atividade19Java {

	public class ConversaoDolar {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite a cotação do dólar:");
	        double cotacao = scanner.nextDouble();
	        
	        System.out.println("Digite a quantidade de dólares:");
	        double quantidade = scanner.nextDouble();
	        
	        double valorEmReais = cotacao * quantidade;
	        
	        System.out.println("Valor em reais: " + valorEmReais);
	        
	        scanner.close();
	    }
	}

}
