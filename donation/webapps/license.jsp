<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Donate</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      background-image: url('https://static.vecteezy.com/system/resources/previews/013/673/095/non_2x/licensing-license-agreement-concept-patents-copyright-intellectual-protection-law-license-property-rights-business-technology-concept-with-magnifier-in-wireframe-hand-and-icons-illustration-vector.jpg');
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
      background-color: blue;
      color:white;
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
                <a class="nav-link active" href="donation.jsp">Donation</a>
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
      <label class="form-label">license type:</label>
      <input type="text" class="form-control" name="name" placeholder="Enter your Name" required>

     <label class="form-label">Ph.No :</label>
     <input type="number" class="form-control" name="phnumber" placeholder="Enter phone Number" required>

     <label class="form-label">License ID:</label>
     <input type="number" class="form-control" name="id" placeholder="Enter license Id" required>

     <label class="form-label">person name:</label>
     <input type="text"  class="form-control" name="person" placeholder="Enter person Name" required>

     <label class="form-label" >person location:</label>
     <input type="text" class="form-control" name="location" placeholder="Enter person location" required>

     <input type="submit" value="submit">
    </form>
  </div>
</div>

</body>
</html>
