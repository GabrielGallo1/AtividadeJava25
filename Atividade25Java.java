package atividadeJava;

import java.util.Scanner;
public class Atividade25Java {

	public class SomaComNegativo {
	    
	    public static int lerNumero(Scanner scanner) {
	        System.out.println("Digite um numero: ");
	        return scanner.nextInt();
	    }
	    
	    public static int calcularSoma() {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        
	        while (true) {
	            int num = lerNumero(scanner);
	            if (num < 0) {
	                break;
	            }
	            soma += num;
	        }
	        
	        return soma;
	    }
	    
	    public static void main(String[] args) {
	        int soma = calcularSoma();
	        System.out.println("Soma dos numeros: " + soma);
	    }
	}

}
