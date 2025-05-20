<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Furniture Submission Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

<div class="container mt-5">
    <div class="text-center mb-4">
        <h1 class="display-5 text-success">Furniture Details Submitted Successfully!</h1>
        <p class="lead">Here's the summary of your submission:</p>
    </div>

    <table class="table table-bordered table-hover table-striped">
        <caption class="text-center fs-5 text-muted">Furniture Information</caption>
        <thead class="table-dark">
        <tr>
            <th>Brand</th>
            <th>Material</th>
            <th>Size</th>
            <th>Model</th>
            <th>Benefits</th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>${furnitureDto.brand}</td>
            <td>${furnitureDto.material}</td>
            <td>${furnitureDto.size}</td>
            <td>${furnitureDto.model}</td>
            <td>${furnitureDto.benefits}</td>
        </tr>
        </tbody>
    </table>

    <div class="text-center mt-4">
        <a href="furniture.jsp" class="btn btn-primary">Go Back</a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
