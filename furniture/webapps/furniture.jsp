<!DOCTYPE html>
<html>
<head>
    <title>Furniture</title>
    <style>
    body {
      margin: 0;
      height: 100vh;
      background-image: url('https://images6.alphacoders.com/372/372496.jpg');
      background-size: cover;
      background-repeat: no-repeat;
      background-position: center;
      display: flex;
      flex-direction: column;
    }

    .main-container {
      flex: 1;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .form-container {
      background: rgba(0, 0, 0, 0.6);
      padding: 30px;
      border-radius: 15px;
      box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);
      width: 100%;
      max-width: 500px;
      color: #fff;
    }

    form label {
      display: block;
      margin-top: 15px;
      font-weight: bold;
    }

    form input, form select, form textarea {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border: none;
      border-radius: 5px;
      box-sizing: border-box;
    }

    button {
      margin-top: 20px;
      width: 100%;
      padding: 12px;
      background-color: #007BFF;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }

    button:hover {
      background-color: #0056b3;
    }
  </style>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

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
                    <a class="nav-link" href="furniture.jsp">Buy</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="main-container">
    <div class="form-container">
        <h1>Fill the form</h1>
        <form>
            <label>Brand</label>
            <input type="text" name="brand" required>

            <label>Material</label>
            <input type="text" name="material" required>

            <label>Size</label>
            <select name="size" required>
                <option value="">Select Size</option>
                <option>S</option>
                <option>M</option>
                <option>L</option>
                <option>XL</option>
            </select>

            <label>Model Name</label>
            <input type="text" name="model" required>

            <label>Product Benefits</label>
            <textarea name="benefits" rows="4" placeholder="Describe the benefits..." required></textarea>

            <button type="submit">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
