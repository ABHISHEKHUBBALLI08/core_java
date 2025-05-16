
<!DOCTYPE html>
<html>
<head>
  <title>Furniture Submission Success</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

<div class="container mt-5">
  <div class="text-center mb-4">
    <h1 class="display-5 text-success">Donation Details Submitted Successfully!</h1>
    <p class="lead">Here's the summary of your submission:</p>
  </div>

  <table class="table table-bordered table-hover table-striped">
    <caption class="text-center fs-5 text-muted">Donation Information</caption>
    <thead class="table-dark">
    <tr>
      <th>name</th>
      <th>phno</th>
      <th>amount1</th>
      <th>location</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>${donationDto.name}</td>
      <td>${donationDto.phnumber}</td>
      <td>${donationDto.amount}</td>
      <td>${donationDto.location}</td>
    </tr>
    </tbody>
  </table>

  <div class="text-center mt-4">
    <a href="donation.jsp" class="btn btn-primary">Go Back</a>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
