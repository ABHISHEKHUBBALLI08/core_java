<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="margin:0; padding:0; background-image: url('https://wallpaperaccess.com/full/1616109.jpg'); background-repeat: no-repeat; background-size: cover; background-position: center; background-attachment: fixed; min-height: 100vh; display: flex; flex-direction: column;">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-info">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">YourPortal</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="fir.jsp">FIR</a></li>
                <li class="nav-item"><a class="nav-link active" href="license.jsp">License</a></li>
                <li class="nav-item"><a class="nav-link active" href="feedback.jsp">Feedback</a></li>
                <li class="nav-item"><a class="nav-link active" href="laboratory.jsp">Laboratory</a></li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<!-- Donation Form -->
<div class="container d-flex justify-content-center align-items-center flex-grow-1 my-5">
    <div class="card p-4 shadow-lg" style="width: 100%; max-width: 500px; background-color: rgba(0, 255, 255, 0.9);">
        <h4 class="text-center mb-4">Make a Donation</h4>
        <form action="donate" method="post">
            <div class="mb-3">
                <label class="form-label">Donor Name</label>
                <input type="text" name="name" class="form-control" placeholder="Enter your Name" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="text" name="phnumber" class="form-control" placeholder="Enter your Number" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Amount</label>
                <input type="text" name="amount" class="form-control" placeholder="Enter amount" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control" placeholder="Enter Location" required>
            </div>
            <button type="submit" class="btn btn-success w-100">Donate</button>
        </form>
    </div>
</div>

</body>
</html>
