<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CheckOutPage</title>

 <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sign-in/">


    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>




<main class="form-signin w-100 m-auto">
<div class="nav">
                <ul>
                    <li><a href="home">Home</a></li>
                    <li><a href="route_register">SignUp</a></li>
                    <li><a href="route_login">Login</a></li>
                    <li><a href="about">About</a></li>
                </ul>
            </div>

<div>
            <form action="payment">
            <h1>Enter payment Details</h1>
                
                
               <input type="text" class="form-control top"  name="cardNo"  placeholder="Enter Card Number" required autofocus>
               
               
                <input type="text" class="form-control top"  name="expiry"  placeholder="Enter Expiry" required autofocus>
               
                <input type="text" class="form-control middle" name="amount" placeholder="Amount" value="1000">
                <!--  <p>
                  <input type="text" class="form-control bottom" name="Re-password" placeholder="Re Enter Password" required id="re-pass" onchange=" valid_pass()" >
                  <span id="msg"></span>
                 </p> -->
                 
                 <input type="submit" value="Submit" style="background-color: blue;" width="200px" height="200px">
               
            </form>
        </main>

</body>
</html>