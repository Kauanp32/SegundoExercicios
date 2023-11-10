package SegundoExercicios;

import javax.swing.JOptionPane;

public class Farmacia {

	public static void main(String[] args) {

		 JOptionPane.showMessageDialog(null, "Digite o valor atual dos medicamentos para que seja acrescido 12% em cima do mesmo:\nOu digite 0 para sair:");
	        
	        while (true) {
	            double valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do produto:"));
	            
	            if (valorProduto == 0)
	                break;
	            
	            double novoValor = valorProduto * 1.12;
	            
	            JOptionPane.showMessageDialog(null, "O valor com reajuste de 12% passou a ser: " + Math.round(novoValor));
	        }
	        
	        JOptionPane.showMessageDialog(null, "Programa encerrado.");
	    
	    }
	
	}