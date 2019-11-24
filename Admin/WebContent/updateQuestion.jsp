<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Question</title>
</head>
<body>
<form action="/Admin/updateQuestion" method="post">
Question_id:<input type="text" name="question_id" placeholder="Enter ID"><br><br>
Question Description:<input type="text" name="question_desc" placeholder="Enter Description"><br><br>
<input type="submit" value="Update Question">
</form>
</body>
</html>