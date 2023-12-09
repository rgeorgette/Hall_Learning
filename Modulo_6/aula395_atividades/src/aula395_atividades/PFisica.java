package aula395_atividades;

public class PFisica extends Pessoa {
	public PFisica(String nome, int idade) {
        super(nome, idade);
    }

    public void mostrarNome() {
        System.out.println("Bem-vindo(a), " + nome + "!");
    }
}
