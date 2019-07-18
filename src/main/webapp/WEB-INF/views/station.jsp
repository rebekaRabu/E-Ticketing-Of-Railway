<%-- 
    Document   : index
    Created on : May 27, 2019, 9:31:20 PM
    Author     : acer
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Home</title>
<!--        <link href="resources/img/logo.ico" rel="shortcut icon" />-->
        <!-- Bootstrap core CSS-->
        <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="resources/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

<!--         Page level plugin CSS
        <link href="resources/datatables/dataTablesbootstrap4.css" rel="stylesheet">-->

        <!-- Custom styles for this template-->
<!--        <link href="resources/cssnew/sb-admin.css" rel="stylesheet">-->
        <script src="resources/js/angular.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
        <script>
            var cat = ${categorymodelobject};
            console.log(cat);
            angular.module('myapp', []).controller('CategoryController',
                    function ($scope) {
                        $scope.Station = cat;
                    });
        </script>
        
       

    </head>
    <body ng-app="myapp" ng-controller="CategoryController">

       


                    <div class="panel-body">
                        <div class="formcontainer">
                            <c:if test="${check}">
                                <form:form name="addCategoryObject" modelAttribute="addCategoryObject1" action="addingcategory" method="post">
                                    <div class="form-group">
                                        <div class="form-label-group">
                                            <form:input class="form-control" Placeholder="Station Id" type="text" path="stationid" required="true" id="stationid"></form:input>
                                                <label for="stationid">Station Id</label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-label-group">
                                            <form:input class="form-control" Placeholder="Station Name" type="text" path="stationname" required="true" id="stationname"></form:input>
                                                <label for="stationname">Station Name</label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-label-group">
                                            <form:input type="text" class="form-control" placeholder="Status" path="status" required="true" id="status"></form:input>
                                                <label for="status">status</label>
                                        </div>
                                    </div>
                                    <form:button id="editbuttons" type="submit" name="Addcategory" class="btn btn-success">Add Category</form:button>
                                    <form:button id="removebuttons" type="reset" class="btn btn-danger">Reset Details</form:button>
                                </form:form>
                            </c:if>

                            <c:if test="${!check}">
                                <form:form name="addCategoryObject" modelAttribute="addCategoryObject1" action="addingcategory" method="post">
                                    <div class="form-group">
                                       <div class="form-label-group">
                                           <form:input class="form-control" Placeholder="Category Id" type="text" path="stationid" required="true" id="stationid" readonly="true"></form:input>
                                                <label for="stationid">Station Id</label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-label-group">
                                            <form:input class="form-control" Placeholder="Category Name" type="text" path="stationname" required="true" id="stationname"></form:input>
                                                <label for="stationname">Station Name</label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-label-group">
                                            <form:input type="text" class="form-control" placeholder="status" path="status" required="true" id="status"></form:input>
                                                <label for="status">status</label>
                                        </div>
                                    </div>
                                    <form:button id="editbuttons" type="submit" name="EditCategory"
                                                 class="btn btn-success">Edit Category</form:button>
                                    <form:button id="removebuttons" type="reset" class="btn btn-danger">Reset Details</form:button>
                                </form:form>
                            </c:if>
                        </div>
                    </div>


                    <!-- DataTables Example -->
                    <div class="card mb-3">
                        <div class="card-header">
                            <i class="fas fa-table"></i>
                            station List</div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>station Id</th>
                                            <th>station Name</th>
                                            <th>station</th>
                                            <th>Action</th>
                                            
                                        </tr>
                                    </thead>
<!--                                    <tfoot>
                                        <tr>
                                           <th>station Id</th>
                                            <th>station Name</th>
                                            <th>station</th>
                                            
                                        </tr>
                                    </tfoot>-->
                                    <tbody>
                                        <tr ng-repeat="x in Station">
                                            <td>{{x.stationid}}</td>
                                            <td>{{x.stationname}}</td>
                                            <td>{{x.status}}</td>
                                            <td><a href="editcategorybutton?getstationid={{x.stationid}}"><button id="editbuttons" type="submit" class="btn">Edit</button></a> 
                                                <a href="removecategory/{{x.stationid}}"><button  id="removebuttons" type="button" class="btn btn-danger">Remove</button></a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
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

    </body>
</html>
