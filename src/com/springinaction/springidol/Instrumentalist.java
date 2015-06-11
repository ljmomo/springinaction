package com.springinaction.springidol;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*@Component("eddie")*/
public class Instrumentalist implements Performer {
	
	/**
	 * 创建一个新的实例 Instrumentalist.
	 *
	 */
	public Instrumentalist() {
	}
	@Value("#{systemEnvironment['CLASSPATH']}")
	private String song;
	/*@Inject
	@Qualifier("piano")*/
	/*@Named("piano")*/
	
	private Instrument instrument;
	@Override
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song +":");
		instrument.play();

	}
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String screamSong()
	{
		return song;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
}
