package SegundoExercicios;

import java.util.Scanner;

public class Pessoa {
	
	// Atributos (variáveis de instância)
	
	public String nome;
	public int idade;
	public double cpf;
	public String endereco;
	
	// Construtor
	
	 public Pessoa (String nome, int idade, double cpf ,String endereco ) {
		 
		 this.nome = nome;
		 this.idade = idade;
		 this.cpf = cpf;
		 this.endereco = endereco;
		  
	}
	 public void mostrarInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("cpf: " + cpf);
	        System.out.println("Endereço: " + endereco);
	        
	 }
	        public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("Digite o nome: ");
	            String nome = scanner.nextLine();

	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();

	            System.out.print("Digite o CPF: ");
	            double cpf = scanner.nextDouble();

	            // Limpar o buffer do scanner
	            scanner.nextLine();

	            System.out.print("Digite o endereço: ");
	            String endereco = scanner.nextLine();

	            Pessoa pessoa1 = new Pessoa(nome, idade, cpf, endereco);
	            pessoa1.mostrarInformacoes();

	            // Fechar o scanner
	            scanner.close();
	        }
	    }
