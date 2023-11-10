package SegundoExercicios;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Esse numero e par ");
		}else {
			System.out.println("Esse numero e impar");
		
		}
		sc.close();
		
	}
	
}