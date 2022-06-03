<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/shoppingCart.css">
          <link rel="stylesheet" href="css/sideBar.css">
    <link rel="stylesheet" href="css/manageOrders.css">
    <link rel="stylesheet" href="css/mngProduct.css">
    <link rel="icon" href="images/stockinFavIcon.png">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <title>My card</title>
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
          <a href="<%= request.getContextPath() %>/MyAccount1?user_id=${user.getUser_id()}" class="SideBarItems "><i class="far fa-user-circle"></i> <span>Account</span></a>
            <a href="<%= request.getContextPath() %>/MyShoppingCart?user_id=${user.getUser_id()}" class="SideBarItems "><i class="fas fa-shopping-cart"></i> <span>My Orders on Hold</span></a>
            <a href="<%= request.getContextPath() %>/Confirmedorder?user_id=${user.getUser_id()}" class="SideBarItems "><i class="fas fa-tag"></i> <span>My Confirmed Orders</span></a>
            <a href="" class="SideBarItems "><i class="far fa-heart"></i> <span>My WishList</span></a>
            <a href="" class="SideBarItems "><i class="far fa-chart-bar"></i> <span>My History</span></a>
            <a href="" class="SideBarItems "><i class="fas fa-truck"></i> <span>Track my Orders</span></a>

        </div>
        <div class="container">
            
            <div class="TitlesDiv">
                <h4 class="tableTitle">My shopping cart </h4>
            </div>
					
                <h5 class="tableTitle" style="color: blue;" align="right"> Order Tracking Id :# ${order_id} </h5>
            
            <div class="tableContainer">

                <table>

                    <thead>
                        <tr>
                            <th>Product</th>
                            <th>Unit-Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th>Date</th>
                            <th class="DeleteCase">Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${Orders}" var="order">
                        <tr>
                            <td>
                                <img src="P_image.jsp?Product_id=${order.getProduct_id()}" alt="Product image" class="productImage">
                                <span class="productName">${order.getP_name()}</span>
                            </td>
                            <td class="Price">${order.getUnit_Price()}</td>
                            <td class="Quantity">${order.getQunatity()}</td>
                            <td class="Total">${order.getPrice()}</td>
                            <td>${order.getDate()}</td>
                            <td class="DeleteData"><button class="deletebtn" onclick="deletePopUp(${order.getProduct_id()},${order_id})"><i class="fas fa-trash-alt"></i></button></td>
                        </tr>
                       </c:forEach>
                    </tbody>
    				<tfoot>
    					<tr>
    					    <td> </td>
    					    <td> </td>
    						<td class="Total" style="color: red;"> &nbsp; Total Order : ${Total}   Dhs</td>
    						
    					</tr>
    					
    				</tfoot>
                </table>
				
            </div>
         <div class="container">
            <div class="deleteProductPopUp col-lg-6">
            <script type="text/javascript">
            document.querySelector(".deleteProductPopUp").addEventListener("click", function(){
            document.querySelector(".deleteProductPopUp").classList.remove("active");
            })
            </script>
                <p>Sure you want to delete this product ?</p>
                <form id="form1" method="post" action="<%= request.getContextPath() %>/UpdateMyCardServlet?user_id=${user.getUser_id()}">
                <input type="hidden" id="P_id" name="P_id" value="">
                <input type="hidden" id="order_id" name="order_id" value="">
                <button form="form1" type="submit" class="yesBtn btns" >Yes</button>
                </form>
                <hr class="HorizontalLine"> 
                <div><button class="noBtn btns">No</button></div> 
            </div>
        </div>
			
			<div class="TitlesDiv" >
			
                <button class="addProductButton" style="color: green;" onclick="location.href='<%= request.getContextPath() %>/ConfirmOrder?order_id=${order_id}&user_id=${user.getUser_id()}'" id="AddProductWindow"><i class="fas fa-check-circle"></i> Deliver Order </button>
            </div>
            
            <div class="">

                <h6 style="color: red">Warning : Your Order will be delivered by default to the address entered in the signup form , visit your account for any modification .</h6> 
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
                    <a href="index.jsp" class="accountOptions"><i class="fas fa-sign-out-alt accountOptionsIcons"></i> Sign out</a>
                </div>
    
            </div>
            

        </div>
        
            
        
    </main>

    <footer>
        <img src="images/Logo.png" alt="" class="footerLogo">
        <div class="verticalLine"></div>
        <div class="ContactUs">
            <div class="brandInfos">
                <div class="brandIcons">
                    <i class="far fa-phone-alt"></i>
                    <span class="brandNumber">+212-623689100</span><br/>
                    <i class="far fa-envelope"></i>
                    <span class="brandEmail">contact@Groupit.com</span>
                </div>
            </div>
        </div>
    </footer>


    <script src="bootstrap/jquery-3.6.0.min.js"></script>
    <script src="bootstrap/bootstrap.min.js"></script>
    <script src="bootstrap/script.js"></script>
    <script src="script.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="shoppingCart.js"></script>
    
    
</body>
</html>