var button = document.querySelector("#button")
var input = document.querySelector("#input")
var Res = document.querySelector("#Res")

button.addEventListener("click", () => {
    let resposta = validarPlaca(input.value)
    Res.innerHTML = resposta
})

function validarPlaca(placa) {
    if (placa.length == 7) {
        if (isNaN(placa[0]) && isNaN(placa[1]) && isNaN(placa[2])) {
            if (isNaN(placa[3]) == false && (isNaN(placa[4]) == false || isNaN(placa[4]) == true) && isNaN(placa[5]) == false && isNaN(placa[6]) == false) {
                return "placa valida"
            } else {
                return "placa invalida"
            }
        } else {
            return "placa invalida"
        }
    } else {
        return "Placa Inválida"
    }
}

var inputCpf = document.querySelector("#inputCpf");
var ResCpf = document.querySelector("#ResCpf");
var buttonCpf = document.querySelector("#buttonCpf");

buttonCpf.addEventListener("click", () => {
    let resp = validaCPF(inputCpf.value);
    ResCpf.innerHTML = resp;
});

function validaCPF(cpf) {

    let mult
    let soma = 0
    let indice = 0
    let resto

    if (cpf.length == 11) {
        for (let i = 10; i >= 2; i--) {
            mult = i * cpf[indice]
            soma += mult
            indice++
        }
        resto = (soma * 10) % 11

        if (resto == 10 || resto == 11) {
            resto = 0
        }

        if (resto != cpf[9]) {
            return "Cpf invalido"
        } else {
            indice = 0
            soma = 0
            for (let i = 11; i >= 2; i--) {
                mult = i * cpf[indice]
                soma += mult
                indice++
            }
            resto = (soma * 10) % 11
            if (resto == cpf[10]) {
                return "Cpf valido"
            } else {
                return "Cpf invalido"

            }
        }
    } else {
        return "cpf invalido"
    }
}