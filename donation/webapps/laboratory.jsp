<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
    body {
      background-image: url('https://png.pngtree.com/background/20230401/original/pngtree-science-and-technology-laboratory-background-picture-image_2253322.jpg');
      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;
      background-attachment: fixed;
      min-height: 100vh;
    }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-info">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="donation.jsp">Donation</a></li>
                <li class="nav-item"><a class="nav-link active" href="license.jsp">License</a></li>
                <li class="nav-item"><a class="nav-link active" href="feedback.jsp">Feed back</a></li>
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
<div class="d-flex justify-content-center align-items-center" style="min-height: 90vh;">
    <div class="card p-4 shadow" style="width: 100%; max-width: 450px; background-color: rgba(173, 216, 230, 0.9); border-radius: 15px;">
        <h4 class="text-center mb-3">Donate Laboratory Details</h4>
        <form action="lab" method="post">
            <div class="mb-3">
                <label class="form-label">Laboratory Name</label>
                <input type="text" name="name" class="form-control" placeholder="Enter laboratory name" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="number" name="phnumber" class="form-control" placeholder="Enter phone number" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Laboratory ID</label>
                <input type="number" name="id" class="form-control" placeholder="Enter ID" required>
            </div>
            <div class="mb-3">
                <label class="form-label">InCharge Name</label>
                <input type="text" name="incharge" class="form-control" placeholder="Enter in-charge name" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control" placeholder="Enter location" required>
            </div>
            <div class="d-grid">
                <button type="submit" class="btn btn-success">Submit</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
