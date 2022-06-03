function setCategoryTitle (title) {
    debugger
    document.getElementById("productsName").innerHTML = title;
}

function loadFunction() {
    debugger
    var para = new URLSearchParams(window.location.search);
    var title = para.get("title");
}