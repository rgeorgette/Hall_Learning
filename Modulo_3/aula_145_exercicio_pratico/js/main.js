document.getElementById("h1").innerHTML = screen.width + "x" + screen.height;
document.getElementById("p1").innerHTML = screen.colorDepth;
document.getElementById("p2").innerHTML = window.location.pathname + " " + window.location.port;

let x = document.getElementById("p3");
function getLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition);
  } else {
    x.innerHTML = "Geolocalização não suportada.";
  }
}

function showPosition(position) {
  x.innerHTML = "Latitude: " + position.coords.latitude +" / Longitude: " + position.coords.longitude;
}