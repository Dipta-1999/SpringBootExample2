<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Calculator</title>
</head>
<style>
	body{
		margin-left: 10px;
		margin-right: 10px;
		margin-top: 10px;
		margin-bottom: 10px;
		border: medium;
		background-color: lime;
		border-bottom-style: solid;
		border-left-style: solid;
		border-right-style: solid;
		border-top-style: solid;
		}
	h2
	{
		color: blue;
		size: 100px;
		top: 400px;
	}
	form{
		margin-left: 10px;
		margin-right: 10px;
		margin-top: 10px;
		margin-bottom: 10px;
		font-family: cursive;
		background-color: yellow;	
		size: 100px;	
	}
	.btn{
		size: 100px;
		color: aqua;
		background-color: blue;
		padding: 10px;
		width: 100px;
		height: 40px;
		margin-left: 10px;
		font-size: medium;
		font-family: sans-serif;
		font-style: oblique;
		
	}
	.btn:hover {
		color: lime;
		background-color: red;
		font-size: large;
		font-family: fantasy;
		font-style: italic;
		opacity: inherit;
		transition: 500ms linear;
	}
</style>
<body>
	<h1 align="center" style="color:maroon;">Welcome to Basic Calculator</h1>
	<h2 align="center">Addition</h2>
	<form action="add" method="post" align="center"> 
			<label>Num1</label>
			<input type="number" id="num1" name="num1">
			<label>Num2</label>
			<input type="number" id="num2" name="num2">
			<input type="submit" value="Submit" class="btn">
		</form>
		<br>
		<h2 align="center">Subtraction</h2>
		<form action="subtract"  method="post" align="center"> 
			<label>Num1</label>
			<input type="number" id="num3" name="num3">
			<label>Num2</label>
			<input type="number" id="num4" name="num4">
			<input type="submit" value="Submit" class="btn">
		</form>
		<br>
		<h2 align="center">Multiplication</h2>
		<form action="multiply" class="form-control" method="post" align="center"> 
			<label>Num1</label>
			<input type="number" id="num5" name="num5">
			<label>Num2</label>
			<input type="number" id="num6" name="num6">
			<input type="submit" value="Submit" class="btn">
		</form>
		<br>
		<h2 align="center">Division</h2>
		<form action="divide" class="form-control" method="post" align="center"> 
			<label>Num1</label>
			<input type="number" id="num7" name="num7">
			<label>Num2</label>
			<input type="number" id="num8" name="num8">
			<input type="submit" value="Submit" class="btn">
		</form>
</body>
</html>