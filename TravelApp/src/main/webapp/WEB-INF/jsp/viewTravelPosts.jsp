<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:rgba(180,300,21,040);">
        <table border="1" cellpadding="5" cellspacing="5">
            <tr>
                <td><b>TITLE</b></td>
                <td><b>Description</b></td>
               <%--  <td><b>Author_Username</b></td>--%>
               <td><b>Action</b></td></td>
            </tr>
            <c:forEach var="adv" items="${requestScope.TravelPosts}">
                <tr>
                    <td>${adv.title}</td>
                    <td>${adv.body}</td>
                    <%-- <td>${adv.user.username}</td>--%>
                    <td><a href="${adv.id}.htm">Delete User</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>