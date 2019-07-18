<%-- 
    Document   : passinfosignup1
    Created on : Jun 23, 2019, 2:37:20 AM
    Author     : acer
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SignUp the Account</title>
        <link href="resources/img/logo.ico" rel="shortcut icon" />
        <!-- Bootstrap core CSS-->
        <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="resources/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Page level plugin CSS-->
        <link href="resources/datatables/dataTablesbootstrap4.css" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="resources/cssnew/sb-admin.css" rel="stylesheet">
        <script src="resources/js/angular.js"></script>
        <style>
            ul {
                height: 52px;
                width: 93%;
                list-style-type: none;
                margin: 0;
                padding: 0;
                margin-left: 45px;
                overflow: hidden;
                background-color: #c82333;
                border-radius:5px;

                box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 10px 30px 0 rgba(0, 0, 0, 0.19);
            }

            li {	
                margin-left:50px;
                float:left;
            }

            li a, .dropbtn {
                display: inline-block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }
            li a strong{
                color: aqua;

            }

            li a:hover, .dropdown:hover .dropbtn {
                background-color: green;
                border-radius: 5px;
                text-decoration: none;
            }

            li.dropdown {
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: blue;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }

            .dropdown-content a:hover {background-color: blue;}

            .dropdown:hover .dropdown-content {
                display: block;
            }


            h3{ 
                text-align:center;
            }
            h3 span{
                color: crimson;
            } 
            h2 span{
                color: #FFF;
            }

            .navbar{
                background: #eee;
            }
            .footerbar{
                position: absolute;
                top:550px;
                left: 45px;
                background: firebrick;
                width: 93%;
                height: 40px;
                border-radius: 5px;
                /*                 box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 10px 30px 0 rgba(0, 0, 0, 0.19);*/

                box-shadow: 0 16px 35px 0 rgba(1, 1, 1, 0.6), 0 20px 60px 0 rgba(1, 1, 1, 0.6);
            }
            .header h2{
                text-align: center;
                float: left;
                overflow: hidden;

                margin-left: 45px;
                margin-top: 20px;
                border-radius: 5px;
                background: firebrick;
                width: 93%;
                height: 50px;
                box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 10px 30px 0 rgba(0, 0, 0, 0.19);
            }


            .box{
                position: relative;
                left: 370px;
            }

        </style>

       
    </head>


    <body id="page-top" ng-app="searchtrainApp" ng-controller="searchtrainController">

        <div class="header"><h2><strong>E<span>-</span><span>T</span>icketing of <span>R</span>ailway</strong></h2></div>




        <!--        <nav class="navbar navbar-expand static-top">
        
                    <a class="navbar-brand mr-1" href="admin">E-ticketing</a>
        
                                <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
                    
                                </button>
        
                     Navbar Search 
        
        
                     Navbar 
        
        
                </nav>-->


        <ul>
            <li><a href="#home">Home</a></li>
            <li><a href="showsearchtrainpage">Search Train</a></li>
            <li><a href="#news">Purchase Ticket</a></li>
            <li><a href="#news">Purchase Ticket</a></li>
            <li><a href="#news">Purchase Ticket</a></li>

            <li class="dropdown">
                <a href="javascript:void(0)" class="dropbtn">Contact</a>

            </li>
            <li><a href="/train/"><strong>Sign Out</strong></a></li>
        </ul>





        <div id="wrapper">

            <!-- Sidebar -->

            <div id="content-wrapper">

                <div class="container-fluid">

                    <!-- Breadcrumbs-->
                    <!--                    <ol class="breadcrumb">
                                            <li class="breadcrumb-item">
                                                <h4></h4>
                                            </li>
                                            <li class="breadcrumb-item active"></li>
                                        </ol>-->
                    <!-- end panel heading -->
                    <div class="panel-body">

                        <h3><strong><span>S</span>ignUp</strong> 
                            <strong><span>F</span>orm</strong>                       
                        </h3>

                        

                        <div class="container formcontainer ">
                            <div class="box">
                                <form:form modelAttribute="passengerinfo" action="reupdater">

                                        
                <!--passengerid, passengername, emailid, password, dob, address, postcode, nid, birthid, phone-->                        
                                    <div class="form-row">
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="passengername" placeholder="Passenger Name" required="true" ></form:input>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="emailid" placeholder="Email Address" required="true" ></form:input>
                                        </div>
                                    </div>    
                                        
                                        
                                    </div>    
                                        
                                       
                                    
                                        
                                    <div class="form-row">
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="password" class="form-control"  path="password" placeholder="Password" required="true" ></form:input>
                                        </div>
                                    </div>
                                    
                                    
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="date" class="form-control"  path="dob" placeholder="Date of Birth Year" required="true" ></form:input>
                                        </div>
                                    </div>
                                    </div>
                                        
                                        
                                    <div class="form-row">
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="address" placeholder="Present Address" required="true" ></form:input>
                                        </div>
                                    </div>
                                    
                                    
                                        
                                    
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="phone" placeholder="Mobile Number" required="true" ></form:input>
                                        </div>
                                    </div>
                                    </div>    
                                        
                                    <div class="form-row">
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="postcode" placeholder="Postal Code" required="true" ></form:input>
                                        </div>
                                    </div>
                                        
                                        
                                    
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="nid" placeholder="National ID No" required="true" ></form:input>
                                        </div>
                                    </div>
                                    </div>
                                        
                                        
                                    <div class="form-row">
                                    <div class="col-md-4">
                                    <div class="form-group">
                                        <form:input type="text" class="form-control"  path="birthid" placeholder="Birth Certificate No" required="true" ></form:input>
                                        </div>
                                    </div>
                                    </div>    


                                        <!-------------------------------comptypeid, compname, description----------------------------------------------> 




                                        <!-------------------------------passtypeid, passtypename---------------------------------------------->                            


                                        <!------------------farechartid, fromstationid, tostationid, comptypeid, passtypeid, fareamount--------------------------->                                   




                                        <!-------------------------------------form-row end---------------------------------------->


                                        <div class="form-group">


                                            <!------------------------------- <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>---------------------------->

                                                  
                                            <a href="#" class="btn btn-success">SignUp</a>

                                        <form:button id="editbuttons" type="submit"  class="btn btn-success">Search train</form:button>
                                        


                                            <!--                                        <a href="showpurchaseticket"><button id="show" type="button" class="btn btn-danger">Cancel</button></a>        -->



                                        </div>
                                </form:form>
                            </div>
                            <!-- panel body end -->
                        </div>

                        <!-- DataTables Example -->


                    </div>
                    <!-- /.container-fluid -->

                    <!-- Sticky Footer -->


                </div>
                <!-- /.content-wrapper -->

            </div>
            <div class="footerbar">
                <footer>
                    <div>
                        <div class="copyright text-center my-auto">
                            <span>Copyright © Your Website 2019</span>
                        </div>
                    </div>
                </footer> 
            </div>

            <!-- /#wrapper -->

            <!-- Scroll to Top Button-->
            <a class="scroll-to-top rounded" href="#page-top">
                <i class="fas fa-angle-up"></i>
            </a>

            <!-- Logout Modal-->
            <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </div>
                        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <a class="btn btn-primary" href="logout">Logout</a>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Bootstrap core JavaScript-->
            <script src="resources/jquery/jquery.min.js"></script>
            <script src="resources/bootstrap/js/bootstrap.bundle.min.js"></script>

            <!-- Core plugin JavaScript-->
            <script src="resources/jquery-easing/jquery.easing.min.js"></script>

            <!-- Page level plugin JavaScript-->
            <script src="resources/chart/Chartmin.js"></script>
            <script src="resources/datatables/jquerydataTables.js"></script>
            <script src="resources/datatables/dataTablesbootstrap4.js"></script>

            <!-- Custom scripts for all pages-->
            <script src="resources/jsnew/sb-adminmin.js"></script>

            <!-- Demo scripts for this page-->
            <script src="resources/jsnew/demo/datatablesdemo.js"></script>
            <script src="resources/jsnew/demo/chartareademo.js"></script>


            <!--<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>-->

            <!-- Include Date Range Picker -->
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>



<!--            <script>
                                                            $(document).ready(function () {
                                                                var date_input = $('input[name="dob"]'); //our date input has the name "date"

                                                                var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                                                                date_input.datepicker({
                                                                    format: 'yyyy/mm/dd',
                                                                    container: container,
                                                                    todayHighlight: true,
                                                                    autoclose: true,
                                                                })
                                                            })
            </script>-->







            <!--     Form code begins 
                <form method="post">
                  <div class="form-group">  Date input 
                    <label class="control-label" for="date">Date</label>
                    <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
                  </div>
                 </form>-->
    </body>
</html>

