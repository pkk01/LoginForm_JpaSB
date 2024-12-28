<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>pk</title>
    <link rel="stylesheet" href="style.css" />
  </head>
  <body class="body_bg">
    <!-- for error msg -->
    <c:if test=" ${not empty errorMsg}">
      <h4 style="color: red">${errorMsg}</h4>
    </c:if>

    <h1>welcome to the club</h1>
    <h4>login here</h4>
    <form action="loginForm" method="post">
      Email: <input type="text" name="email" /> <br /><br />
      Password: <input type="password" name="password" /> <br /><br />
      <input type="submit" value="Login" />

      <a href="regPage">not yet Registered?</a>
    </form>
  </body>
</html>
