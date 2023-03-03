<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.mainDiv {
	width: 500px;
	margin: 0 auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-shadow: 0 0 5px #ccc;
	font-family: Arial, sans-serif;
}

h1 {
	font-family: Arial, sans-serif;
	font-size: 32px;
	color: #4CAF50;
	text-align: center;
	margin-bottom: 20px;
}

input {
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin-bottom: 10px;
	width: 100%;
	box-sizing: border-box;
	font-size: 16px;
	font-family: Arial, sans-serif;
}

button[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	font-family: Arial, sans-serif;
	margin-top: 10px;
	width: 100%;
	box-sizing: border-box;
}

button[type="submit"]:hover {
	background-color: #3e8e41;
}
</style>
</head>
<body>
	<div class="mainDiv">
		<h1>Product Form</h1>
		<form action="add-product">
			Name : <input name="name" /><br> Quantity : <input type= "number" name="quantity" /><br>
			Price : <input type="number" step="0.01" name="price" />
			<button type="submit">Add</button>
		</form>
	</div>

</body>
</html>