<%@page import="com.example.travelapp.dao.UserDAO"%>
<%@page import="com.example.travelapp.pojo.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>



<html>
    <head>
        <title>Add Travel post Form</title>
    </head>
    <body style="background-color:rgba(255,0,0,0.5);">

        <h2>Posting a New Travel Post</h2>

        <form:form modelAttribute="TravelPost" method="post" >

            <table>

<%--                 <tr>
                    <td>User:</td>
                    <td>
                        <form:select path="user">
                            <c:forEach var="user" items="${users}">
                                <form:option value="${user.username}"/>
                            </c:forEach>
                        </form:select>
                    </td>
                </tr> --%>

                <tr>
                    <td>Travel Post Title:</td>
                    <td><form:input path="title" size="30" /> <font color="red"><form:errors path="title"/></font></td>
                </tr>

                <tr>
                    <td>description:</td>
                    <td><form:input path="body" size="30" /> <font color="red"><form:errors path="body"/></font></td>
                </tr>

               

                <tr>
                    <td colspan="2"><input type="submit" value="Post TravelPost" /></td>
                </tr>
            </table>

        </form:form>

    </body>
</html>