package com.fitness.model;

import java.text.DecimalFormat;

public class Fitness {
		
	private int age;
	private String gender;
	private float height;
	private float weight;
	private String city;
	private String email;
	private String final_gym;
	private String final_center;
	public String getFinal_gym() {
		return final_gym;
	}
	public void setFinal_gym(String final_gym) {
		this.final_gym = final_gym;
	}
	public String getFinal_center() {
		return final_center;
	}
	public void setFinal_center(String final_center) {
		this.final_center = final_center;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float bmi(float weight, float height) {
		float h = height/100;
		float res = weight/(h*h);
		return res;
	}
	public float convert(String weight, String height, String height_select, String weight_select) {
		float weight_1=Float.parseFloat(weight);
		float height_1=Float.parseFloat(height);
		if(height_select.equalsIgnoreCase("Centimeters(cm)")) {
			height_1 = Float.parseFloat(height);
		}else if(height_select.equalsIgnoreCase("Feet(ft)")) {
			height_1 = (float) (height_1*30.48);
		}else if(height_select.equalsIgnoreCase("Meters(m)")) {
			height_1 = (float) (height_1*100);
		}
		if(weight_select.equalsIgnoreCase("Kilograms(kg)")) {
			weight_1 = Float.parseFloat(weight);
		}else if(weight_select.equalsIgnoreCase("Pounds(lb)")) {
			weight_1 = (float) (weight_1/2.2046);
		}else if(weight_select.equalsIgnoreCase("Ounces(oz)")) {
			weight_1 = (float) (weight_1/35.274);
		}
		Fitness f  = new Fitness();
		float res = f.bmi(weight_1, height_1);
		DecimalFormat df = new DecimalFormat("#.00");
		return Float.parseFloat(df.format(res));
	}
	
	public float body_fat(String gender, int age, float bmi) {
		int flag = 0;
		if(gender.equalsIgnoreCase("female")) {
			flag=1;
		}
		float fat = (float) (-44.988 + (0.503 * age) + (10.689 * flag) + (3.172 * bmi) - (0.026 * bmi*bmi) + (0.181 * bmi * flag) - (0.02 * bmi * age) - (0.005 * bmi*bmi * flag) + (0.00021 * bmi*bmi * age));
		DecimalFormat df1 = new DecimalFormat("#.00");
		return Float.parseFloat(df1.format(fat));
	}
	
}

