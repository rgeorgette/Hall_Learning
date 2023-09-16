const cidade = {
    nome: "Lençóis Paulista",
    estado: "São Paulo",
    pais: "Brasil",
    get completo(){
        return this.nome + " / " + this.estado + " - " + this.pais
    }
}

const cidade2 = {
    nome: "Bauru",
    estado: "São Paulo",
    pais: "Brasil"
}

const cidade3 = {
    nome: "Ourinhos",
    estado: "São Paulo",
    pais: "Brasil"
}

const cidade4 = {
    nome: "Marilia",
    estado: "São Paulo",
    pais: "Brasil"
}   

const cidade5 = {
    nome: "Agudos",
    estado: "São Paulo",
    pais: "Brasil"
}

function Pessoa(nome,sobrenome,idade) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
}

const pai = new Pessoa("Paulo","Georgette","70");
console.log(pai);

function Carro(marca,modelo,cor){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
}

const fusca = new Carro();
fusca.marca = "VW";
fusca.modelo = "Fusca";
fusca.cor = "Azul";
console.log(fusca);

for (let x in cidade){
    console.log(cidade[x]);
}

for (let x in cidade2){
    console.log(cidade2[x]);
}

console.log(cidade.completo);