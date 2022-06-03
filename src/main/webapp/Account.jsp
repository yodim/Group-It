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
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/sideBar.css">
    <link rel="stylesheet" href="css/manageOrders.css">
    <link rel="stylesheet" href="css/mngProduct.css">
    <link rel="stylesheet" href="css/account.css">
    <link rel="icon" href="images/favicon.png">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <title>Account</title>
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
<li class="nav-item"><a class="nav-link" href="<%= request.getContextPath() %>/Amazon">AMAZON Products</a></li>
                
                <li class="nav-item"><a class="nav-link" href="#">About us</a></li>       
              </ul>
              <div class="form-inline my-2 my-lg-0">
               <button class="btn btn-outline-success my-2 my-sm-0" onclick="accountPopUp()" ondblclick="hidePopup()" type="submit" "><span>Hi, ${user.getFirstname()}</span> <span><i class="fas fa-user-circle"></i></span> </button>
              </div>
            </div>
          </nav>
    </header>
    <main onclick="hidePopup()">
        
        <div class="sideBar">
            
            <div class="profileImageSideBar">
                <img src="images/inconnu.jpg" alt="My Image" class="profileImage">
                <h4 class="userName">${user.getFirstname()}</h4>
            </div>
            <a href="<%= request.getContextPath() %>/MyAccount?user_id=${user.getUser_id()}" class="SideBarItems "><i class="far fa-user-circle"></i> <span>Account</span></a>
            <a href="<%= request.getContextPath() %>/Statistics?user_id=${user.getUser_id()}" class="SideBarItems "><i class="far fa-chart-bar"></i> <span>Statistics</span></a>
            <a href="<%= request.getContextPath() %>/manageProducts?user_id=${user.getUser_id()}" class="SideBarItems "><i class="fas fa-tag"></i> <span>Manage Products</span></a>
            <a href="" class="SideBarItems "><i class="fas fa-shopping-cart"></i> <span>Manage Orders</span></a>
            <a href="" class="SideBarItems "><i class="fas fa-truck"></i> <span>Manage Deliveries</span></a>

        </div>


        <div class="container">
            
            <div class="TitlesDiv">
                <h4 class="tableTitle">Account </h4>
            </div>

            <div class="formContainer col-lg-12">
                <form action="index.html" class="signUpForm ">
                    <section class="signText">Update your account informations : </section>
                    <input type="text" name="name" id="" placeholder="Fisrt name*" class="inputNameArea" required>
                    <input type="text" placeholder="Family name*" class="inputNameArea" required><br/>
                    <input type="text" name="email" id="" placeholder="Email*" class="inputArea" required><br/>
                    <input type="password" name="pwd" id="pwd" placeholder="Password*" minlength="8" class="inputArea passwordArea" required><br/>
                    <input type="password" name="confirmPassword" id="" placeholder="Confirm password*" class="inputArea passwordArea" required><br>
                    <input type="text" placeholder="GSM*" class="inputArea" required><br/>
                    <input type="text" placeholder="Address*" class="inputArea" required><br/>
                    <input type="text" placeholder="City*" class="inputArea" required><br/>
                    <input type="submit" name="" id="" value="Save" class="signupbtn"><br/>
                    <button class="deleteAccount">Delete my account</button>
                </form>
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
        <div class="userPopUp">

            <div class="profileImageDiv">
                <img src="images/inconnu.jpg" alt="omar" class="profileImage">
                <span class="UserName">Hi, ${user.getFirstname()}</span>
                <hr class="HorizontalLine">
            </div>
            <div class="OptionsDiv OptionsDiv1">
                <i class="far fa-user-circle accountOptionsIcons"></i>
                <a href="#" class="accountOptions">Manage your account</a>
            </div>
            <div class="OptionsDiv">
                <i class="far fa-question-circle accountOptionsIcons"></i>
                <a href="#" class="accountOptions">Help</a>
            </div>
            <div class="OptionsDiv">
                <i class="far fa-comment-dots accountOptionsIcons"></i>
                <a href="#" class="accountOptions">Send feedback</a>
            </div>
            <div class="OptionsDiv">
                <i class="fas fa-sign-out-alt accountOptionsIcons"></i>
                <a href="index.jsp" class="accountOptions">Sign out</a>
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="account.js"></script>
    
    
</body>
</html>