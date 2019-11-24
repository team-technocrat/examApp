<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Questions</title>
</head>
<body>
<form action="/Admin/addQuestion" method="post">
Question_Desc: <input type="text" name="question_desc" placeholder="Enter Question Description" ><br><br>
Technology_id: <input type="text" name="technology_id" placeholder="Enter Technology Name" ><br><br>
Level_id: <input type="text" name="level_id" placeholder="Enter Level " ><br><br>
<input type="submit" value="Submit question">
</form>
</body>
</html>