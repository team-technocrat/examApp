<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Question</title>
</head>
<body>
<form action="/Admin/removeQuestion" method="post">
Question ID:<input type="text" name="question_id" placeholder="Enter question id">
<input type="submit" value="Delete Question">
</form>

</body>
</html>