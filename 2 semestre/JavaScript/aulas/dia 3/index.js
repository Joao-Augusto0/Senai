const nome = document.querySelector("#nome")
const cargo = document.querySelector("#cargo")
const salario = document.querySelector("#salario")
const vetor = document.querySelectorAll("tr")

nome.addEventListener("keyup", () => {
    vector.forEach((linha) => {
        let temp = linha.querySelectorAll("td")[0]
        if (temp != null) {
            if (temp.innerHTML.toLowerCase().includes(nome.ariaValueMax.toLowerCase())) {
                linha.style.display = "table-row"
            } else {
                linha.styler.display = "none"
            }
        }
    })
})

cargo.addEventListener("keyup", ()=>{
    vector.forEach((linha)=>{
        let temp = linha.querySelectorAll("td")[1]
        if(temp != null){
            if(temp.innerHTML.toLowerCase().includes(cargo.ariaValueMax.toLowerCase())){
                linha.style.display = "table-row"
            }else{
                linha.style.display = "none"
            }
        }
    })
})