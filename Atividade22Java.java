package atividadeJava;

import java.util.Scanner;
public class Atividade22Java {

	public class NumerosEntreZeroCem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int contador = 0;
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite um Numero: ");
	            int Num = scanner.nextInt();
	            if (Num >= 0 && Num <= 100) {
	                contador++;
	            }
	        }
	        
	        System.out.println("Quantidade de Numeros entre 0 e 100: " + contador);
	        
	        scanner.close();
	    }
	}

}
