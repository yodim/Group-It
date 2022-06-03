<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="icon" href="images/favicon.png">
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
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
                <li class="nav-item active"><a class="nav-link" href="index.jsp">Home</a></li>
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
                <h4 class="addProductButton">Products list </h4>
                <button class="addProductButton" id="AddProductWindow"><i class="fas fa-plus-circle"></i> Add Product</button>
            </div>

            <div class="tableContainer">

                <table>

                    <thead>
                        <tr>
                            <th class="ProductCase">Image</th>
                            <th class="DateCase">Date</th>
                            <th class="ProductCase">Name</th>
                            <th class="Category_Case">Category</th>
                            <th class="QuantityCase">Quantity</th>
                            <th class="UPriceCase">Unit Price (Dhs)</th>
                            <th class="SalesCase">Sold</th>
                            <th class="DeleteCase">OPTIONS</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${products}" var="product" >
                        <tr>
                            <td>
                                <img src="P_image.jsp?Product_id=${product.getProduct_id()}"  class="productImg">
                                
                            </td>     
                            <td>${product.getP_Entry_Date()}</td>
                            <td >${product.getP_name()}</td>
                            <td >${product.getC_Name()}</td>
                            <td class="Quantity">${product.getP_Quantity()}</td>
                            <td >${product.getP_UnitPrice()}</td>
                            <td class="NumberOfSales">0</td>
                            <th class="deleteIcon">
                                <button class="deletebtn" onclick ="updatePopUp(${product.getProduct_id()},'${product.getP_name()}',${product.getCategory_id()},'${product.getP_Description()}',${product.getP_Quantity()},${product.getP_UnitPrice()})" ><i class="fas fa-pencil-alt"></i></button>
                                <button class="deletebtn" onclick="promotionPopUp(${product.getProduct_id()})"><i class="fas fa-tag"></i></button>
                                <button class="deletebtn" onclick="deletePopUp(${product.getProduct_id()})"><i class="fas fa-trash-alt"></i></button>
                            </th>                        
                            
                        </tr>
                        </c:forEach>
                        
                    </tbody>
    
                </table>

            </div>
	
            <div id="container1" class="container">
            <div class="AddProductPopUp col-md-8">
                <div class="closeBtn"><i class="fas fa-times"></i></div>
                <img src="images/Logo.png" class="loginLogo">
                <p>Add your Product :</p>
                <div class="ProductForm">
                    <form action="<%= request.getContextPath() %>/AddProduct?user_id=${user.getUser_id()}" class="AddProductForm" id="AddProductForm" method="post" enctype="multipart/form-data">
                    <input type="text" name="P_name" class="NameField Fields" placeholder="Product Name">
                    <div class="CategoryField">
                        <select name="Category_id" class="CategorySelect Fields">
                            <c:forEach items="${Categories}" var="Category">
                            	<option value="${Category.getCategory_id()}">${Category.getC_Name()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <textarea name="P_description" rows="4" cols="50" form="AddProductForm" placeholder="Product Description" class="DescriptionField Fields"></textarea>
                    <input type="text" name="P_Quantity" class="QuantityField Fields" placeholder="Product Quantity">
                    <input type="text" name="P_UnitPrice" class="PriceField Fields" placeholder="Product Unit Price (Dhs)">
                    <label for="file-upload" class="custom-file-upload Fields">
                        <i class="fa fa-cloud-upload"></i> Upload image</label>
                    <input id="file-upload" name="image" type="file">       
                
                	<input  class="AddBtn" type="submit"  value="Add Product">
                </form>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="deleteProductPopUp col-lg-6">
            <script type="text/javascript">
            document.querySelector(".deleteProductPopUp").addEventListener("click", function(){
            document.querySelector(".deleteProductPopUp").classList.remove("active");
            })
            </script>
                <p>Sure you want to delete this product ?</p>
                <form id="form1" method="post" action="<%= request.getContextPath() %>/DeleteProduct?user_id=${user.getUser_id()}">
                <input type="hidden" id="P_id" name="P_id" value="">
                <button form="form1" type="submit" class="yesBtn btns" >Yes</button>
                </form>
                <hr class="HorizontalLine"> 
                <div><button class="noBtn btns">No</button></div> 
            </div>
        </div>
		<div class="container">
            <div class="promotionProductPopUp col-lg-6">
                <div class="closeBtnPromotion"><i class="fas fa-times"></i></div>
                <script type="text/javascript">
                document.querySelector(".promotionProductPopUp .closeBtnPromotion").addEventListener("click", function(){
                document.querySelector(".promotionProductPopUp").classList.remove("active");
                })
                </script>
                <img src="images/Logo.png" class="loginLogo">
                <p>Add promotion to your product : </p>
                <div class="containerDiv">
                    <form action="" class="promotionForm col-lg-8">
                        <label for="startDate" class="labelDate">Start date : </label>
                        <input type="date" id="startDate" class="dateInput startDateInp"><br>
                        <label for="endDate" class="labelDate">End date : </label>
                        <input type="date" id="endDate" class="dateInput endDateInp"><br>
                        <label for="percentage" class="labelDate">Percentage : </label>
                        <input type="text" id="percentage" class="dateInput percentageInp" placeholder="Ex : 15%">
                    </form>  
                </div>      
                <button class="SaveBtn">Save</button>
                  
            </div>
        </div>
        <div class="UpdateProductPopUp col-md-8">
            <div class="closeBtn"><i class="fas fa-times"></i></div>
            <script type="text/javascript"> 
            document.querySelector(".UpdateProductPopUp .closeBtn").addEventListener("click", function(){
            document.querySelector(".UpdateProductPopUp").classList.remove("active");
            })
            </script>
            <img src="images/Logo.png" class="loginLogo">
            <p>Update product informations :</p>
            <div class="ProductForm">
                <form action="<%= request.getContextPath() %>/UpdateProduct?user_id=${user.getUser_id()}" class="AddProductForm" id="UpdateProductForm" method="post" enctype="multipart/form-data">
                	<input type="hidden" id="Product_id" name="Product_id" value="">
                    <input type="text"  name="P_name" id="P_name" value="" class="NameField Fields" placeholder="Product Name">
                    <div class="CategoryField">
                        <select name="Category_id" id="Category_id" class="CategorySelect Fields">
                            <c:forEach items="${Categories}" var="Category">
                            	<option value="${Category.getCategory_id()}">${Category.getC_Name()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <textarea name="P_description" id="P_description" rows="4" cols="50" form="UpdateProductForm"  class="DescriptionField Fields" ></textarea>
                    <input type="text" name="P_Quantity" id="P_Quantity" class="QuantityField Fields" placeholder="Product Quantity">
                    <input type="text" name="P_UnitPrice" id="P_UnitPrice" class="PriceField Fields" placeholder="Product Unit Price (Dhs)">
                    
                    <label for="file-uploadd" class="custom-file-upload Fields">
                        <i class="fa fa-cloud-upload"></i> Upload image</label>
                    <input id="file-uploadd" name="image" type="file" >
                    
                    <input class="SaveBtn" type="submit" value="Save">      
                </form>
                
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
    <script src="manageProducts.js"></script>
    
    
</body>
</html>