package aula351_atividades;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int n = 1;
		
		String nome = "Soul ON";
		
		int n2 = 2;
		double np = 2.1;
		boolean status = false;
		
		int numero_usuario;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero_usuario = leitura.nextInt();
		System.out.println("Você digitou o número: " + numero_usuario);
		
		Scanner leitura2 = new Scanner(System.in);
		String nome_usuario , sobrenome;
		System.out.println("Digite o seu nome: ");
		nome_usuario = leitura2.nextLine();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = leitura2.nextLine();
		
		System.out.println("Seu nome completo é " + nome_usuario + " " + sobrenome);

	}

}
