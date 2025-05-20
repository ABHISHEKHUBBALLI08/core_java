
<!DOCTYPE html>
<html>
<head>
  <title>License Submission Success</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

<div class="container mt-5">
  <div class="text-center mb-4">
    <h1 class="display-5 text-success">License Details Submitted Successfully!</h1>
    <p class="lead">Here's the summary of your submission:</p>
    <h1>${message}</h1>
  </div>

  <table class="table table-bordered table-hover table-striped">
    <caption class="text-center fs-5 text-muted">License Information</caption>
    <thead class="table-dark">
    <tr>
      <th>licenseType</th>
      <th>phone</th>
      <th>licenseId</th>
      <th>personName</th>
      <th>location</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>${licenseDto.licenseType}</td>
      <td>${licenseDto.phone}</td>
      <td>${licenseDto.licenseId}</td>
      <td>${licenseDto.personName}</td>
      <td>${licenseDto.personLocation}</td>
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
