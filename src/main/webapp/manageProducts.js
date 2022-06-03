//The AddProduct Ppop up :
document.querySelector("#AddProductWindow").addEventListener("click", function(){
    document.querySelector(".AddProductPopUp").classList.add("active");
})

document.querySelector(".AddProductPopUp .closeBtn").addEventListener("click", function(){
    document.querySelector(".AddProductPopUp").classList.remove("active");
})


function updatePopUp(id,name,category_id,description,quantity,unitprice){ 
     document.querySelector(".UpdateProductPopUp").classList.add("active");
     document.getElementById("Product_id").value = id;
     document.getElementById("Category_id").value = category_id;
     document.getElementById("P_name").value = name;
     document.getElementById("P_description").value = description;
     document.getElementById("P_Quantity").value = quantity;
     document.getElementById("P_UnitPrice").value = unitprice;
     
}


function accountPopUp() {
    document.querySelector(".userPopUp").classList.add("active");
}
function hidePopup() {
    document.querySelector('.userPopUp').classList.remove("active");
}
                               	
function deletePopUp(id){
     document.querySelector(".deleteProductPopUp").classList.add("active");
     document.getElementById("P_id").value = id;
}

function promotionPopUp(){
	document.querySelector(".promotionProductPopUp").classList.add("active");
}


$('#file-upload').change(function() {
    var i = $(this).prev('label').clone();
    var file = $('#file-upload')[0].files[0].name;
    $(this).prev('label').text(file);
});
$('#file-uploadd').change(function() {
    var i = $(this).prev('label').clone();
    var file = $('#file-uploadd')[0].files[0].name;
    $(this).prev('label').text(file);
});

//The delete product pop up :








