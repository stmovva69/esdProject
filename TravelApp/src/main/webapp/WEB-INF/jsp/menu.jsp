<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    p {
  background-image: url("https://thumbs.dreamstime.com/b/time-to-travel-wooden-sign-beach-background-49509295.jpg");
}
    .button1 {
  background-color: blue;
  color: white;
  border: none;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 5px;
}

.button2 {
  background-color: red;
  color: white;
  border: none;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 5px;
}
    </style>
    <body style="background-color:rgba(255,0,0,0.5);" >
        <button class="button1"onclick="location.href='addTravelPost.htm'">Post TravelPost</button>
         <button class="button2"onclick="location.href='listTravelPosts.htm'">List TravelPosts</button>
     </body>
</html>