package dados;

import java.util.Scanner;
public class Requerimento_de_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, cidade;
		int idade;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		nome=leitor.next ();
		
	    System.out.println("Seja Bem Vindo! " + nome);
	    
	    System.out.println("Digite sua idade:");
	    idade=leitor.nextInt();
	    
	    System.out.println("Digite sua cidade:");
	    cidade=leitor.next();
	    	    
	    System.out.println("NOME:"+nome);
	    System.out.println("IDADE:"+idade);
	    System.out.println("CIDADE:"+cidade);
	    
	    
	    
	}
        	
	
				
				

}
