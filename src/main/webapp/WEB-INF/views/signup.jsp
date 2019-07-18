<%-- 
    Document   : signup
    Created on : Jun 1, 2019, 12:17:37 AM
    Author     : acer
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Sign Up</title>

        <!-- Bootstrap core CSS-->
        <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="resources/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="resources/cssnew/sb-admin.css" rel="stylesheet">
        <link href="resources/img/logo.ico" rel="shortcut icon" />

    </head>
    <body class="bg-dark" style="background-image: url(resources/public/img/16.jpg);">
        <div class="container">
            
            <div class="card card-register mx-auto mt-5">
                <div class="card-header" style="background: #ff253a; text-align: center;"><strong>Register For Account</strong></div>
                
                <div class="card-body">
                    <form:form modelAttribute="urm" action="reguser">
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="text" class="form-control" placeholder="Username" id="name" autofocus="autofocus" aria-describedby="basic-addon1" path="username" required="true"></form:input>
                                    <label for="name">User Name</label>
                            </div>
                        </div>
                                
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="password" class="form-control" id="pass"
                                            placeholder="New Password" aria-describedby="basic-addon1" path="password" required="true"></form:input>
                                    <label for="pass">Password</label>
                            </div>
                        </div>
                                
                        <div class="form-group">
                            <div class="form-label-group">
                                 <form:input type="text" class="form-control" id="phone"
                                            placeholder="Phone Number" aria-describedby="basic-addon1" path="phone" value="+88" required="true"></form:input>
                                    <label for="phone">Phone</label>
                            </div>
                        </div>
                                
                        <div class="form-group">
                            <div class="form-label-group">
                                 <form:input type="email" class="form-control" placeholder="Email" id="inputEmail" aria-describedby="basic-addon1" path="emailid" required="true"></form:input>
                                    <label for="inputEmail">Email address</label>
                            </div>
                        </div>
                                
                                
                                    <button id="signupbutton" class="btn btn-pumpkin btn-googleplus" type="submit" style="background: green;" ><strong>Sign Up</strong></button>        
                             
                                
                    </form:form>
                        <div class="text-center">
                        <a class="d-block small mt-3" href="login">Login</a>
                        <a class="d-block small" href="forgot-password.html" style="color: #ff253a;">Forgot Password?</a>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Bootstrap core JavaScript-->
        <script src="resources/jquery/jquery.min.js"></script>
        <script src="resources/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="resources/jquery-easing/jquery.easing.min.js"></script>
    </body>
</html>

