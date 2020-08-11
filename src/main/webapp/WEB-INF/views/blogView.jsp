<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Wall</title>
<link rel="stylesheet" href="./css/blog.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
</head>
<body>
	<nav>
		<img src="./assets/logo.svg" alt="logo" />
		<ul>
			<li><a href="${pageContext.request.contextPath}/myblogs">My
					Blogs</a></li>
			<li><a href="${pageContext.request.contextPath}/allblogs">All
					Blogs</a></li>
			<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
			<li><a href="${pageContext.request.contextPath}/signup">Sign
					Up</a></li>
		</ul>
	</nav>
	<div class="body-div1">
		<div>Your Blogs</div>
		<a href="${pageContext.request.contextPath}/new">but
			<button class="button" id="addBlog">
				<i class="fas fa-plus-circle">Add New Post</i>
			</button>
		</a>
	</div>

</body>
</html>