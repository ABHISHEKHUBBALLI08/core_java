<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Feedback Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

    <style>
    body {
      background-image: url('https://static.vecteezy.com/system/resources/previews/002/197/246/large_2x/glowing-neon-line-clipboard-with-checklist-icon-isolated-on-brick-wall-background-control-list-symbol-survey-poll-or-questionnaire-feedback-form-illustration-isolated-on-brick-wall-vector.jpg');
      background-repeat: no-repeat;
      background-size: cover;
      background-position: center;
      background-attachment: fixed;
      min-height: 100vh;
    }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">YourPortal</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="fir.jsp">FIR</a></li>
                <li class="nav-item"><a class="nav-link active" href="donation.jsp">Donation</a></li>
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

<!-- Feedback Form Section -->
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card p-4 shadow-lg" style="width: 100%; max-width: 500px; background-color: rgba(128,0,128,0.9); color: white;">
        <h4 class="text-center mb-4">Submit Your Feedback</h4>
        <form action="feedback" method="post">
            <div class="mb-3">
                <label class="form-label">Feedback Type</label>
                <input type="text" class="form-control" name="type" placeholder="e.g., Complaint, Suggestion" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="number" class="form-control" name="phnumber" placeholder="Enter your phone number" required>
            </div>
            <div class="mb-3">
                <label class="form-label">User ID</label>
                <input type="number" class="form-control" name="id" placeholder="Enter your user ID" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Full Name</label>
                <input type="text" class="form-control" name="name" placeholder="Enter your name" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" class="form-control" name="location" placeholder="Enter your location" required>
            </div>
            <button type="submit" class="btn btn-success w-100">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
