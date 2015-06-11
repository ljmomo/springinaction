package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnocationDake {
   public static void main(String[] args) throws PerformanceException {
	   ApplicationContext ax = new ClassPathXmlApplicationContext("classpath:spring-idol-annotation.xml");
   /*    Performer performer =  (Performer) ax.getBean("duke");
	   performer.perform();
	   Performer performer2 =  (Performer) ax.getBean("duke15");
	   performer2.perform();
	   Performer performer3 =  (Performer) ax.getBean("kenny");
	   performer3.perform();*/
	
/*	  
	   Performer performer2 = (Performer) ax.getBean("poeticDuke");
	   performer2.perform();
	   
	   Auditorium auditorium = (Auditorium) ax.getBean("auditorium");
	   auditorium.midd();*/
/*	    
	   Performer performer3 = (Performer) ax.getBean("eddie");
	   performer3.perform(); 
	    */
	   
	   
	   /*Poem poem = (Poem) ax.getBean("sonnet29");
	   poem.recite();*/

	   
	   Instrument performer4 =  (Instrument) ax.getBean("harmonica");
	   performer4.play();
	   
	   Instrument performer5 =  (Instrument) ax.getBean("cymbal");
	   performer5.play();
}
}
