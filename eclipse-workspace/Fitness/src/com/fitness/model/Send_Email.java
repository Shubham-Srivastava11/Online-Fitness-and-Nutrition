package com.fitness.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;

public class Send_Email {
	public void sendMail(Fitness ft, float bmi, String diet, String work, float fat) {
		
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		  // Get a Properties object
		     Properties props = System.getProperties();
		     props.setProperty("mail.smtp.host", "smtp.gmail.com");
		     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		     props.setProperty("mail.smtp.socketFactory.fallback", "false");
		     props.setProperty("mail.smtp.port", "465");
		     props.setProperty("mail.smtp.socketFactory.port", "465");
		     props.put("mail.smtp.auth", "true");
		     props.put("mail.debug", "true");
		     props.put("mail.store.protocol", "pop3");
		     props.put("mail.transport.protocol", "smtp");
//		     final String username = "nutrition.advice11@gmail.com";//
//		     final String password = "nutrition@011";
		     try{
		    	 InputStream input = new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Fitness\\WebContent\\WEB-INF\\mail.properties");
		    	 props.load(input);
				 input.close();
				 final String username = props.getProperty("user");
				 final String password = props.getProperty("pass");
				 Session session = Session.getDefaultInstance(props, 
		                          new Authenticator(){
		                             protected PasswordAuthentication getPasswordAuthentication() {
		                                return new PasswordAuthentication(username, password);
		                             }});

		   // -- Create a new message --
		     Message msg = new MimeMessage(session);
		   String categ;
		  //Category
		     if(bmi<=18.5) {
					categ="Under weight";
				}else if(bmi>18.5 && bmi<=25) {
					categ="Normal weight";
				}else {
					categ = "Obese";
				}
		     
		  // -- Set the FROM and TO fields --
		     msg.setFrom(new InternetAddress("nutrition.advice11@gmail.com"));
		     msg.setRecipients(Message.RecipientType.TO, 
		                      InternetAddress.parse(ft.getEmail(),false));
		     msg.setSubject("Nutrition and Fitness : Diet Plan");
		     msg.setText("Hi Sir/Ma'am\n\nThis mail is sent to you by the Nutrition and Fitness experts. On the basis of your details here are some information for your diet.\n\n"+"Your BMI(Body Mass Index) - "+bmi+" ("+categ+")"+"\n\nYour Body Fat % - "+fat+"%\n\nDiet Plan : \n"+diet+"\n\nWorkout Plan : \n"+work+"\n\nGymnasium in your city-\n"+ft.getFinal_gym()+"\nHealth Center in your city-\n"+ft.getFinal_center()+"\n\nThank you for trusting in us.\n\nRegards\nNutrition and Fitness");
		     msg.setSentDate(new Date());
		     Transport.send(msg);
		     System.out.println("Message sent.");
		     }catch (MessagingException e)
		     { 
		    	 System.out.println("Send Error, cause: " + e);
		    	 } 
		     catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		    	 e.printStackTrace();
		     	} 
		     catch (IOException e) {
			// TODO Auto-generated catch block
		    	 e.printStackTrace();
		}
		  }
	}

