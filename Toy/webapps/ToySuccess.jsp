<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.abhi.toy.dto.ToyDto" %>
<%
ToyDto toy = (ToyDto) request.getAttribute("toyDto");
%>
<html>
<head>
    <title>Toy Submission Success</title>
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://wallpapers.com/images/hd/toys-background-qtmsuk8a0o42c7au.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            padding-top: 50px;
        }
        .table-container {
            max-width: 800px;
            margin: auto;
            background: rgba(255, 255, 255, 0.95);
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-info">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Toy logo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="toy.jsp">Buy Toys</a>
                </li>


            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<div class="table-container">
    <h2 class="text-center mb-4 text-primary">Toy Details Submitted Successfully</h2>
    <table class="table table-bordered table-striped">
        <tbody>
        <tr>
            <th>Name</th>
            <td><%= toy.getName() %></td>
        </tr>
        <tr>
            <th>Type</th>
            <td><%= toy.getType() %></td>
        </tr>
        <tr>
            <th>Incoming Price</th>
            <td><%= toy.getPrice() %></td>
        </tr>
        <tr>
            <th>Selling Price</th>
            <td><%= toy.getSelling() %></td>
        </tr>
        <tr>
            <th>MRP</th>
            <td><%= toy.getMrp() %></td>
        </tr>
        <tr>
            <th>Description</th>
            <td><%= toy.getDescription() %></td>
        </tr>
        <tr>
            <th>Brand</th>
            <td><%= toy.getBrand() %></td>
        </tr>
        <tr>
            <th>Quantity</th>
            <td><%= toy.getQuantity() %></td>
        </tr>
        <tr>
            <th>Color</th>
            <td><%= toy.getColor() %></td>
        </tr>
        <tr>
            <th>Weight</th>
            <td><%= toy.getWeight() %></td>
        </tr>
        <tr>
            <th>Manufacture Date</th>
            <td><%= toy.getDate() %></td>
        </tr>
        <tr>
            <th>Warranty</th>
            <td><%= toy.getWarranty() %></td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
