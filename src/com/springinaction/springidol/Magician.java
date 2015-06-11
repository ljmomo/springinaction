package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component("magician")
public class Magician implements MindReader {

   private String thoughts;
	
	@Override
	public void interceptThoughts(String thoughts) {
		 System.out.println("截听自愿者的内心感应");
		 this.thoughts = thoughts;
		 System.out.println("你的想法是："+thoughts);
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
