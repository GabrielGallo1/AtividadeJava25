package atividadeJava;

import java.util.Scanner;
public class Atividade03Java {

	public class Credito {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o saldo m�dio do �ltimo ano:");
	        double saldoMedio = scanner.nextDouble();
	        double credito;

	        if (saldoMedio >= 0 && saldoMedio <= 200) {
	            credito = 0;
	        } else if (saldoMedio <= 400) {
	            credito = saldoMedio * 0.2;
	        } else if (saldoMedio <= 600) {
	            credito = saldoMedio * 0.3;
	        } else {
	            credito = saldoMedio * 0.4;
	        }

	        System.out.println("Saldo m�dio: " + saldoMedio);
	        System.out.println("Valor do cr�dito: " + credito);
	    }
	}

}
