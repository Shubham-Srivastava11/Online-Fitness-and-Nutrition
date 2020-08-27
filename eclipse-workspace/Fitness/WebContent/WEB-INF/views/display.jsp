<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<style>
body{
	background-image: url('C:\\Users\\shubh\\eclipse-workspace\\Fitness\\Images\\back_4.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	
}
.tr_main{
	background-color: rgba(0, 0, 0, 0.51);
	border-radius: 5px;
	color: #ffffff;
}
tr{
	background-color: rgba(255,255, 255, 0.51);	
	border-radius: 5px;
}
.h3{
	background-color: rgba(0, 0, 0, 0.81);
	color: #ffffff;
	border-radius:10px;
	margin: 10px;
	
}
h1{
	text-align: center;
	color: rgba(255, 87, 51, 0.81);
}
h3,h4{
	font-family:courier;
	padding:2px;
	margin-left: 2px;
	margin-right:50px;
}
pre{
	font-family:courier;
	padding:4px;
	margin-left: 2px;
}
p{
	color: #FF5733;
}
#tb1{
	width: 30%;
	float: left;
	margin: 40px;
	border-radius: 5px;
}
#tb2{
	width: 30%;
	float: right;
	margin: 40px;
	border-radius: 5px;
}
caption{
	background-color: rgba(255, 87, 51, 0.81);
	padding: 3px;
	border-radius: 5px;
}

</style>
<body>
	<h1>Diet/Workout Details</h1>
	<div class="h3">
		<h3>
			<%if(request.getAttribute("res")!=null || request.getAttribute("cat")!=null){%>                   
        	Your BMI is : ${res}(${cat})<%}%>
        </h3>
   		 
   		 <h3>	
   		 	<%if(request.getAttribute("fat")!=null){%>                   
        	Your Body fat is : ${fat}%<%}%>
        </h3>
        
   		 <pre><u>Gym in your city</u> : <br><%if(request.getAttribute("gym")!=null){%>${gym}<%}%><br><u>Health center in your city</u> : <br><%if(request.getAttribute("center")!=null){%>${center}<%}%>
   		 </pre>
   	</div>
   	
   	<div class="h3">
   		 <pre><u>Diet Plan</u> :
   		 	<%if(request.getAttribute("diet")!=null){%>${diet}<%}%>
         </pre>
   	</div>
   		 
   	<div class="h3">	 
   		 <pre><u>Workout Plan</u> :	<%if(request.getAttribute("work")!=null){%><br>${work}<%}%>
         </pre>
   	</div>
   		 
   	<div class="h3">	 
   		 <h3>Details regarding the diet the plan has been mailed to your given email id : <p> <%if(request.getAttribute("email")!=null){%>                   
         ${email}<%}%>
         </p>
         </h3>
   </div>
   <div>
   	<table id="tb1">
   	<caption>BMI Table</caption>
    <tr class="tr_main">
     <td>Category</td>
     <td>BMI Category</td>
    </tr>
    
    <tr>
    <td>Underweight</td>
    <td>&lt18.5</td>
    </tr>
    
    <tr>
    <td>Normal</td>
    <td>18.5-25</td>
    </tr>
    
    <tr>
    <td>Overweight</td>
    <td>25-30</td>
    </tr>
    
    <tr>
    <td>Obese Class I</td>
    <td>30-35</td>
    </tr>
    
    <tr>
    <td>Obese Class II</td>
    <td>&gt35</td>
    </tr>
    
    </table>
    
    
    
    <table id="tb2">
    <Caption>Body Fat Table</Caption>
    <tr class="tr_main">
     <td>Classification</td>
     <td>Women(% Fat)</td>
     <td>Men(% Fat)</td>
    </tr>
    
    <tr>
    <td>Essential Fat</td>
     <td>10-12%</td>
     <td>2-4%</td>
    </tr>
    
    <tr>
    <td>Athletes</td>
    <td>14-20%</td>
    <td>6-13%</td>
    </tr>
    
    <tr>
    <td>Fitness</td>
    <td>21-24%</td>
    <td>14-17%</td>
    </tr>
    
    <tr>
    <td>Acceptable</td>
    <td>25-31%</td>
    <td>18-25%</td>
    </tr>
    
    <tr>
    <td>Obese</td>
    <td>32% +</td>
    <td>25% +</td>
    </tr>
    
    </table>
    </div>
    
    
   	
</body>
</html>