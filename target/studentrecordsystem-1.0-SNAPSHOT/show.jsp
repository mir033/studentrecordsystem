<%-- 
    Document   : show
    Created on : Aug 15, 2020, 11:56:22 AM
    Author     : amir
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Show</h1>
        <div>
            <div>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Matric No</th>
                            <th>Current Address</th>
                            <th>Home Address</th>
                            <th>Email</th>
                            <th>Mobile number</th>
                            <th>Home no</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <!--   for (Todo todo: todos) {  -->
                    <c:forEach var="student" items="${listStudent}">

                        <tr>
                            <td>
                        <c:out value="${student.name}" />
                        </td>
                        <td>
                        <c:out value="${student.matricno}" />
                        </td>
                        <td>
                        <c:out value="${student.currentaddr}" />
                        </td>
                        <td>
                        <c:out value="${student.homeaddr}" />
                        </td>
                        <td>
                        <c:out value="${student.email}" />
                        </td>
                        <td>
                        <c:out value="${student.mobilephone}" />
                        </td>
                        <td>
                        <c:out value="${student.homephone}" />
                        </td>
                        <td><a href="edit?id=<c:out value='${student.matricno}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${student.matricno}' />">Delete</a></td>
                        </tr>
                    </c:forEach>
                    <!-- } -->
                    </tbody>

                </table>
            </div>
        </div>
    </body>
</html>
