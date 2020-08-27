<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Page</title>
<style>
body{
		background-image: url('C:\\Users\\shubh\\eclipse-workspace\\Fitness\\Images\\back_1.jpg');
		background-repeat: no-repeat;
 		background-attachment: fixed;
		background-size: cover;
}
table{
	background-color: rgba(255, 87, 51, 0.81);
	border:none;
	padding:10px;
	border-radius:10px;
	margin-top: 80px;
	font-size:100%;
	width:300px;
}

h4,h2{
	background-color: rgba(0, 0, 0, 0.81);
	color: #ffffff;
	margin:50px;
	border-radius: 5px;
	font-family:courier;
}
#btn{
	margin-top:20px;
	border-radius:5px;
}
tr{
	padding: 30px;
}
input{
	border:none;
	border-radius:5px;
	background-color: rgba(255, 255, 255, 0.71);
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
input[type=radio]{
	border-color: #000000;
}
input[list]{
	border : none;
	
}
td{
	padding:5px;
	margin:10px;
}

select{
	background-color: rgba(255, 255, 255, 0.71);
	border:none;
	border-radius: 5px;
	outline:0;
	overflow:hidden;
}
.select::after { 
	
	border:none;
}
#inch,#random{
	visibility: hidden;
}
</style>
</head>
<body>

<div align="center">
 <h2>Users details</h2>
  <h4>To get a better and precise diet plan, Gyms and health care centre, please provide us with some 
  details. With the help of below details we'll calculate your BMI(Body Mass Index) and set a diet plan for you.</h4>
  <form action="<%= request.getContextPath() %>/Fiteness_serv" method="post">
   <table style="with: 80%">
    <tr>
     <td>Age</td>
     <td><input type="number" name="age" placeholder="Age" Min="1" required/></td>
    </tr>
    <tr>
     <td>Gender</td>
     <td><input type="radio" id="male" name="gender" value="male">
  		<label for="male">Male</label>
  		<input type="radio" id="female" name="gender" value="female">
  		<label for="female">Female</label>
  		<input type="radio" id="other" name="gender" value="other">
  		<label for="other">Other</label>
	</td>
    </tr>
    <tr>
     <td>Height</td>
     <td><input type="number" id="place" name="height" placeholder="Height" Min="1" step = ".01" required/>
     <input type="number" id="inch" name="inch" placeholder="Inches(0-11)" Min="0" Max="11"/></td>
    	
     <td><select name="height_select" id="inch_height" onchange="fun(this.value)">
			<option>Centimeters(cm)</option>
			<option>Feet(ft)</option>
			<option>Meters(m)</option>
		</select>
		<input id="random"/>
	</td>
	
    </tr>
    
    <tr>
     <td>Weight</td>
     <td><input type="number" name="weight" placeholder="Weight" Min="1" step = ".01" required/></td>
     <td><select name="weight_select">
			<option>Kilograms(kg)</option>
			<option>Pounds(lb)</option>
			<option>Ounces(oz)</option>
		</select>
	</td>
    </tr>
    <tr>
     <td>City</td>
     <td>
     	<input list="cities" name="city" id="city" placeholder="Select city"/>
  		<datalist id="cities">
     		<option value = "Delhi">
     		<option value = "Jaipur">
     		<option value = "Mumbai">
     		<option value = "Pune">
     		<option value = "Bangalore">
     		<option value = "Chennai">
     		<option value = "Noida">
     		<option value = "Gurugram">
     		<option value = "Dehradun">
     		<option value = "Ghaziabad">
     		<option value = "Kolkata">
     		<option value = "Kanpur">
     		<option value = "Prayag">
     		<option value = "Lucknow">
     		<option value = "Sikkim">
     		<option value = "Goa">
     		<option value = "Hydrabad">
     		<option value = "Kochi">
     		<option value = "Madurai">
     		<option value = "Coimbatore">
     		<option value = "Mysuru">
     	</datalist>
	 </td>
    </tr>
    
    
   
    <tr>
     <td>Email</td>
     <td><input type="email" name="email" placeholder="Email Id" required/></td>
    </tr>
   </table>
   
    <script>
 function fun(val){
	var v = document.getElementById("inch");
	document.getElementById("place").placeholder = val;
	if(val=="Feet(ft)"){	
		v.style.visibility = "visible";}
	else{
		v.style.visibility = "hidden";
	}
 }
 </script>
 
   <div id="btn">
   <input type="submit" value="Submit" /></div>
  </form>
 </div> 

</body>
</html>