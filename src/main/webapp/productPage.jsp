<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="css/productPage.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/stylesheet.css">
    <link rel="icon" href="images/favicon.png">
    <link rel="icon" href="images/favicon.png">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <title>Product page</title>
</head>
<body>

    <header>
       <nav class="navbar navbar-expand-lg navbar-light">
            <a class="navbar-brand" href="#"><img src="images/Logo.png" class="logo"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
          
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item dropdown">
                    <a class="nav-link" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Products
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    	<a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=14&session=0">ALL Categories</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=1&session=0">Women's Fashion</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=2&session=0">Men's Fashion</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=3&session=0">Phones</a>  
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=4&session=0">Computes,Office & Security</a>   
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=5&session=0">Electronics</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=6&session=0">Jewelry & Watches</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=7&session=0">Home ,Pet & Appliances</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=8&session=0">Bags & Shoes</a>  
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=9&session=0">Toys ,Kids & Babies</a>   
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=10&session=0">Outdoor Fun & Sports</a> 
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=11&session=0">Beauty,Health & Hair</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=12&session=0">Automobiles & Motorcycles</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=13&session=0">Others</a>   
                    </div>       
                </li>
                <li class="nav-item"><a class="nav-link" href="<%= request.getContextPath() %>/Amazon">AMAZON Products</a></li>
                <li class="nav-item"><a class="nav-link" href="#">About us</a></li>
                <li class="nav-item"><a class="nav-link registration" href="<%= request.getContextPath() %>/Welcome">Login</a></li>
                <li class="nav-item"><a class="nav-link registration" href="<%= request.getContextPath() %>/signup">Sign up</a></li>         
              </ul>
              <div class="form-inline my-2 my-lg-0">
                <a href="<%= request.getContextPath() %>/signup?session_id=1" class="signup">Sign up</a>
                <button class="btn btn-outline-success my-2 my-sm-0 login" type="submit" onclick="location.href='<%= request.getContextPath() %>/Welcome'">Login</button>
              </div>
            </div>
          </nav>
    </header>

    <main>
        <div class="container">
        <div class="container productCard">
            <div class="productImageCard">
              <div class="officialImage"><a href="#"><img class="officialImage" src="P_image.jsp?Product_id=${product.getProduct_id()}" alt=""></a></div>
              <div class="otherImages">
              </div>
            </div> 
            <div class="descriptionProduct">
              <div class="firstDiv">
                <div class="productTitle"><h3>${product.getP_name()}</h3></div>
                <div class="descriptionPro">
                	${product.getP_Description()}
                </div>
             
                <input type="hidden" name="Product_id" value="${product.getProduct_id()}" >
               
                <div>
                Unit-Price :&nbsp;<input name="P_UnitPrice" id="unitPrice" type="text" value="${product.getP_UnitPrice()}" class="unitPrice"> &nbsp;&nbsp;
                In Stock : &nbsp; <input type="text" value="${product.getP_Quantity()}" id="InStock" class="Stock">
                </div>
                
                <br>
                <h4><div class="ProPrice" id="Price">${product.getP_UnitPrice()} Dhs</div></h4>
          			<br>
                  <div class="quantityNum">
                    <a class="qteButtons" onclick="decrementNumber()"><h3>-</h3></a>
                    <input disabled type="text" id="productQuantity" value="1" class="productQuantity">
                    <a class="qteButtons" onclick="incrementNumber()"><h3>+</h3></a>                  
                  </div> 
                 	<button  onclick="location.href='<%= request.getContextPath() %>/signup?session_id=0'" class="Add">ADD TO CART</button>
                
                </div>
              </div>
            </div>
        

    </main>
    
</div>
    <footer  >
      <img src="images/Logo.png" alt="" class="footerLogo">
      <div class="verticalLine"></div>
      <div class="ContactUs">
          <div class="brandInfos">
              <div class="brandIcons">
                  <img src="images/call.png" class="callIcon"><br/>
                  <img src="images/email.png" class="emailIcon">
              </div>
              <div class="brandData">
                  <p class="brandNumber"> +212-623689100</p>
                  <p class="brandEmail">  contact@Groupit.com</p>
              </div>
          </div>
      </div>
  </footer>


    <script src="bootstrap/jquery-3.6.0.min.js"></script>
    <script src="bootstrap/bootstrap.min.js"></script>
    <script src="bootstrap/script.js"></script>
    <script src="script.js"></script>
    
    
</body>
</html>