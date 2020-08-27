<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<style>
body{
		background-image: url("C:\\Users\\shubh\\eclipse-workspace\\Fitness\\Images\\back.jpg");
		background-repeat: no-repeat;
 		background-attachment: fixed;
		background-size: cover;
		
	}
	h1{
		text-align:center;
		background-color: rgba(255, 255, 255, 0.51);
		border-radius: 5px;
		padding:2px;
	}
	h4{
		text-align: center;
		color: #ffffff;
		background-color: rgba(0, 0, 0, 0.71);
		border-radius: 5px;
		padding:2px;
		font-family: courier;
	}
	#div1{
		padding: 50px;
	}
	#h4{
		margin-left:50px;
		margin-right:50px;
		color: #ffffff;
		background-color: rgba(0, 0, 0, 0.71);
		border-radius: 5px;
		padding:2px;
	}

	input[type=submit]{
	background-color: rgba(255, 255, 255, 0.81);
  	border: none;
  	color: black;
  	padding: 5px;
  	text-decoration: none;
  	margin: 4px 2px;
  	border-radius:5px;
  	
}

</style>


<body>
<h1>Fitness and Nutrition</h1>
		<div id="div1"></div>
		<h4>Eating a variety of healthy foods is the key to a well-balanced diet and good nutrition.
		 It keeps our bodies working well and helps prevent diseases such as type 2 diabetes, cancer 
		 and cardiovascular disease.</h4>
		 <h4 id="h4"><u><b>Benefits of Healthy living</b></u>
		 	<p>
		 	'Healthy living' means maintaining a healthy lifestyle and introducing habits that improve 
		 	your health. It can be difficult to change old habits, but there are steps you can take to 
		 	become healthier. An important first step is identifying less healthy habits and learning new,
		 	positive ones to replace them.</p>
		 	
		 	<p>Taking the current COVID-19 situation, it has now become a major factor to maintain one's diet 
		 	and acquire healthy habits. So lets give you some fruitful information for your diet based on your 
		 	BMI(Body Mass Index).</p>
		 </h4>
		 <div align="center">
  				<form action="<%= request.getContextPath() %>/DetailsController" method="post">
  				<input type="Submit" value="Proceed">
  				</form>
  				</div>

</body>
</html>