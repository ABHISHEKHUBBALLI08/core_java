<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Donate</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
  <style>
    body {
      margin: 0;
      padding: 0;
      background-image: url('https://getwallpapers.com/wallpaper/full/b/c/9/1376442-crime-scene-wallpaper-1920x1200-4k.jpg');
      background-repeat: no-repeat;
      background-size: cover;
      background-position: center;
      background-attachment: fixed;
      height: 100vh;
      display: flex;
      flex-direction: column;
    }

    .center-container {
      flex: 1;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .donation-box {
      background-color: rgba(128, 128, 128, 0.9);
      padding: 30px;
      border-radius: 15px;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
      width: 100%;
      max-width: 500px;
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
        <li class="nav-item">
          <a class="nav-link active" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="donation.jsp">Donation</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="license.jsp">License</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="feedback.jsp">Feed back</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="laboratory.jsp">Laboratory</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<!-- Donation Form -->
<div class="center-container">
  <div class="donation-box">
    <form action="fir" method="post">
      <div class="mb-3">
        <label class="form-label">Accuse Name:</label>
        <input type="text" class="form-control" name="name" placeholder="Enter accuse Name" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Ph.No of suspect:</label>
        <input type="number" class="form-control" name="phnumber" placeholder="Enter suspect Number" required>
      </div>
      <div class="mb-3">
        <label class="form-label">FIR.No</label>
        <input type="number" class="form-control" name="fir" placeholder="Enter FIR number" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Police Station</label>
        <input type="text" class="form-control" name="police" placeholder="Enter police station Name" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Place of Occurrence</label>
        <input type="text" class="form-control" name="location" placeholder="Enter Place of Occurrence" required>
      </div>
      <button type="submit" class="btn btn-success w-100">Get Details</button>
    </form>
  </div>
</div>

</body>
</html>
