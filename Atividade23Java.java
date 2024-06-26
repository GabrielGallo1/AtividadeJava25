package atividadeJava;

import java.util.Scanner;
public class Atividade23Java {

	public class NumerosEmIntervalos {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int entre0e100 = 0;
	        int entre101e200 = 0;
	        int maioresQue200 = 0;
	        
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Digite um n�mero:");
	            int numero = scanner.nextInt();
	            if (numero >= 0 && numero <= 100) {
	                entre0e100++;
	            } else if (numero >= 101 && numero <= 200) {
	                entre101e200++;
	            } else if (numero > 200) {
	                maioresQue200++;
	            }
	        }
	        
	        System.out.println("Quantidade de n�meros entre 0 e 100: " + entre0e100);
	        System.out.println("Quantidade de n�meros entre 101 e 200: " + entre101e200);
	        System.out.println("Quantidade de n�meros maiores que 200: " + maioresQue200);
	        
	        scanner.close();
	    }
	}

}
