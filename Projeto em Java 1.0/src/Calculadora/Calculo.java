package Calculadora;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
	
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite um Número: ");
		x=leitor.nextInt();
		System.out.println("Digite um Segundo Número: ");
		y=leitor.nextInt();
		
		int soma = x + y;
		
		int subtracao = x - y;
		
		float multiplicacao = x * y;
		
		double divisao = x / y;
		
		float modulo = x % y;
		
		System.out.println("Soma:	"+soma);
		System.out.println("Subtração: "+subtracao);
		System.out.println("Multiplicação: "+multiplicacao);
		System.out.println("Divisão: "+divisao);
		System.out.println("Resto da Divisão: "+modulo);
		
	
		
		
				
				
			

	}

}
