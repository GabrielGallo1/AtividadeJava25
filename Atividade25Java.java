package atividadeJava;

import java.util.Scanner;
public class Atividade25Java {

	public class SomaAteNegativoFuncoes {
	    
	    public static int lerNumero(Scanner scanner) {
	        System.out.println("Digite um número:");
	        return scanner.nextInt();
	    }
	    
	    public static int calcularSoma() {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        
	        while (true) {
	            int numero = lerNumero(scanner);
	            if (numero < 0) {
	                break;
	            }
	            soma += numero;
	        }
	        
	        return soma;
	    }
	    
	    public static void main(String[] args) {
	        int soma = calcularSoma();
	        System.out.println("Soma dos números: " + soma);
	    }
	}

}
