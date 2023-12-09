package aula390_atividades;

public class Calculadora {
	public Calculadora() {
        System.out.println("Calculadora pronta para uso!");
    }

    public Calculadora(int n1, int n2) {
        int resultado = n1 + n2;
        System.out.println("Resultado da soma: " + resultado);
    }
}
