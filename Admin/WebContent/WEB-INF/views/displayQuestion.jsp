<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display buses</title>
</head>
<body>
<caption>
<h2>List of all Questions</h2></caption>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>Question Id</th>
            <th>Question_desc</th>
            <!--  <th>Technology_id</th>
            <th>level_id</th>-->
            
             
        </tr>
      <c:forEach items="${questions}" var="Question">
<tr>
          <td> ${Question.question_id}<br></td>
          <td>${Question.question_desc}<br></td>
         
     </tr>
</c:forEach>
    </table>
   
</body>
</html>