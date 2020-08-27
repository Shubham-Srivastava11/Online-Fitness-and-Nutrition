package com.fitness.dao;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.fitness.model.Fitness;
public class Detailsdao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	
	Properties prop = new Properties();
	
	InputStream input = null;
	
//	static final String DB_URL = "jdbc:mysql://localhost/fitness";
//	
//	static final String USER = "root";
//	static final String PASS = "shubh@011";
	
	public void register_details(Fitness ob) {
		Connection conn = null;
		Statement stmt = null;
//		Fitness ob = new Fitness();
		
		try {
			input = new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Fitness\\WebContent\\WEB-INF\\db.properties");
			prop.load(input);
			input.close();
			String DB_URL = prop.getProperty("dbUrl");
			String USER = prop.getProperty("dbUser");
			String PASS = prop.getProperty("dbPass");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Connecting to a selected database...");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    System.out.println("Connected database successfully...");
		    
		    stmt = conn.createStatement();
		    
		    String sql = "SELECT gym_name,healthcare_name,city from data";
		    ResultSet rs = stmt.executeQuery(sql);
		    System.out.println("Statement executed..");
		    
		    System.out.println(ob.getGender());
		    String gym_display="";
		    String center_display="";
		    int flag =0;
		    while(rs.next()) {
		    	if(rs.getString("city").equalsIgnoreCase(ob.getCity())) {
		    		String gym = rs.getString("gym_name");
		    		String center = rs.getString("healthcare_name");
		    		System.out.println(gym);
			    	System.out.println(center);
			    	gym_display += gym +"\n";
			    	center_display += center+"\n";
			    	flag = 1;
			    	
		    	}
		    	
		    }
		    if(flag==0) {
		    	gym_display = "Sorry, our gym service is not available in your locality.\n";
		    	center_display = "Sorry, our healthcare service is not available in your locality.";
		    }
		    ob.setFinal_gym(gym_display);
		    ob.setFinal_center(center_display);
		    
		}catch(SQLException se) {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	}
	
	

}

