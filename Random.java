package SegundoExercicios;

import java.util.random.RandomGenerator;

public class Random {

	public static void main(String[] args) {

		Random random = new Random();
		
		int total = 0;
		
		for (int i =0; i <3; i++) {
			
			int dado = ((RandomGenerator) random).nextInt(6) + 1;
			total += dado;
			
			System.out.println("jogada" + (i+1) + ":" + dado);
		
		}
		 System.out.println("total:" + total);
		
	}

}