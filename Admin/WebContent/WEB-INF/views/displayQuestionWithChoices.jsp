<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.lti.model.* , java.util.* ,java.io.* "%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Questions</title>
</head>
<body>

<h2>List of all Questions</h2>
<h2>${s1}</h2>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>Question Description</th>
        	<th>Technology</th>
            <th>A</th>
            <th>B</th>
            <th>C</th>
            <th>D</th>
            <!--  <th>Technology_id</th>
            <th>level_id</th>-->
            
             
        </tr>
      <c:forEach items="${choices}" var="Choice">
<tr>
          <td>${Choice.question.question_desc}<br></td> 
          <td>${Choice.question.technologies.technology_name}<br></td> 
          <td>${Choice.choice_1}<br></td>
          <td>${Choice.choice_2}<br></td>
          <td>${Choice.choice_3}<br></td>
          <td>${Choice.choice_4}<br></td>
         
     </tr>
</c:forEach>
    </table>
   
</body>
</html>