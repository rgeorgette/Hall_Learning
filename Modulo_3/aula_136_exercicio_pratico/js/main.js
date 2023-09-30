const h1 = document.getElementById("h1");
const p1 = document.getElementById("p1");
const p2 = document.getElementById("p2");
const p3 = document.getElementById("p3");
const h2 = document.getElementById("h2");
const p4 = document.getElementById("p4");

p1.innerHTML = "Paragráfo 1 Modificado";
p2.innerHTML = "Paragráfo 2 Modificado";
p3.innerHTML = "Paragráfo 3 Modificado";

function validateForm(){
    let x = document.forms["form"]["nome"].value;
    if (x == ""){
        alert("Campo deve ser preenchido!");
        return false;
    }
}

function alterarH2(){
    h2.innerHTML = "Clique no Botão 2 para ver a data";
}

function mostrarData(){
    p4.innerHTML = Date();
}