<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/css/bootstrap-select.min.css">
</head>
<body>
	
	<div class="wrapper container my-5">
		<div class="form-wrapper">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-8 offset-lg-2 offset-md-2 offset-sm-1">
				<form:form modelAttribute="user" action="${pageContext.request.contextPath}/user" method="post" class="form-group">
					<form:input path="firstName" type="text" name="firstName" class="form-control my-2" placeholder="First Name" required="true"/>
					<form:input path="lastName" type="text" name="lastName" class="form-control my-2" placeholder="Last Name" required="true"/>
					<form:input path="authUser.email" type="email" name="email" class="form-control my-2" placeholder="Email" required="true"/>
					<form:input path="authUser.username" type="text" name="username" class="form-control my-2" placeholder="Username" required="true"/>
					<form:input path="authUser.password" type="password" name="password" class="form-control my-2" placeholder="password" required="true"/>
					<form:input path="dateOfBirth" name="dateOfBirth" class="form-control my-2" onfocus="(this.type='date')" onblur="(this.type='text')" placeholder="Date of Birth" required="true"/>
					<form:input path="joiningDate" name="joiningDate" class="form-control my-2" onfocus="(this.type='date')" onblur="(this.type='text')" placeholder="Date of Birth" required="true"/>
					<form:select path="department.id" name="department" class="form-control my-2">
						<form:option value="" label="select" />
						<form:options items="${departments}" itemValue="id" itemLabel="departmentName"/>
					</form:select>
					<form:select multiple="true" path="roleIds" name="roles" items="${roles}"  itemLabel="role" itemValue="id" class="form-control my-2 selectpicker"  />
					<input type="submit" value="submit" id="submit" class="btn btn-primary btn-block" />
				</form:form>
				</div>
			</div>
			
			
			
			<div id="table-wrapper">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Username</th>
							<th>Email</th>
							<th>Birth Date</th>
							<th>Joining Date</th>
							<th>Department</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="user" items="${users}">
							<tr>
								<td>${user.firstName}</td>
								<td>${user.lastName}</td>
								<td>${user.authUser.username}</td>
								<td>${user.authUser.email}</td>
								<td>${user.dateOfBirth}</td>
								<td>${user.joiningDate}</td>
								<td>${user.department.departmentName}</td>
								<td>
									<a href="${pageContext.request.contextPath}/user/${user.id}/edit">Edit</a> |
									<a href="${pageContext.request.contextPath}/user/${user.id}/delete">Delete</a> 
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
			</div>
		</div>
	</div>





	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/js/bootstrap-select.min.js"></script>
</body>
</html>