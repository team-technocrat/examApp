<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Start Exam</title>
 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  
  <link href=${pageContext.request.contextPath}/resources/css/style.css/>
  
</head>

 <%!int qnno=1;%>
<body  onload="countdown();">
  <div class="abc">
<img src="logo4.jpg">
  <a href="">Home</a>
  <a href="">About Us </a>
  <a href="">Contact Us</a>
</div>

 <form method="post" id="test" action="/Admin/question/submit" >
        <div id="mcq">
             <div id="review_box">
               <input id="minutes" type="text" style="width: 10px; border: none; font-size: 16px; font-weight: bold; color: black;"><font size="5"> : </font> 
 <input id="seconds" type="text" style="width: 20px; border: none; font-size: 16px; font-weight: bold; color: black;">
            </div>
            <br>
            <br><br>
            
            <p class="qtn_no">Question :  <%out.print(qnno+" / 10");%></p>
            <c:forEach items="${questions}" var="Question">
            <p class="qtn">${Question.question_desc}</p>
            <input type="hidden" name="question_id" value="${Question.question_id}">
            
            <div class="options">
  
			
            <input type="radio" name="${Question.question_id}" id="ans" value="${Question.choices.choice_1} " >${ Question.choices.choice_1 }<br><br>
            <input type="radio" name="${Question.question_id}" id="ans" value="${Question.choices.choice_2}">${ Question.choices.choice_2 }<br><br>
            <input type="radio" name="${Question.question_id}" id="ans" value="${Question.choices.choice_1}">${ Question.choices.choice_3 }<br><br>
            <input type="radio" name="${Question.question_id}" id="ans" value="${Question.choices.choice_1}">${ Question.choices.choice_4 }<br><br>
            </c:forEach>
            <input type="hidden" name="opt" value="0">   


            </div>
            <input type="submit" value="Submit" name="butn" id="testbutton">
        </div>
            </div>
    </form>
<%qnno++; %>

</body>
<script> 
  var mins = 2; 
  function selectedOption()
  {
      var form = document.getElementById("test");
      form.submit();
  }
 
  var secs = mins * 60; 

  function countdown() { 
      setTimeout('Decrement()', 60); 
  } 

  function Decrement() { 
      if (document.getElementById) { 
          minutes = document.getElementById("minutes"); 
          seconds = document.getElementById("seconds"); 
          
          if (seconds < 59) { 
              seconds.value = secs; 
          } 

          else { 
              minutes.value = getminutes(); 
              seconds.value = getseconds(); 
          } 
          
          if (mins < 1) { 
              minutes.style.color = "red"; 
              seconds.style.color = "red"; 
          } 
         
          if (mins < 0) { 
              minutes.value = 0; 
              seconds.value = 0; 
              selectedOption();
          } 
          
          else { 
              secs--; 
              setTimeout('Decrement()', 1000); 
          } 
      } 
  } 

  function getminutes() { 
      
      mins = Math.floor(secs / 60); 
      return mins; 
  } 

  function getseconds() { 
      return secs - Math.round(mins * 60);
  	  	
  } 
  
  </script>
</html>