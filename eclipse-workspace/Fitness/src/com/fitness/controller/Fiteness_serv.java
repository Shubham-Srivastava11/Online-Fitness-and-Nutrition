package com.fitness.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fitness.dao.Detailsdao;
import com.fitness.model.Diet_work;
import com.fitness.model.Fitness;
import com.fitness.model.Send_Email;

/**
 * Servlet implementation class Fiteness_serv
 */
@WebServlet("/Fiteness_serv")
public class Fiteness_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Detailsdao fitnessdao = new Detailsdao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fiteness_serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
//		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String height_select = request.getParameter("height_select");
		String weight_select = request.getParameter("weight_select");
		if(height_select.equalsIgnoreCase("Feet(ft)")) {
			String inch = request.getParameter("inch");
			float val = Float.parseFloat(height) + Float.parseFloat(inch)/12;
			height = String.valueOf(val);
		}
		Fitness fitness = new Fitness();
		fitness.setAge(Integer.parseInt(age));
		fitness.setGender(gender);
//		fitness.setHeight(Float.parseFloat(height));
//		fitness.setWeight(Float.parseFloat(weight));
		fitness.setCity(city);
		fitness.setEmail(email);
//		fitnessdao.send_email(fitness);
		
		Send_Email send = new Send_Email();
		float res = fitness.convert(weight, height,height_select, weight_select);
		/////////////////////////////////////////

//		fitness.setHeight(height_1);
//		fitness.setWeight(weight_1);
		fitnessdao.register_details(fitness);
//		System.out.println(weight_1+" "+height_1);
//		float res = fitness.bmi(weight_1, height_1);
		//////////////////////////////////////////////////
		request.setAttribute("res", res);
		
		String gym = fitness.getFinal_gym();
		request.setAttribute("gym", gym);
		
		String center = fitness.getFinal_center();
		request.setAttribute("center", center);
		
		String emailid = fitness.getEmail();
		request.setAttribute("email", emailid);
		System.out.println("GENDER "+gender);
		/////////////////////////
		float fat = fitness.body_fat(gender, Integer.parseInt(age), res);
		/////////////////////////
		request.setAttribute("fat", fat);
		
		Diet_work dw = new Diet_work();
		String[] data = dw.diet_and_work(res);
		request.setAttribute("diet", data[0]);
		request.setAttribute("work", data[1]);
		String categ;
		if(res<=18.5) {
			send.sendMail(fitness,res,data[0],data[1],fat);
			categ = "Under Weight";
		}else if(res>18.5 && res<=25) {
			send.sendMail(fitness,res,data[0],data[1],fat);
			categ = "Normal Weight";
		}else {
			send.sendMail(fitness,res,data[0],data[1],fat);
			categ = "Over Weight";
		}
		request.setAttribute("cat", categ);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/display.jsp");
		dispatcher.forward(request,response);
		
	
	}

}
