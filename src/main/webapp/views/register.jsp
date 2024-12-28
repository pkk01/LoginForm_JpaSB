<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>pk</title>
    <link rel="stylesheet" href="style.css" />
  </head>
  <body class="body_bg">
    <!-- for success msg -->
    <c:if test=" ${not empty successMsg}">
      <h4 style="color: green">${successMsg}</h4>
    </c:if>

    <!-- for error msg -->
    <c:if test=" ${not empty errorMsg}">
      <h4 style="color: red">${errorMsg}</h4>
    </c:if>

    <h1>welcome to the club</h1>
    <h4>Register here</h4>
    <form action="regForm" method="post">
      Name: <input type="text" name="name" /> <br /><br />
      Email: <input type="text" name="email" /> <br /><br />
      Password: <input type="password" name="password" /> <br /><br />
      Phone no.: <input type="number" name="phoneno" /> <br /><br />
      <input type="submit" value="Register" /> <br />
      <br />
      <a href="loginPage">already Registered?</a>
    </form>
  </body>
</html>
