<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Choice Adding Page</title>
</head>
<body>
<form method="POST" action="/Admin/addChoices">
<!--  Question_id:<input type="text" name="question_id" placeholder="Enter Question id">-->
Choice 1:<input type="text" name="choice_1" placeholder="Enter Choice 1"><br><br>
Choice 2:<input type="text" name="choice_2" placeholder="Enter Choice 2"><br><br>
Choice 3:<input type="text" name="choice_3" placeholder="Enter Choice 3"><br><br>
Choice 4:<input type="text" name="choice_4" placeholder="Enter Choice 4"><br><br>
Correct Ans:<input type="text" name="correct_ans" placeholder="Enter Correct Ans"><br><br>
Question ID:<input type="text" name="question_id" placeholder="Enter Question ID"><br><br>
<input type="submit" value="Submit Choices">
</form>



</body>
</html>