package com.springinaction.springidol;

import javax.inject.Named;

import org.springframework.stereotype.Component;

/*@Named("piano")*/
/*@Component*/
public class Piano implements Instrument {

	
	/**
	 * 创建一个新的实例 Piano.
	 *
	 */
	public Piano() {
	}

	@Override
	public void play() {
        System.out.println("PLINKD PLINKD PLINKD");
	}

}
