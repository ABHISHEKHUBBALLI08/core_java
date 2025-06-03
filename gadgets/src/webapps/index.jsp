<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome - Gadget Management</title>
    <style>
        body {
            background-color: #f5f5f5;
            font-family: Arial, sans-serif;
            text-align: center;
            padding-top: 100px;
        }

        .container {
            background-color: white;
            display: inline-block;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px #aaa;
        }

        h1 {
            margin-bottom: 30px;
        }

        a.button {
            display: inline-block;
            padding: 10px 25px;
            background-color: #1976d2;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
        }

        a.button:hover {
            background-color: #0d47a1;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Welcome to Gadget Management System</h1>
    <a href="gadget.jsp" class="button">Go to Gadget Entry Form</a>
</div>
</body>
</html>
