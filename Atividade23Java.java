package atividadeJava;

import java.util.Scanner;
public class Atividade23Java {

	public class NumerosComIntervalos {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int 0a100 = 0;
	        int 101a200 = 0;
	        int maiorQ200 = 0;
	        
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite um Numero:");
	            int Num = scanner.nextInt();
	            if (Num >= 0 && Num <= 100) {
	                0a100++;
	            } else if (Num >= 101 && Num <= 200) {
	                101a200++;
	            } else if (Num > 200) {
	                maiorQ200++;
	            }
	        }
	        
	        System.out.println("Quantidade de numeros entre 0 e 100: " + 0a100);
	        System.out.println("Quantidade de numeros entre 101 e 200: " + 101a200);
	        System.out.println("Quantidade de numeros maiores que 200: " + maiorQ200);
	        
	        scanner.close();
	    }
	}

}
