<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Stampede Case Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            margin-top: 80px;
            padding: 40px;
            background-color: #ffffff;
            border-radius: 15px;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>

<div class="container d-flex justify-content-center">
    <div class="col-md-6 form-container">
        <h2 class="text-center mb-4 text-danger">Stampede Case Report</h2>

        <form action="case" method="post">
            <div class="mb-3">
                <label for="event" class="form-label">Event Name/Location</label>
                <input type="text" class="form-control" id="event" name="event" placeholder="Enter event name or location" required>
            </div>

            <div class="mb-3">
                <label for="deaths" class="form-label">Number of Deaths</label>
                <input type="number" class="form-control" id="deaths" name="deaths" placeholder="Enter number of deaths" required>
            </div>

            <div class="mb-3">
                <label for="injuries" class="form-label">Number of Injuries</label>
                <input type="number" class="form-control" id="injuries" name="injuries" placeholder="Enter number of injuries" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-danger px-5">Submit</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
