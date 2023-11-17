package aula364_atividades;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int n1, n2, idade;
		char letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		
		if (n1%2 == 0) {
			System.out.println("O número digitado é par!");
		} else {
			System.out.println("O número digitado é ímpar!");
		}
		
		System.out.println("Digite outro número: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("O número " + n1 + " é maior que " + n2);
		} else {
			System.out.println("O número " + n1 + " não é maior que " + n2);
		}
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		System.out.println("Digite uma letra: ");
		letra = sc.next().charAt(0);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra é uma vogal");
		} else {
			System.out.println("A letra é uma consoante");
		}

	}

}