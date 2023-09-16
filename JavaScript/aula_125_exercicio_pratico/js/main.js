function validarForm(){
    const inpObj = document.getElementById("input");
    if (!inpObj.checkValidity()){
        document.getElementById("validado").innerHTML = inpObj.validationMessage;
    }else{
        document.getElementById("validado").innerHTML = "Input OK!";
    }
}

function botaoVoltar(){
    window.history.back();
}

function pegarLocalizacao(){
    if(navigator.geolocation){
        navigator.geolocation.getCurrentPosition(showPosition);
    }else{
        document.getElementById("localizacao").innerHTML = "Seu navegador não possui suporte para Geolocalização";
    }
}

function showPosition(position){
    document.getElementById("localizacao").innerHTML = "Latitude: " + position.coords.latitude + "<br>Longitude: " + position.coords.longitude;
}