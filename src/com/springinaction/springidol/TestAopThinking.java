package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopThinking {
   public static void main(String[] args) throws PerformanceException {
	   ApplicationContext ax = new ClassPathXmlApplicationContext("classpath:spring-idol-aop-thinking.xml");
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
	    
	/*   Performer performer3 = (Performer) ax.getBean("juggler");
	   performer3.perform(); */
	    
	   
	   
	   /*Poem poem = (Poem) ax.getBean("sonnet29");
	   poem.recite();*/

	   
	 /*  Instrument performer4 =  (Instrument) ax.getBean("harmonica");
	   performer4.play();*/
	 /*  
	   Instrument performer5 =  (Instrument) ax.getBean("cymbal");
	   performer5.play();*/
/*	   Audience audience = (Audience) ax.getBean("audience");
	   audience.applaud();*/
	   Thinker  volunteer = (Thinker) ax.getBean("volunteer");
	   volunteer.thinkOfSomething("我想有一个房子");
	 
	   
	
}
}
