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

        <title>Reservation</title>
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

            li a:hover, .dropdown:hover .dropbtn {
                background-color: white;
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
            .contentheader {
                height: 25px;
                width: 90%;
                float: left;
                overflow: hidden;
                margin-left: 65px;
                background: brown;
                border-radius: 5px;
                color: white;
            }

            .contentbody{
                /*                height: 350px;*/
                width: 90%;
                float: left;
                overflow: hidden;
                margin-left: 65px;
                margin-top: 20px;
                background: brown;
                border-radius: 5px;
                color: black;
            }

            table {
                width:100%;
            }
            table, th, td {
                border: 2px solid green;
                border-collapse: collapse;
            }
            th, td {
                padding: 15px;
                text-align: left;
            }
            table#t01 tr:nth-child(even) {
                background-color: #eee;
            }
            table#t01 tr:nth-child(odd) {
                background-color: #fff;
            }
            table#t01 th {
                background-color: brown;
                color: white;
            }



        </style>

        <script>

            var trainlist =${traininfolist};
            var reservartionlist =${reservartionlist};
            var compartmentlist =${compartmentlist};
            var fromstationlist =${fromstationlist};
            var tostationlist =${tostationlist};

            angular.module('userreservationApp', []).controller('userreservationController',
                    function ($scope) {

                        $scope.traininflist = trainlist;

                        $scope.reservlist = reservartionlist;
                        $scope.complist = compartmentlist;
                        $scope.fromlist = fromstationlist;
                        $scope.tolist = tostationlist;

                        console.log($scope.fromlist);
                        //console.log($scope.complist);
                    });
        </script>
    </head>


    <body id="page-top" ng-app="userreservationApp" ng-controller="userreservationController">

        <div class="header"><h2><strong>E-Ticketing of Railway</strong></h2></div>

        <ul>
            <li><a href="#home">Home</a></li>
            <li><a href="#news">User Dashboard</a></li>
            <li><a href="showsearchtrainpage">Search Route</a></li>
            <li><a href="showsearchtrainpage">Purchase Ticket</a></li>
            <li><a href="#news">Purchase History</a></li>
            <li><a href="#news">User Profile</a></li>
            <li><a href="/train/"><strong>Sign Out</strong></a></li>
        </ul>

        <div id="wrapper">

            <!-- Sidebar -->

            <div id="content-wrapper">

                <div class="container-fluid">
                    <div class="panel-body">
                        <h3> 
                            <strong><span>T</span>rain</strong>
                            <strong><span>N</span>ame</strong>									
                        </h3>

                        <div class="contentheader">
                            <p>Train route showing for ::   to :: </p>
                        </div>

                        <form:form commandName="viewtrainlistc" action="reservationpage"
                                   enctype="multipart/form-data">


                            <div class="contentbody">
                                <table id="t01">
                                    <tr>
                                        <th>Train No</th>
                                        <th>Train Name</th> 
                                        <th>Compartment Name</th> 
                                        <th>Departure Time</th>
                                        <th>passenger adult</th>
                                        <th>passenger child</th>
                                        <th>Auto Selection</th>

                                        <!--                                    <th>Auto Selection3</th>-->

                                    </tr>

                                    <tr>
                                        <!--trainid, trainnub, trainname, fromstationid, tostationid, depttime, arrivtime, dayoff-->

                                        <!--reservid, passengerid, comptypeid, compsubtypeid, trainid, fromstationid, tostationid, adult, child, reservdate, journeydate, status--        //reservation--> 


                                                                        
                                        <div class="form-label-group">
                                         <form:hidden  class="form-control" value="${sessionScope.fromstationid}" path="fromstationid"></form:hidden>
                                        </div>
                                        <div class="form-label-group">
                                        <form:hidden  class="form-control" value="${sessionScope.tostationid}" path="tostationid"></form:hidden>
                                        </div>
                                          
                                      
<!--                                      <td>{{traininflist.trainnub}}</td>-->
  
                                     <td>{{traininflist.trainnub}}</td>
                                 <div class="form-label-group">
                                       <form:hidden  class="form-control" value="{{traininflist.trainnub}}" path="trainid"></form:hidden>
                                        </div>

                                    <td>{{traininflist.trainname}}</td>
                                    <div class="form-label-group">
                                       <form:hidden  class="form-control" value="{{traininflist.trainname}}" path="trainname"></form:hidden>
                                        </div>




                                            <td>
                                                <!--comptypeid, compname, description-->
                                                <select class="form-control" ng-model="comptypeid" ng-options="x.comptypeid as x.compname for x in complist" required="true">
                                                    <option value="">-- Choose class --</option>
                                                </select>
                                                <form:hidden  class="form-control" value="{{comptypeid}}" path="comptypeid"></form:hidden>
                                            </td>





                                            <td>{{traininflist.depttime}}</td>
                                        <div class="form-label-group">
                                        <form:hidden  class="form-control" value="{{traininflist.depttime}}" path="depttime"></form:hidden>
                                        </div>


                                        <!--                                    <td>
                                                                                                                        passtypeid, passtypename, passadult, passchild
                                                                                <select class="form-control" ng-model="passtypeid" ng-options="x.passtypeid as x.passadult for x in passtypelist" required="true">
                                                                                    <option value="">-- Choose adult --</option>
                                                                                </select>
                                                                            </td>-->




                                        <td>
                                        <form:select path="adult" class="form-control" required="true" id="adult">
                                        <option value="1"> 1 </option>
                                        <option value="2"> 2 </option>
                                        <option value="3"> 3 </option>
                                        <option value="4"> 4 </option>
                                    </form:select>

                                    </td>




                                    <td>
                                        <form:select path="child" class="form-control" required="true" id="adult">
                                        <option value="0"> 0 </option>
                                        <option value="1"> 1 </option>
                                        <option value="2"> 2 </option>
                                        <option value="3"> 3 </option>

                                    </form:select>
                                    </td>


                                    <td> <button id="editbuttons" type="submit" name="Add" class="btn btn-success">Buy</button></td>

                                    </tr>
                                </table>
                            </div>
                        </form:form>



                    </div><!-- //panel body end -->
                </div><!-- //.container-fluid -->
            </div> <!-- //.content-wrapper -->

            <!--            <div class="footerbar">
                            <footer>
                                <div>
                                    <div class="copyright text-center my-auto">
                                        <span>Copyright © Your Website 2019</span>
                                    </div>
                                </div>
                            </footer> 
                        </div>-->
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

            <script>
                                                $(document).ready(function () {
                                                    var date_input = $('input[name="d"]'); //our date input has the name "date"

                                                    var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                                                    date_input.datepicker({
                                                        format: 'yyyy/mm/dd',
                                                        container: container,
                                                        todayHighlight: true,
                                                        autoclose: true,
                                                    })
                                                })
            </script>


            <!--     Form code begins 
                <form method="post">
                  <div class="form-group">  Date input 
                    <label class="control-label" for="date">Date</label>
                    <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
                  </div>
                 </form>-->
    </body>
</html>
