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
       
      <c:forEach items="${choices}" var="Choice">

		  <p class="qtn_no">Question :  ${Choice.question.question_desc}</p>
          
          <input type="radio" name="opt" id="ans" value="1" >${Choice.choice_1}<br></td>
          <input type="radio" name="opt" id="ans" value="2" >${Choice.choice_2}<br></td>
          <input type="radio" name="opt" id="ans" value="3">${Choice.choice_3}<br></td>
          <input type="radio" name="opt" id="ans" value="4">${Choice.choice_4}<br></td>
             
</c:forEach>
    
   
</body>
</html>