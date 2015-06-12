package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopThinkingAsject {
   public static void main(String[] args) throws PerformanceException {
	   ApplicationContext ax = new ClassPathXmlApplicationContext("classpath:spring-idol-aop-asepectj.xml");
	   Thinker  volunteer = (Thinker) ax.getBean("volunteer");
	   volunteer.thinkOfSomething("我想有一个房子");
	
}
}
