package aula385_atividades;

class Pessoa {
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

	void msgPessoa() {
        System.out.println("Olá usuário");
    }

}
