function goToURL(title) {
    var para = new URLSearchParams();
    para.append("title", title);
    location.href = 'http://127.0.0.1:5500/products.html?' + title;
}

function incrementNumber() {
	
    var value = parseInt(document.getElementById("productQuantity").value,10);
	var value1 =parseFloat(document.getElementById("unitPrice").value,10);
	var qte=parseInt(document.getElementById("InStock").value,10);
	
	if (value<qte)
		value++;
	document.getElementById("Price").innerHTML = value*value1 + " Dhs";
    document.getElementById("productQuantity").value = value;
}


function decrementNumber() {
    var value = parseInt(document.getElementById("productQuantity").value,10);
	var value1 =parseFloat(document.getElementById("unitPrice").value,10);
	
	if (value>1)
		value--;
    document.getElementById("productQuantity").value = value;
	document.getElementById("Price").innerHTML = value*value1 + " Dhs";
}

(function(){
    $('#msbo').on('click', function(){
      $('body').toggleClass('msb-x');
    });
  }());

function accountPopUp() {
    document.querySelector(".userPopUp").classList.add("active");
}
function hidePopup() {
    document.querySelector('.userPopUp').classList.remove("active");
}

