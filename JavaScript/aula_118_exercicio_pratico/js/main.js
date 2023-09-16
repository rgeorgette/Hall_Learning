function myDisplayer(some) {
    document.getElementById("demo").innerHTML = some;
}

function myDisplayer2(some) {
    document.getElementById("demo2").innerHTML = some;
}

function myDisplayer3(some){
    document.getElementById("demo3").innerHTML = some;
}

function myDisplayer4(some){
    document.getElementById("demo4").innerHTML = some;
}

function myDisplayer5(some){
    document.getElementById("demo5").innerHTML = some;
}

function myDisplayer6(some){
    document.getElementById("demo6").innerHTML = some;
}

function calcular(numero, callback) {
      let resultado = numero * 2;
      callback(resultado);
}
  
calcular(5, myDisplayer);

function calcular2(num1, num2, callback) {
    let sum = num1 + num2;
    callback(sum);
}

calcular2 (5,5,myDisplayer2)

let promiseResolvida = new Promise(function(resolve, reject){
    let x = 0;

    if (x == 0){
        resolve("OK")
    } else {
        reject("Error");
    }
});

promiseResolvida.then(
    function(value) {myDisplayer3(value);},
    function(error) {myDisplayer3(error);}
)

let promiseRejeitada = new Promise(function(resolve, reject){
    let x = 1;

    if (x == 0){
        resolve("OK")
    } else {
        reject("Error");
    }
});

promiseRejeitada.then(
    function(value) {myDisplayer4(value);},
    function(error) {myDisplayer4(error);}
)

async function async(){
    let myPromise = new Promise(function(resolve,reject){
        resolve("Resolvida!");
    });
    document.getElementById("demo5").innerHTML = await myPromise;
}
async();