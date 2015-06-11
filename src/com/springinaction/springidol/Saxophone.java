package com.springinaction.springidol;
public class Saxophone implements Instrument {

	
	/**
	 * 创建一个新的实例 Saxophone.
	 *
	 */
	public Saxophone() {
	}

	@Override
	public void play() {
       System.out.println("TOOT TOOT TOOT");
	}

}
