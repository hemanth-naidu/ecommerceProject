<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.98.0">
    <title>Signin</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sign-in/">


    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css">
    <link href="css/style.css" rel="stylesheet">
  </head>
    <body class="text-center">

        <main class="form-signin w-100 m-auto">
            <form action="loginpage">
            <div class="nav">
                <ul>
                    <li><a href="home">Home</a></li>
                    <li><a href="route_register">SignUp</a></li>
                    <li><a href="route_login">Login</a></li>
                    <li><a href="about">About</a></li>
                </ul>
            </div>
                <h1 class="h3 mb-3 fw-normal">Sign In</h1>
                <input type="text" class="form-control top"  name="name"  placeholder="Enter Name" required autofocus>
                <input type="text" class="form-control middle" name="password" placeholder="Enter Password" required id="pass" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                 title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">

                 
                  <input type="submit" value="Submit" style="background-color: blue;" width="200px" height="200px">
                 
               
            </form>
        </main>
    </body>
</html>