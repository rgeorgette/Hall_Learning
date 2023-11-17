package aula368_atividades;

import java.util.Iterator;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int n1, idade, media;
		int r = 0;
		int r2 = 0;
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		
		for (int i = 0; i < n1; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = 0; i <= 15; i++) {
			r = r + i;
		}
		System.out.println("A soma dos números de 1 a 15 é " + r);
		
		for (int i = 0; i <= n1; i++) {
			if (i%2 == 0) {
				r2 = r2 + i;
			}
		}
		System.out.println("A soma dos números pares até " + n1 + " é " + r2);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite sua idade:");
			idade = sc.nextInt();
			soma = soma + idade;
		}
		media = soma / 20;
		System.out.println("A média de idade é " + media);

	}

}
