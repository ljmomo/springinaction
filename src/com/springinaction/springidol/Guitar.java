package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class Guitar implements Instrument {

	
	/**
	 * 创建一个新的实例 Guitar.
	 *
	 */
	public Guitar() {
	}

	@Override
	public void play() {
		 System.out.println("Guitar Guitar Guitar");
	}

}
