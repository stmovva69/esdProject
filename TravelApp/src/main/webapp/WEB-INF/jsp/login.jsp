<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>login</title>
    <style>
        .form {
            width: 1000px;
            height: 600px;
            border: 1px solid white;
            box-shadow: 0px 0px 10px gray;
            margin: auto;
        }
        .form h2 {
            font-size: 30px;
            border-bottom: 3px solid black;
            color: black;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            padding: 4px;
            text-align: center;
        }
        .box {
            position: fixed;
            top: 5px;
            left: 115px;
            width: 800px;
            height: 580px;
            border: 1px solid white;
            box-shadow: 0px 0px 10px gray;
            margin: auto;
            margin-top: 30px;
        }
        .box h2 {
            font-size: 50px;
            border-bottom: 2px solid black;
            color: black;
            font-family: 'Times New Roman', Times, serif;
            padding: 10px ;
            text-align: center;
            text-shadow: 0px 0px 2px black;
        }
        .login{
            text-align: center;
            margin-top:90px;
        }
        .login label {
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            padding: 15px;
            font-size: 25px;
            text-shadow: 0 0 1px black;
        }
        .login input {
            margin: 20px;
            width: 400px;
            border: none;
            border-bottom: 1px solid black;
            height: 50px;
            font-size: 25px;
            text-align: center;
            font-weight: lighter;
        }
        .button {
            padding: 10px;
            background-color: black;
            color: white;
            font-size: 20px;
            border: none;
            width: 80%;
            position: absolute;
            bottom: 45px;
            right:70px;
        }
    </style>
<body style="background-color:rgba(255,0,0,0.5);">
    <div class="box">
        <h2>
            Login here
        </h2>
        <form:form modelAttribute="user" method="post" class="login">
            <label for="">
                Enter your Username
            </label>
            <br>
            <form:input type="text" path="username"/>
            <br>
            <label for="">
                Enter your Password
            </label>
            <br>
            <form:input type="password" path="password"/>
            <br>
            <button type="submit">
                login
            </button>
             <a href="adduser.htm" >Register User</a><br>
        </form:form>
    </div>
</body>
</html>