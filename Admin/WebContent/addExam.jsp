<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Exam</title>
</head>
<body>
<form action="/Admin/addExam" method="POST">
Level:<input type="text" name="level_id" placeholder="Enter level"><br><br>
Appearing Date:<input type="text" name="appearing_date" placeholder="Enter Date of Appearing"><br><br>
Status:<input type="text" name="status" placeholder="Enter status"><br><br>
Remarks:<input type="text" name="remarks" placeholder="Enter remarks"><br><br>
NoOfQuestions:<input type="text" name="no_of_questions" placeholder="Enter No Of Questions"><br><br>
PassingPercentage:<input type="text" name="passing_percentage" placeholder="Enter Passing Percentage"><br><br>
<input type="submit" value="Submit Exam">
</form>

</body>
</html>