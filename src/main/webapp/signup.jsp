<%-- 
    Document   : sign up
    Created on : Aug 15, 2020, 12:29:13 PM
    Author     : amir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css">
        <title>Sign Up</title>
    </head>
    <style>
        label{
            display:inline-block;
        }
        .student_form{
            margin-left:150px;
            margin-top:2em;
        }
        .input[type=text]:after{
            content: "";
            display: table;
            clear: both;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Admin Registration Form</h1>
    <form action="RegisterServlet" method="post" id="myform" onsubmit="myfunctionl()">
        <div class="student_form"><br>
            <div class="eleven columns">
                <label for="Name" class="three columns">Name</label>
                <input class="six columns" type="text"name="fullName" id="name">
            </div>


            <div class="eleven columns"><label for="Email" class="three columns">Email (Gmail Account)</label><input class="three columns" type="email" name="Email" placeholder="abc@gmail.com" id="email"></div>
            <div class="eleven columns"><label for="MobileNo" class="three columns">Mobile Phone No</label><input class="three columns" type="tel" name="MobileNo" id="mobileno " pattern="^\d{4}-\d{3}-\d{4}$"  min="10" placeholder="xxxx-xxx-xxxx"required ></div>
            <div class="eleven columns"><label for="Password" class="three columns">Password</label><input class="three columns" type="password" name="password" id="password "required ></div>
            <div class="eleven columns"><label for="Re-Type" class="three columns">Re-Type Password</label><input class="three columns" type="password" name="repassword" id="repassword " required ></div>
            <div class="eleven columns"><div class="eight columns"><button class="button-secondary" type="button" onclick="reset()">Reset</button></div><input class="button-primary" type="submit" value="Submit"></div>
        </div>

    </form>
    <script>
        function reset() {
            document.getElementById("myform").reset();
        }

        function validateEmail() {

            var email = document.getElementById("Email");
            var password = document.getElementById("password").value;
            var repassword = document.getElementById("repassword").value;
            var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            if (!filter.test(email.value)) {
                alert('Please provide a valid email address');
                return false;

            }
            if (repassword !== password)
            {
                alert('Passwords do not match');
                return false;
            }

            return true;

        }

        function myfunction() {
            alert("The form was submitted");
        }
    </script>
</body>
</html>
