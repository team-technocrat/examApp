<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<caption>
<h2>List of all Score</h2></caption>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>User Id</th>
            <th>Score</th>
             
        </tr>
      <c:forEach items="${score}" var="Score">
<tr>
          <td> ${Score.user_id}<br></td>
          <td>${Score.tot_score}<br></td>
         
     </tr>
</c:forEach>
    </table>
   
</body>
</html>