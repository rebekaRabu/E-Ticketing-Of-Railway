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

        <title>Update</title>

        <!-- Bootstrap core CSS-->
        <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="resources/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="resources/cssnew/sb-admin.css" rel="stylesheet">
        <link href="resources/img/logo.ico" rel="shortcut icon" />

    </head>
    <body class="bg-dark">
        <div class="container">
            
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">SignUp the Account</div>
                
                <div class="card-body">
 <!-----------------------passengerid, passengername, emailid, reenteremailid, password, reenterpassword, dob, address, postcode, nid, birthid, email----------------->
                    <form:form modelAttribute="passengerinfo" action="reupdater">
                        
                        
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="text" class="form-control" placeholder="Passenger Name " id="passengername" autofocus="autofocus" aria-describedby="basic-addon1" path="passengername" required="true"></form:input>
                                    <label for="passengername">Passenger Name</label>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <div class="form-label-group">
                                 <form:input type="email" class="form-control" placeholder="Email" id="emailid" aria-describedby="basic-addon1" path="emailid" required="true"></form:input>
                                    <label for="emailid">Email address</label>
                            </div>
                        </div>
            
                        <div class="form-group">
                            <div class="form-label-group">
                                 <form:input type="email" class="form-control" placeholder="Re-enter emailid" id="reenteremailid" aria-describedby="basic-addon1" path="reenteremailid" required="true"></form:input>
                                    <label for="reenteremailid">Re-enter emailid address</label>
                            </div>
                        </div>            
                        
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="password" class="form-control" id="password"
                                            placeholder="New Password" aria-describedby="basic-addon1" path="password" required="true"></form:input>
                                    <label for="password">Password</label>
                            </div>
                        </div>            
                                    
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="password" class="form-control" id="reenterpassword"
                                            placeholder="Re-Enter Password" aria-describedby="basic-addon1" path="reenterpassword" required="true"></form:input>
                                    <label for="reenterpassword"> Re-Enter Password</label>
                            </div>
                        </div>            
                                    
<!------------------passengerid, passengername, emailid, reenteremailid, password, reenterpassword, dob, address, postcode, nid, birthid, email---------------->
                                    
                                    
                                    
                                    
                                    
                                    
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="text" class="form-control" placeholder="Address" id="address" autofocus="autofocus" aria-describedby="basic-addon1" path="address" required="true"></form:input>
                                    <label for="address">Address</label>
                            </div>
                        </div>            
                                    
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="text" class="form-control" placeholder="Postcode" id="postcode" autofocus="autofocus" aria-describedby="basic-addon1" path="postcode" required="true"></form:input>
                                    <label for="postcode">Postcode</label>
                            </div>
                        </div> 
                                    
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="text" class="form-control" placeholder="National Id Num" id="nid" autofocus="autofocus" aria-describedby="basic-addon1" path="nid" required="true"></form:input>
                                    <label for="nid">* National Id Num</label>
                            </div>
                        </div>
                            
                                   
                       
                        
                        <div class="form-group">
                            <div class="form-label-group">
                                <form:input type="text" class="form-control" placeholder="Birthid Certificate" id="birthid" autofocus="autofocus" aria-describedby="basic-addon1" path="birthid"></form:input>
                                    <label for="birthid">Birth Certificate</label>
                            </div>
                        </div>
                                
                        
                                
                        <div class="form-group">
                            <div class="form-label-group">
                                 <form:input type="text" class="form-control" id="Email"
                                            placeholder="email" aria-describedby="basic-addon1" path="email" required="true"></form:input>
                                    <label for="email">Email</label>
                            </div>
                        </div>
                                
                                                        
                                
                        <button id="signupbutton" class="btn btn-pumpkin btn-googleplus" type="submit">Update</button>        
<!--                        <button id="signupbutton" class="btn btn-pumpkin btn-googleplus" type="submit">Sign Up</button>        -->
                                
                    </form:form>
                        <div class="text-center">
                        <a class="d-block small mt-3" href="login">Login Page</a>
                        <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
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

