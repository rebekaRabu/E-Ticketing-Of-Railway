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

        <title>Reservation Details</title>
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

        <script>
            var reservationslist = ${reservationslist};
//            var reservationdetaillist = ${reservationdetaillist};
           

            angular.module('farechartApp', []).controller('farechartController',
                    function ($scope) {
                        $scope.reservlist = reservationslist;
//                        $scope.reservdetaillist = reservationdetaillist;
                        
                       
                        console.log($scope.reservlist);
//                        console.log($scope.reservdetaillist);
                    });
        </script>
    </head>


    <body id="page-top" ng-app="farechartApp" ng-controller="farechartController">



        <div class="panel animated fadeInUp delay-05s" id="panel-2">
            <div class="panel-heading">
                <span class="lead"><strong>Reservation Details</strong></span>
            </div>
            
            <!-- end panel2 heading -->
            <div class="panel-body">
                <ul class="list-group">
                    <li class="list-group-item" height="45px"
                        ng-repeat="reserv in reservlist | filter:test">
                        <table style="width: 100%">
                            <tr>

                                <td>
                                    <ul>
                                        <ul>
                                            <!--reservid, passengerid, comptypeid, compsubtypeid, trainid, fromstationid, tostationid, adult, child, reservdate, journeydate, status, adultfare, childfare, totalfare-->
                                            
                                            <li><span><b>reservation Id </b></span>{{reserv.reservid}}</li>
                                            <li><span><b>From Station Id </b></span>{{reserv.fromstationid}}</li>
                                            <li><span><b>To Station Id </b></span>{{reserv.tostationid}}</li>
                                            <li><span><b>Journey Date </b></span>{{reserv.journeydate}}</li>
                                            <li><span><b>Train Id: </b></span>{{reserv.trainid}}</li>
                                            <li><span><b>Compartment Id : </b></span>{{reserv.comptypeid}}</li>
                                            <li><span><b>adult: </b></span>{{reserv.adult}}</li>
                                            <li><span><b>child: </b></span>{{reserv.child}}</li>
                                            <li><span><b>Total fare: </b></span>{{reserv.totalfare}}</li>
                                            
<!--                                            <li><span><b>Seat No : </b></span>{{reserv.seatqty}}</li>-->
                                            
                                            
                                        </ul>


                                    </ul>
                                </td>
<!--                                <td><a href="editingreservationdet?getrdid={{reservedetail.resdetid}}"><button id="editbuttons"
                                                                                                               type="submit" class="btn">Edit</button></a> <a
                                        href="removingreservationDet/{{reservedetail.resdetid}}"><button id="removebuttons"
                                                                                                     type="button" class="btn">Remove</button></a></td>-->
                            </tr>
                        </table>
                    </li>
                </ul>
            </div>
            <!-- panel2 body end -->
        </div>


        <!-- /.container-fluid -->

        <!-- Sticky Footer -->




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
