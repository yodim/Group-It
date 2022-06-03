<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/delete.css">
    <link rel="icon" href="images/favicon.png">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <title>Document</title>
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
                      <a class="dropdown-item" onclick=GoToInforamtique() href="products.html">Electronics</a>
                        <a class="dropdown-item" onclick="GoToHabillement();" href="products.html">Computers</a>
                        <a class="dropdown-item" onclick="GoToMaison()" href="products.html">Men's Fashion</a>  
                        <a class="dropdown-item" onclick="GoToMaison()" href="products.html">Women's Fashion</a>   
                        <a class="dropdown-item" onclick="GoToMaison()" href="products.html">Health</a> 
                    </div>
                </li>
                <li class="nav-item"><a class="nav-link" href="<%= request.getContextPath() %>/Amazon">AMAZON Products</a></li>
                <li class="nav-item"><a class="nav-link" href="#">About us</a></li>
                <li class="nav-item"><a class="nav-link registration" href="login.html">Login</a></li>
                <li class="nav-item"><a class="nav-link registration" href="signup.html">Sign up</a></li>         
              </ul>
              <div class="form-inline my-2 my-lg-0">
                <a href="signup.html" class="signup">Sign up</a>
                <button class="btn btn-outline-success my-2 my-sm-0 login" type="submit" onclick="location.href='login.html'">Login</button>
              </div>
            </div>
          </nav>
    </header>

    <main>
        <div class="container">
            <div class="AddProductPopUp col-md-8">
                <div class="closeBtn"><i class="fas fa-times"></i></div>
                <img src="images/Logo.png" class="loginLogo">
                <p>Update product informations :</p>
                <div class="ProductForm">
                    <form action="" class="AddProductForm" id="AddProductForm">
                        <input type="text" class="NameField Fields" placeholder="Product Name">
                        <div class="CategoryField">
                            <select class="CategorySelect Fields">
                                <option value="" selected disabled hidden>Category</option>
                                <option value="client">Electronics</option>
                                <option value="seller">Computers</option>
                                <option value="seller">Men's Fashion</option>
                                <option value="seller">Women's Fashion</option>
                                <option value="seller">Health</option>
                            </select>
                        </div>
                        <textarea rows="4" cols="50" form="AddProductForm" placeholder="Product Description" class="DescriptionField Fields"></textarea></br>
                        <input type="text" class="QuantityField Fields" placeholder="Product Quantity"></br>
                        <input type="text" class="PriceField Fields" placeholder="Product Unit Price (Dhs)"></br>
                        <label for="file-upload" class="custom-file-upload Fields">
                            <i class="fa fa-cloud-upload"></i> Upload image</label>
                        <input id="file-upload" name='upload_cont_img' type="file">       
                    </form>
                </div>
                <button class="SaveBtn">Save</button>
                <button class="UndoBtn">Undo</button>
            </div>
        </div>
    </main>

    <footer>
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
    <script src="manageProducts.js"></script>

</body>
</html>