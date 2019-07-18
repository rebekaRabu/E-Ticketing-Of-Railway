<%-- 
    Document   : reservationreport
    Created on : Jul 2, 2019, 1:48:17 AM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report Page</title>
        <style>
            .error {
                color: #ff0000;
            }

        </style>
    </head>
    <body>
        <h2>Reservation Report</h2>
<!--reservid, passengerid, comptypeid, compsubtypeid, trainid, fromstationid, tostationid, adult, child, reservdate, journeydate, status-->
        <form:form method="POST" action="reservationreportView" commandName="reportInputForm">

            <table id="reptbl" width="350px" border="1">
                <tr>
                    <td colspan="2"><form:errors path="reservid" cssClass="error"/></td> </tr>
                <tr>
                    
                <tr>
                    <td>
                        Enter Reservation ID <form:input path="reservid" id="reservid"/>
                        <input type="submit"  value="Generate Report"  />
                    </td>
                    

                </tr>
            </table>  
        </form:form>
    </body>
   
    
    
</html>

