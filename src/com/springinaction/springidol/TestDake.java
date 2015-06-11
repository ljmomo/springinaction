package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDake {
   public static void main(String[] args) throws PerformanceException {
	   ApplicationContext ax = new ClassPathXmlApplicationContext("classpath:spring-idol.xml");
/*	   Performer performer =  (Performer) ax.getBean("duke");
	   performer.perform();
	   Performer performer2 = (Performer) ax.getBean("poeticDuke");
	   performer2.perform();
	   
	   Auditorium auditorium = (Auditorium) ax.getBean("auditorium");
	   auditorium.midd();*/
	    
	   Performer performer3 = (Performer) ax.getBean("kenny");
	   performer3.perform(); 
	    
}
}
