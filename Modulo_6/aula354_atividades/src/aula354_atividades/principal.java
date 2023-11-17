package aula354_atividades;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int n1, n2, resultado, resultado_mult, resultado_sub;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		resultado = n1 + n2;
		resultado_mult = n1 * n2;
		resultado_sub = n1 - n2;
		
		System.out.println("O resultado da soma é: " + resultado);
		System.out.println("O resultado da multiplicação é: " + resultado_mult);
		System.out.println("O resultado da subtração é: " + resultado_sub);
		
		System.out.println("Valor de resultado incrementado: "+ ++resultado);
		
		int n3 = 10;
		System.out.println("Valor de n3 decrementado: "+ --n3);
		
		int somaValores = n1 + n2 + n3;
		System.out.println("A soma dos 3 valores é: " + somaValores);
		

	}

}
