
//vérification annee naissance
var naissance = document.querySelector("#mobile");
var regex = /^[0-9]{4}$/g;

naissance.addEventListener("keyup", function () {
    if (!regex.test(naissance.value) ){
        naissance.focus();
        document.querySelector(".error").innerHTML = '<p style="color:red">Merci de saisir une date de naissance correcte</p>';
        return false;
    }else {
        document.querySelector(".error").innerHTML = '';
    }
})