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
       <link rel="stylesheet" href="css/sideBar.css">
    <link rel="stylesheet" href="css/manageOrders.css">
    <link rel="stylesheet" href="css/mngProduct.css">
    <link rel="icon" href="images/favicon.png">
    
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
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
                <li class="nav-item active"><a class="nav-link" href="index.html">Home</a></li>
                <li class="nav-item dropdown">
                    <a class="nav-link" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Products
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    	<a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=14&session=1&user_id=${user.getUser_id()}">ALL Categories</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=1&session=1&user_id=${user.getUser_id()}">Women's Fashion</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=2&session=1&user_id=${user.getUser_id()}">Men's Fashion</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=3&session=1&user_id=${user.getUser_id()}">Phones</a>  
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=4&session=1&user_id=${user.getUser_id()}">Computes,Office & Security</a>   
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=5&session=1&user_id=${user.getUser_id()}">Electronics</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=6&session=1&user_id=${user.getUser_id()}">Jewelry & Watches</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=7&session=1&user_id=${user.getUser_id()}">Home ,Pet & Appliances</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=8&session=1&user_id=${user.getUser_id()}">Bags & Shoes</a>  
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=9&session=1&user_id=${user.getUser_id()}">Toys ,Kids & Babies</a>   
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=10&session=1&user_id=${user.getUser_id()}">Outdoor Fun & Sports</a> 
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=11&session=1&user_id=${user.getUser_id()}">Beauty,Health & Hair</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=12&session=1&user_id=${user.getUser_id()}">Automobiles & Motorcycles</a>
                        <a class="dropdown-item"  href="<%= request.getContextPath() %>/products?category_id=13&session=1&user_id=${user.getUser_id()}">Others</a>   
                    </div>
                </li>
                <li class="nav-item"><a class="nav-link" href="<%= request.getContextPath() %>/Amazon">AMAZON Products</a></li>
                <li class="nav-item"><a class="nav-link" href="#">About us</a></li>
              </ul>
              <div class="form-inline my-2 my-lg-0">
                <a href="#" class="shopping-bag"><i class="fas fa-shopping-bag"></i></a>
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="location.href='#'"><span>Hi, ${user.getFirstname()}</span> <span><i class="fas fa-user-circle"></i></span> </button>
              </div>
            </div>
          </nav>
           </header>

    <main>
        <div class="sideBar">
            
            <div class="profileImageSideBar">
                <img src="images/inconnu.jpg" alt="My Image" class="profileImage">
                <h4 class="userName">${user.getFirstname()}</h4>
            </div>
            <a href="<%= request.getContextPath() %>/MyAccount1?user_id=${user.getUser_id()}" class="SideBarItems "><i class="far fa-user-circle"></i> <span>Account</span></a>
            <a href="<%= request.getContextPath() %>/MyShoppingCart?user_id=${user.getUser_id()}" class="SideBarItems "><i class="fas fa-shopping-cart"></i> <span>My Orders on Hold</span></a>
            <a href="" class="SideBarItems "><i class="fas fa-tag"></i> <span>My Confirmed Orders</span></a>
            <a href="" class="SideBarItems "><i class="far fa-heart"></i> <span>My WishList</span></a>
            <a href="" class="SideBarItems "><i class="far fa-chart-bar"></i> <span>My History</span></a>
            <a href="" class="SideBarItems "><i class="fas fa-truck"></i> <span>Track my Orders</span></a>

        	</div>
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
             	<form action="<%= request.getContextPath() %>/MyCart?user_id=${user.getUser_id()}" id="form2" method="post">
                <input type="hidden" name="Product_id" value="${product.getProduct_id()}" >
                <div>
                Unit-Price :&nbsp;<input form="form2" name="P_UnitPrice" id="unitPrice" type="text" value="${product.getP_UnitPrice()}" class="unitPrice"> &nbsp;&nbsp;
                In Stock : &nbsp; <input type="text" value="${product.getP_Quantity()}" id="InStock" class="Stock">
                </div>
                
                <br>
                <h4><div class="ProPrice" id="Price">${product.getP_UnitPrice()} Dhs</div></h4>
          			<br>
                  <div class="quantityNum">
                    <a class="qteButtons" onclick="decrementNumber()"><h3>-</h3></a>
                    <input  name="P_Quantity" form="form2" type="text" id="productQuantity" value="1" class="productQuantity">
                    <a class="qteButtons" onclick="incrementNumber()"><h3>+</h3></a>                  
                  </div> 
                 	<button class="Add" type="submit" form="form2" >ADD TO CART</button>
                	</form>
                </div>
                
              </div>
              
            </div>
        	
	<div class="userPopUp">

                <div class="profileImageDiv">
                <img src="images/inconnu.jpg" alt="omar" class="profileImage">
                <span class="UserName">Hi, ${user.getFirstname()}</span>
                <hr class="HorizontalLine">
            </div>
                <div class="OptionsDiv OptionsDiv1">
                    <a href="#" class="accountOptions"><i class="far fa-user-circle accountOptionsIcons"></i> Your account</a>
                </div>
                <div class="OptionsDiv">
                    <a href="#" class="accountOptions"><i class="fas fa-shopping-bag accountOptionsIcons"></i> Your cart</a>
                </div>
                <div class="OptionsDiv">
                    <a href="#" class="accountOptions"><i class="far fa-question-circle accountOptionsIcons"></i> Help</a>
                </div>
                <div class="OptionsDiv">
                    <a href="#" class="accountOptions"><i class="far fa-comment-dots accountOptionsIcons"></i> Send feedback</a>
                </div>
                <div class="OptionsDiv">
                    <a href="#" class="accountOptions"><i class="fas fa-sign-out-alt accountOptionsIcons"></i> Sign out</a>
                </div>
    
            </div>
            

        </div>
        
    </main>


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