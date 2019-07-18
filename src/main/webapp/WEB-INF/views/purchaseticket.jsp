<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: green;
                border-radius:5px;

                box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 10px 30px 0 rgba(0, 0, 0, 0.19);
            }

            li {	
                margin-left:50px;
                float:left;
            }

            li a, .dropbtn {
                display: inline-block;
                color: black;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover, .dropdown:hover .dropbtn {
                background-color: red;
                border-radius: 5px;
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

            .form {
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;
            }
            input[type=text], select {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }

            input[type=submit] {
                width: 100%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }

            .footer{

                height:50px;
                width:100%;
                background-color:green;
                color: red;
                text-align:center;
                border-radius:5px;
                box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 10px 30px 0 rgba(0, 0, 0, 0.19);
            }

            .footer p{
                text-decoration:none;
            }


        </style>


        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
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
    <body>

        <ul>
            <li><a href="#home">Home</a></li>
            <li><a href="#news">Login</a></li>
            <li><a href="#news">SignUp</a></li>
            <li class="dropdown">
                <a href="javascript:void(0)" class="dropbtn">Contact</a>
                <div class="dropdown-content">
                    <a href="#">Link 1</a>
                    <a href="#">Link 2</a>
                    <a href="#">Link 3</a>
                </div>
            </li>
        </ul>


        <div>
            <h1>Ticket Purchase</h1>

            <div class="form">
                <form commandName="newProductObject"  enctype="multipart/form-data">


                    <c:if test="${check}">
                        <div class="form-group">
                            <input class="form-control" Placeholder="purchaseid" type="text" path="purchaseid" readonly="true" required="true">
                            </div>
                    </c:if> 


                    <c:if test="${!check}">
                        <div class="form-group">
                            <input class="form-control" Placeholder="purchaseid" type="text" path="purchaseid" readonly="true" required="true">
                            </div>
                    </c:if> 


                    <!---------------------------purchaseid, fromstationid, tostationid--------------------------------->
<!--                        <label for="country">Station From</label>
                        <select id="country" name="country">
                          <option value="australia">Australia</option>
                          <option value="canada">Canada</option>
                          <option value="usa">USA</option>
                        </select>-->

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

                    <div class="form-label-group">
                        <hidden  class="form-control" value="{{fromstationid}}" path="fromstationid"></hidden>
                        </div>


                        <div class="form-label-group">
                        <hidden  class="form-control" value="{{tostationid}}" path="tostationid"></hidden>
                        </div>    











                        <!--                    <label for="country">Station To</label>
                                            <select id="country" name="country">
                                                <option value="australia">Australia</option>
                                                <option value="canada">Canada</option>
                                                <option value="usa">USA</option>
                                            </select>
                        
                                            <label for="country">Journey Date</label>
                                            <select id="country" name="country">
                                                <option value="australia">Australia</option>
                                                <option value="canada">Canada</option>
                                                <option value="usa">USA</option>
                                            </select>-->


                    <c:if test="${check}">
                        <button id="editbuttons" type="submit" name="Add" class="btn btn-success">Add purchase</button>
                        <button id="removebuttons" type="reset" class="btn btn-danger">Reset Details</button>
                    </c:if>



                    <input type="submit" value="Submit">
                    <!--    <input type="search" value="search">-->
                </form>
            </div>
        </div>

        <div class="footer">
            <p>all reserved by <a href="#">rebeka</a></p>

        </div>



    </body>
</html>
