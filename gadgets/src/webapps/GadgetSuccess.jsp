<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gadget Saved</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e0f7fa;
            text-align: center;
            padding-top: 50px;
        }
        .box {
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px #aaa;
            display: inline-block;
        }
    </style>
</head>
<body>
<div class="box">
    <h1>${msg}</h1>

    <h2>Gadget Details</h2>
    <p><strong>ID:</strong> ${gadget.productId}</p>
    <p><strong>Name:</strong> ${gadget.productName}</p>
    <p><strong>Price:</strong> ${gadget.price}</p>
    <p><strong>Quantity:</strong> ${gadget.quantity}</p>
    <p><strong>Category:</strong> ${gadget.category}</p>
</div>
</body>
</html>
