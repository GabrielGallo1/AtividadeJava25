package atividadeJava;

public class Atividade07java {
	public class Media {

	    public static void main(String[] args) {
	        int[] numeros1 = {8, 9, 7};
	        int[] numeros2 = {4, 5, 6};

	        double media1 = calcularMedia(numeros1);
	        double media2 = calcularMedia(numeros2);

	        double somaMedias = media1 + media2;
	        double mediaDasMedias = somaMedias / 2;

	        System.out.println("M�dia dos n�meros 8, 9 e 7: " + media1);
	        System.out.println("M�dia dos n�meros 4, 5 e 6: " + media2);
	        System.out.println("Soma das duas m�dias: " + somaMedias);
	        System.out.println("M�dia das m�dias: " + mediaDasMedias);
	    }

	    public static double calcularMedia(int[] numeros) {
	        int soma = 0;
	        for (int numero : numeros) {
	            soma += numero;
	        }
	        return (double) soma / numeros.length;
	    }
	}

}
