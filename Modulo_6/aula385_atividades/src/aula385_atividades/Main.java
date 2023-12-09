package aula385_atividades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal meuAnimal = new Animal();
        meuAnimal.exibirInformacoes();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.msgPessoa();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa2 = new Pessoa(nome, idade);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);

        scanner.close();

	}

}
