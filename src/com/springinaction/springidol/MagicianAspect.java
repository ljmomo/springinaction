package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("MagicianAspect")
@Aspect
public class MagicianAspect implements MindReader {
	 private String thoughts;
	 
	 @Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
	 public void thinking(String thoughts)
	 {
	    	
	 }
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		// TODO Auto-generated method stub
		 System.out.println("截听自愿者的内心感应");
		 this.thoughts = thoughts;
		 System.out.println("你的想法是："+thoughts);
	}

	public String getThoughts() {
		// TODO Auto-generated method stub
		return thoughts;
	}

}
