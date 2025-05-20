<!DOCTYPE html>
<html>
<head>
    <title>Furniture</title>
    <style>
        body {
            background-image: url('https://wallpapers.com/images/hd/toys-background-qtmsuk8a0o42c7au.jpg');
            background-size: cover;
            background-repeat: no-repeat;
        }

        .form-container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 30px;
            border-radius: 15px;
            max-width: 600px;
            margin: 50px auto;
            box-shadow: 0 0 10px rgba(0,0,0,0.3);
        }
    </style>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-info">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Toy logo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="toy.jsp">Buy Toys</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<h1>${message}</h1>
<!-- Centered Form -->
<div class="form-container">
    <h3 class="text-center mb-4">Add Toy Details</h3>
    <form action="toy" method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name" placeholder="Enter toy name">
        </div>

        <div class="mb-3">
            <label class="form-label">Type</label>
            <select class="form-select" name="type">
                <option>Educational</option>
                <option>Soft Toy</option>
                <option>Electronic</option>
                <option>Outdoor</option>
                <option>Other</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Incoming Price</label>
            <input type="number"  name="price" class="form-control" placeholder="Enter incoming price">
        </div>

        <div class="mb-3">
            <label class="form-label">Selling Price</label>
            <input type="number" name="selling" class="form-control" placeholder="Enter selling price">
        </div>

        <div class="mb-3">
            <label class="form-label">MRP</label>
            <input type="number" name="mrp" class="form-control" placeholder="Enter MRP">
        </div>

        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea class="form-control" name="description" rows="3" placeholder="Enter description"></textarea>
        </div>

        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" name="brand" class="form-control" placeholder="Enter brand">
        </div>

        <div class="mb-3">
            <label class="form-label">Quantity</label>
            <input type="number" name="quantity" class="form-control" placeholder="Enter quantity">
        </div>

        <div class="mb-3">
            <label class="form-label" name="color">Color</label>
            <select class="form-select">
                <option>Red</option>
                <option>Blue</option>
                <option>Green</option>
                <option>Yellow</option>
                <option>Other</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Weight</label>
            <input type="text" name="weight" class="form-control" placeholder="Enter weight (e.g. 1.5kg)">
        </div>

        <div class="mb-3">
            <label class="form-label">Manufacture Date</label>
            <input type="date" name="date" class="form-control">
        </div>

        <div class="mb-3">
            <label class="form-label">Warranty</label>
            <select class="form-select" name="warranty">
                <option>No Warranty</option>
                <option>6 Months</option>
                <option>1 Year</option>
                <option>2 Years</option>
            </select>
        </div>

        <div class="form-check mb-3">
            <input class="form-check-input" name="Return" type="checkbox" id="returnPolicy">
            <label class="form-check-label" for="returnPolicy">
                Return Policy Available
            </label>
        </div>

        <div class="d-grid">
            <button type="submit"  class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>

</body>
</html>
