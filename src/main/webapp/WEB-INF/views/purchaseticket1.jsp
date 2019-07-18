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

        <title>Admin - Add FareChart</title>
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
            .navbar{
                background: #eee;
            }
            .footerbar{
                position: absolute;
                top:600px;
                left: 30px;
                background: tomato;
                width: 95%;
                height: 50px;
            }
            
        </style>

        <script>

            var farechartlist =${farechartlist};
            var fromstationlist =${fromstationlist};
            var tostationlist =${tostationlist};

            angular.module('farechartApp', []).controller('farechartController',
                    function ($scope) {

                        $scope.farelist = farechartlist;
                        $scope.fromlist = fromstationlist;
                        $scope.tolist = tostationlist;
                        console.log($scope.farelist);
                        console.log($scope.fromlist);
                        console.log($scope.tolist);

                    });
        </script>
    </head>


    <body id="page-top" ng-app="farechartApp" ng-controller="farechartController">
        <nav class="navbar navbar-expand static-top">

            <a class="navbar-brand mr-1" href="admin">E-ticketing</a>

            <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">

            </button>

            <!-- Navbar Search -->


            <!-- Navbar -->


        </nav>

        <div id="wrapper">

            <!-- Sidebar -->

            <div id="content-wrapper">

                <div class="container-fluid">

                    <!-- Breadcrumbs-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="#">Dashboard</a>
                        </li>
                        <li class="breadcrumb-item active">Search Train</li>
                    </ol>
                    <!-- end panel heading -->
                    <div class="panel-body">
                        <div class="formcontainer ">


                            <form:form commandName="newProductObject" action="purchaseticketadd"
                                       enctype="multipart/form-data">





                                <!-----------------------------------------fromstationid, fromstationname----------------------------------------------------->
                                <div class="form-row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <select class="form-control" ng-model="fromstationid" ng-options="y.fromstationid as y.fromstationname for y in fromlist" required="true">
                                                <option value="">-- Choose From Station --</option>
                                            </select>

                                        </div>
                                    </div>  


                                    <!-----------------------------------------------tostationid, tostationname------------------------------------------------>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <select class="form-control" ng-model="tostationid" ng-options="y.tostationid as y.tostationname for y in tolist" required="true">
                                                <option value="">-- Choose To Station --</option>
                                            </select>

                                        </div>
                                    </div> 
                                </div>



                                <!-------------------------------comptypeid, compname, description----------------------------------------------> 




                                <!-------------------------------passtypeid, passtypename---------------------------------------------->                            


                                <!------------------farechartid, fromstationid, tostationid, comptypeid, passtypeid, fareamount--------------------------->                                   




                            </div><!-------------------------------------form-row end---------------------------------------->


                            <div class="form-group">


                                <!------------------------------- <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>---------------------------->

                                <div class="form-label-group">
                                    <form:hidden  class="form-control" value="{{fromstationid}}" path="fromstationid"></form:hidden>
                                    </div>


                                    <div class="form-label-group">
                                    <form:hidden  class="form-control" value="{{tostationid}}" path="tostationid"></form:hidden>
                                    </div>            













                                <c:if test="${check}">
                                    <form:button id="editbuttons" type="submit" name="Add" class="btn btn-success">Add</form:button>

                                </c:if>

                                <a href="showpurchaseticket"><button id="show" type="button" class="btn">Cancel</button></a>        
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



        <!--     Form code begins 
            <form method="post">
              <div class="form-group">  Date input 
                <label class="control-label" for="date">Date</label>
                <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
              </div>
             </form>-->
    </body>
</html>
