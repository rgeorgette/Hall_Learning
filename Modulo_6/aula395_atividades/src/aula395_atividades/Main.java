package aula395_atividades;

public class Main {

	public static void main(String[] args) {
        PFisica pessoaFisica = new PFisica("João", 30);
        pessoaFisica.mostrarNome();

        PJuridica pessoaJuridica = new PJuridica("Empresa ABC", 5);
        pessoaJuridica.mostrarNome();

        Animal animal = new Animal();
        animal.informacoesAnimal("Cachorro", 3);
        animal.informacoesAnimal("Gato", 2, "Felino");
    }

}
