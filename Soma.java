package SegundoExercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double valor_a;
		double valor_b;
		double soma;
		
		System.out.print("Digite o primeiro numero: ");
		valor_a = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		valor_b = sc.nextDouble();
		
	    soma = valor_a + valor_b;
	    
	    System.out.println("O resultado da soma e: " + soma );
		
	    sc.close();
	}
	
}
