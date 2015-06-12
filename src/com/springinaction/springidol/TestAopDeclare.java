package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopDeclare {
   public static void main(String[] args) throws PerformanceException {
	   ApplicationContext ax = new ClassPathXmlApplicationContext("classpath:spring-idol-aop-declare-parents.xml");

	   Performer performer = (Performer) ax.getBean("juggler");
	   performer.perform();    
	   //此处guggler是 Performer接口的实现  我们强转成Contestant接口也可以，
	   //spring背后做了很多事情。而不是代码显示地继承了它的接口。
	   //这样就可以为Performer 添加新功能。
	   Contestant contestant = (Contestant) ax.getBean("juggler");
	   contestant.receiveAward(); 
	  
}
}
