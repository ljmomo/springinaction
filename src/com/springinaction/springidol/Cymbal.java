package com.springinaction.springidol;
@StringedInstrument
public class Cymbal implements Instrument {

	
	/**
	 * 创建一个新的实例 Cymbal.
	 *
	 */
	public Cymbal() {
	}

	@Override
	public void play() {
        System.out.println("Cymbal Cymbal Cymbal");
	}

}
