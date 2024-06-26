package atividadeJava;

import java.util.Scanner;
public class Atividade03Java {

	public class Credito {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o saldo medio do ultimo ano: ");
	        double SaldoM = scanner.nextDouble();
	        double credito;

	        if (SaldoM >= 0 && SaldoM <= 200) {
	            credito = 0;
	        } else if (SaldoM <= 400) {
	            credito = SaldoM * 0.2;
	        } else if (SaldoM <= 600) {
	            credito = saldoMedio * 0.3;
	        } else {
	            credito = SaldoM * 0.4;
	        }

	        System.out.println("Saldo medio: " + saldoMe);
	        System.out.println("Valor do credito: " + credito);
	    }
	}

}
