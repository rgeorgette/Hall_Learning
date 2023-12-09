package aula395_atividades;

public class PJuridica extends Pessoa {
	public PJuridica(String nome, int idade) {
        super(nome, idade);
    }

    public void mostrarNome() {
        System.out.println("Nome da empresa: " + nome);
    }
}
