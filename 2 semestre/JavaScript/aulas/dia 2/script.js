
// // var texto = document.getElementsByTagName(h1)

// // //console.log(texto)

// // var titulo = document.getElementById("titulo")

// // //console.log(titulo)

// // titulo.inneHTML = "rodolfo careca"

// // var aluno = {
// //     nome:"fulano",
// //     matricula:234578
// // }

// // titulo.inneHTML = `Nome : ${aluno.nome} </br> Matricula : ${aluno.matricula}`

// // titulo.style.color = "red"

// // titulo.style.margin = "200px"

// // var mensagem = document.getElementById("mensagem")

// // mensagem.style.display = "block"

// // var divisao = document.getElementsByClassName = ("divisao")

// // // document.quarySelector()
// // // document.quarySelectorAll()

// var titulo2 = document.querySelector("#titulo")
// var div = document.querySelectorAll(".divisao")
// var msg = document.querySelector("h1")

// console.log(div)

var busca = document.querySelector("#busca")
var linhas = document.querySelectorAll("tr")
var btBusca = document.querySelector("button")

btBusca.addEventListener("click", buscarNome)
busca.addEventListener("keyup", buscarNome)

function buscarNome() {
    let encontrei = false

    linhas.forEach((Linha) => {
        let temp = Linha.querySelector("td")
        if (temp != null) {
            // if (temp.innerHTML.toLowerCase() == busca.value.toLowerCase()) {
            //     alert("Encontrei")
            //     encontrei = true
            //     Linha.style.fontWeight = "bold"
            //     Linha.style.color = "pink"
            // }
            // if(temp.innerHTML.toLowerCase().includes(busca.value.toLowerCase())){
            //     Linha.style.display = "table-row"
            // }else{
            //     Linha.style.display = "none"
            // }
            if (Linha.innerHTML.toLowerCase().includes(busca.value.toLowerCase())) {
                Linha.style.display = "table-row"
            } else {
                Linha.style.display = "none"
            }
        }
    })

    //if(!encontrei) alert ("Nao Encontrei")

}



// let v1 = 1;
// let v2 = "1";

// if(v1 == v2){
//     console.log("somos iguais")
// }