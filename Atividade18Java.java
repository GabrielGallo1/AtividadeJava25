package atividadeJava;

import java.util.Scanner;
public class Atividade18Java {

	public class PessoaMaisNova {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        String nomeMaisNovo = "";
	        int idadeMaisNova = Integer.MAX_VALUE;
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Digite o nome: ");
	            String nome = scanner.next();
	            
	            System.out.println("Digite a idade: ");
	            int idade = scanner.nextInt();
	            
	            if (idade < idadeMaisNova) {
	                idadeMaisNova = idade;
	                nomeMaisNovo = nome;
	            }
	        }
	        
	        System.out.println("A pessoa mais nova e: " + nomeMaisNovo);
	        
	        scanner.close();
	    }
	}

}
