<%-- 
    Document   : create
    Created on : Aug 15, 2020, 11:56:06 AM
    Author     : amir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css">
        <title>Create New record</title>
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

        <h1 style="text-align: center;">Student Registration Form</h1>
        <form action="ValidateData" method="post" id="myform" onsubmit="return validateEmail()">
            <div class="student_form"><br>
                <div class="eleven columns">
                    <label for="Name" class="three columns">Name</label>
                    <input class="six columns" type="text"name="fullName" id="name">
                </div>
                <div class="eleven columns">
                    <label for="Matric No" class="three columns">Matric No</label>
                    <input class="three columns" type="number" name="MatricNo" id="MatricNo" pattern="^([0-9]{7})$" placeholder="1234567"></div>
                <div class="eleven columns">	
                    <label for="Current Address" class="three columns">Current Address</label><textarea class="six columns" name="CurrentAddr" id="CurrentAddr"></textarea></div>
                <div class="eleven columns"><label for="Home Address" class="three columns">Home Address</label> <textarea class="six columns" name="HomeAddr" id="HomeAddr"></textarea></div>
                <div class="eleven columns"><label for="Email" class="three columns">Email (Gmail Account)</label><input class="three columns" type="email" name="Email" placeholder="abc@gmail.com" id="Email"></div>
                <div class="eleven columns"><label for="MobileNo" class="three columns">Mobile Phone No</label><input class="three columns" type="tel" name="MobileNo" id="MobileNo " pattern="^\d{4}-\d{3}-\d{4}$"  min="10" placeholder="xxxx-xxx-xxxx"required ></div>
                <div class="eleven columns"><label for="HomePhoneNo" class="three columns">Home Phone No (Emergency)</label> <input class="three columns"type="tel" name="HomeNo" id="HomeNo" pattern="^\d{4}-\d{3}-\d{4}$" placeholder="xxxx-xxx-xxxx" ></div><br>
                <div class="eleven columns"><div class="eight columns"><button class="button-secondary" type="button" onclick="clear()">Reset</button></div><input class="button-primary" type="submit" value="Submit"></div>
            </div>

        </form>
        <script>
            function clear() {
                document.getElementById("myform").reset();
            }

            function validateEmail() {

                var email = document.getElementById("Email");
                var matric = document.getElementById("MatricNo");
                var matfilter = /^([0-9]{7})$/;
                var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

                if (!filter.test(email.value)) {
                    alert('Please provide a valid email address');
                    return false;

                }

                if (!matfilter.test(matric.value)) {
                    return false;
                }

            }
        </script>
    </body>
</html>
