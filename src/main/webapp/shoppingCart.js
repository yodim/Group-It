document.querySelector(".confirmButton").addEventListener("click", function(){
    document.querySelector(".confirmOrderPopUp").classList.add("active");
})

document.querySelector(".closeButton").addEventListener("click", function(){
    document.querySelector(".confirmOrderPopUp").classList.remove("active");
})

function deletePopUp(P_id,order_id){
     document.querySelector(".deleteProductPopUp").classList.add("active");
     document.getElementById("P_id").value = P_id;
     document.getElementById("order_id").value = order_id;
}