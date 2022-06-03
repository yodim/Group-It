<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/stylesheet.css">
    <link rel="stylesheet" href="css/landingContainer.css">
    <link rel="stylesheet" href="css/sellerContainer.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="icon" href="images/Logo.png">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Limelight&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Josefin+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/7f31bd8dc8.css">
    <title>Groupit</title>
</head>
<body>

    <!-- Header nicely done -->
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
                <li class="nav-item"><a class="nav-link registration" href="<%= request.getContextPath() %>/signup?session_id=1">Sign up</a></li>         
              </ul>
              <div class="form-inline my-2 my-lg-0">
                <a href="<%= request.getContextPath() %>/signup?session_id=1" class="signup">Sign up</a>
                <button class="btn btn-outline-success my-2 my-sm-0 login" type="submit" onclick="location.href='<%= request.getContextPath() %>/Welcome'">Login</button>
              </div>
            </div>
          </nav>
    </header>
    <!------------------------>
    

    <main>

        <div class="container">
            <div class="row landingContainer col-lg-12 col-md-12 col-sm-12 col-12">
                <div class="landingLeftContainer col-lg-5 col-md-5 col-sm-12 col-12">
                    <p class="firstSlogan">All what you will<br/> ever need,<br/> curated for you </p>
                    <button class="discoverProducts">Discover products</button>
                </div>
                <div class="imageContainer col-lg-7 col-md-7">
                    <img src="images/firstImage.png" alt="" class="firstImage">
                </div>
            </div>
        </div>


       
        <!---------------------------------------->
        
        <!-- Titles nicely done -->
        <br/>
        <h4 class="youAreSeller">You are a seller ?</h4>
        <div class="horizontalLine"></div>
        <br/>
        <!------------------------> 


        <div class="sellerContainer container">
            <div class="row theContainer col-lg-12 col-md-12 col-sm-12">
                <div class="imageContainer2 col-lg-6 col-md-6 col-sm-6 col-12">
                    <img src="images/sellerImage.png" class="sellerImage">
                </div>
                <div class="sellerText col-lg-6 col-md-6 col-sm-6 col-12">
                    <p class="sellerDescription">Sell your products<br/>and manage your<br/>stock even while<br/>you are away.</p>
                    <button class="getStarted">Get started</button>
                </div>
            </div>
        </div>

    </main>

    <footer>
    	<div>
    	<br>
         <img src="images/Logo.png" alt="" class="footerLogo">
         </div>
        <div class="verticalLine"></div>
        <div class="ContactUs">
            <div class="brandInfos">
                <div class="brandIcons">
                	<br>
                    <img src="images/call.png" class="callIcon"><br/>
                    <img src="images/email.png" class="emailIcon">
                </div>
                <div class="brandData">
                	<br>
                    <p class="brandNumber"> +212-623689100</p>
                    <p class="brandEmail">  contact@Groupit.com</p>
                </div>
            </div>
        </div>
    </footer>


    <script src="bootstrap/jquery-3.6.0.min.js"></script>
    <script src="bootstrap/bootstrap.min.js"></script>
    <script src="bootstrap/script.js"></script>

</body>
</html>
