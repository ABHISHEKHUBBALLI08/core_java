<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gadget Entry</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f1f8e9;
            padding: 30px;
        }
        form {
            max-width: 500px;
            margin: auto;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px #aaa;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 6px;
        }
        input[type=submit] {
            background-color: #43a047;
            color: white;
            cursor: pointer;
            border: none;
        }
        input[type=submit]:hover {
            background-color: #388e3c;
        }
        .error {
            color: red;
            text-align: center;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h2 style="text-align: center;">Enter Gadget Details</h2>
<c:if test="${not empty msg}">
    <p class="error">${msg}</p>
</c:if>
<form action="gadget" method="post">
    <label>Product ID:</label>
    <input type="number" name="productId" required>

    <label>Product Name:</label>
    <input type="text" name="productName" required>

    <label>Price:</label>
    <input type="number" step="0.01" name="price" required>

    <label>Quantity:</label>
    <input type="number" name="quantity" required>

    <label>Category:</label>
    <select name="category" required>
        <option value="">Select category</option>
        <option value="Electronics">Electronics</option>
        <option value="Clothing">Clothing</option>
        <option value="Books">Books</option>
        <option value="Home">Home</option>
    </select>

    <input type="submit" value="Save Gadget">
</form>
</body>
</html>
