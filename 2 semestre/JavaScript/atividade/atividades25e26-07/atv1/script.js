const button = document.querySelector("button")


function validarPlaca(placa) {
    document.createElement("button")
    button.addEventListener("click", () => {
        if (placa.length == 7) {
            if (includes(button.value)) {
                if (isNaN(placa[0]) && isNaN(placa[1]) && isNaN(placa[2])) {
                    if (isNaN(placa[3]) == false && (isNaN(placa[4]) == false || isNaN(placa[4]) == true) && isNaN(placa[5]) == false && isNaN(placa[6]) == false) {
                        console.log("placa valida")
                    } else {
                        console.log("placa invalida")
                    }
                } else {
                    console.log("placa invalida")
                }
            } else {
                console.log("Placa Inválida por Exceder o Limite de Caracteres")
            }
        }
    })
}