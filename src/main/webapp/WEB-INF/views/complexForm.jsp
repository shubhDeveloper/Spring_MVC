<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">



<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>Form</title>
</head>
<body style="background: #dfe6e9">


	<div class="container bg-white my-3" style="width:600px;">

		<form action="pcform" method="post">
			<div class="row justify-content-center">
				<div class="col-md-10">

					<div class="text-center my-3"
						style="font-size: 80px; color: #e74c3c">
						<!-- <span class="text-center"><i class="fa fa-user-circle"></i></span> -->
						<h3 class="">Complex Form</h3>
					</div>

					<div class="my-3 pt-3">
						<label for="fname" class="form-label">Your Name</label> <input
							type="text" name="name" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp">
					</div>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">User Id</label> <input type="number" name="id" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp">
					</div>

					<div class="form-group my-3">
						<label for="inputState" class="form-label">Select City</label> <select
							class="form-control" name="city" id="inputState">
							<!-- <option selected>....</option> -->
							<option>indore</option>
							<option>bhopal</option>
							<option>pune</option>
							<option>mumbai</option>
							<option>thane</option>
						</select>
					</div>
					<div class="form-group my-3">
						<label for="exampleFormControlSelect2" class="form-label">Select
							Skills</label> <select multiple class="form-control" name="cources"
							id="exampleFormControlSelect2">
							<option>java</option>
							<option>python</option>
							<option>html</option>
							<option>javascript</option>
							<option>css</option>
							<option>django</option>
						</select>
					</div>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Date of
							birth</label> <input type="text" name="date" placeholder="dd/mm/yyyy"
							class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp">
					</div>

					<div class="form-group my-3">
						<div class="mb-2">
							<label class="form-label me-5">Gender</label>
						</div>
						<div class="form-check form-check-inline">
							<input type="radio" value="male" name="gender" class="form-check-input"
								id="male"> <label for="male" class="form-check-label">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input type="radio" name="gender" class="form-check-input"
								id="female" value="female"> <label for="female"
								class="form-check-label">Female</label>
						</div>
						<div class="form-check form-check-inline">
							<input type="radio" name="gender" value="Other" class="form-check-input"
								id="other"> <label for="other" class="form-check-label">Other</label>
						</div>
					</div>

					<div class="text-center my-5">
						<button class="button btn btn-success w-25">Submit</button>
					</div>

				</div>
			</div>
		</form>

	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    -->
</body>
</html>