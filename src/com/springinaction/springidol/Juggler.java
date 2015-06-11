package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component("juggler")
public class Juggler implements Performer {
	private int beanBags = 3;

	/**
	 * 创建一个新的实例 Juggler.
	 * 
	 * @param beanBags
	 */
	public Juggler() {
	}
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws PerformanceException {
       System.out.println("JUGGLING "+beanBags+ " BEANBAGS");
	}

}
