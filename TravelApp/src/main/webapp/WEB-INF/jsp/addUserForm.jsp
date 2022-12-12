<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Add User Form</title>
</head>
<body style="background-color:rgba(255,0,0,0.5);">

<h2>Register a New User</h2>

<form:form modelAttribute="user" method="post">

<table>
<tr>
    <td>User Name:</td>
    <td><form:input path="username" size="30" /> <font color="red"><form:errors path="username"/></font></td>
</tr>

<tr>
    <td>Password:</td>
    <td><form:password path="password" size="30" /> <font color="red"><form:errors path="password"/></font></td>
</tr>

<tr>
    <td colspan="2"><input type="submit" value="Create User" /></td>
</tr>
</table>

</form:form>

</body>
</html>