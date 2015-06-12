package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopAspectJ {
   public static void main(String[] args) throws PerformanceException {
	   ApplicationContext ax = new ClassPathXmlApplicationContext("classpath:spring-idol-aop-asepectj.xml");
	   Performer performer = (Performer) ax.getBean("juggler");
	   performer.perform();    
     
	  
}
}
