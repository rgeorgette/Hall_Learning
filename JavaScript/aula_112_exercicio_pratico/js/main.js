class Animal {
    constructor(nome, idade) {
      this.nome = nome;
      this.idade = idade;
    }
}
  
class Cachorro extends Animal {
    constructor(nome, idade, raca) {
        super(nome, idade);
        this.raca = raca;
    }
}

class Gato extends Animal {
    constructor(nome, idade, cor) {
        super(nome, idade);
        this.cor = cor;
    }
}

class Pessoa {
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }

    static saudacao() {
        return 'Olá';
    }
}


class Estudante extends Pessoa {
    constructor(nome, idade, matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    estudar() {
        return this.nome + ' está estudando.';
    }
}

class Professor extends Pessoa {
    constructor(nome, idade, disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    ensinar() {
        return this.nome + ' está ensinando ' + this.disciplina;
    }
}

console.log(Pessoa.saudacao());

const estudante = new Estudante("João", 20, "12345");
console.log(estudante.estudar());

const professor = new Professor("Maria", 35, "Matemática");
console.log(professor.ensinar());
