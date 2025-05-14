<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Donate</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      background-image: url('https://wallpaperaccess.com/full/1616109.jpg');
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
      background-color: aqua;
      padding: 30px;
      border-radius: 15px;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
      width: 400px;
    }

    .donation-box input[type="text"],
    .donation-box input[type="submit"] {
      width: 100%;
      padding: 10px;
      margin: 8px 0;
    }

    .donation-box input[type="submit"] {
      background-color: #28a745;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    .donation-box input[type="submit"]:hover {
      background-color: #218838;
    }
  </style>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
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
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
                  <a class="nav-link active"  href="fir.jsp">FIR</a>
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

<!-- Centered Donation Form -->
<div class="center-container">
  <div class="donation-box">
    <form action="donate" method="post">
      <label>Donor Name:</label>
      <input type="text" name="name" placeholder="Enter your Name" required>

      <label>Donor Ph.No:</label>
      <input type="text" name="phnumber" placeholder="Enter your Number" required>

      <label>Amount:</label>
      <input type="text" name="amount" placeholder="Enter amount" required>

      <label>Location:</label>
      <input type="text" name="location" placeholder="Enter Location" required>

      <input type="submit" value="Donate">
    </form>
  </div>
</div>

</body>
</html>
