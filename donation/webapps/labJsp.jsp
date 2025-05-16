
<!DOCTYPE html>
<html>
<head>
  <title>Laboratory Submission Success</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

<div class="container mt-5">
  <div class="text-center mb-4">
    <h1 class="display-5 text-success">Laboratory Details Submitted Successfully!</h1>
    <p class="lead">Here's the summary of your submission:</p>
  </div>

  <table class="table table-bordered table-hover table-striped">
    <caption class="text-center fs-5 text-muted">Laboratory Information</caption>
    <thead class="table-dark">
    <tr>
      <th>name</th>
      <th>phnumber</th>
      <th>id</th>
      <th>incharge</th>
      <th>location</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>${laboratoryDto.name}</td>
      <td>${laboratoryDto.phnumber}</td>
      <td>${laboratoryDto.id}</td>
      <td>${laboratoryDto.incharge}</td>
      <td>${laboratoryDto.location}</td>
    </tr>
    </tbody>
  </table>

  <div class="text-center mt-4">
    <a href="laboratory.jsp" class="btn btn-primary">Go Back</a>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
