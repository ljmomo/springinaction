package com.springinaction.springidol;

import java.util.Collection;

/**
 * 
 * 文件名称：OneManBand
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月28日 下午1:37:45
 * 备注:
 * @version 1.0.0
 * 
 */
public class OneManBand implements Performer {

	
	/**
	 * 创建一个新的实例 OneManBand.
	 *
	 */
	public OneManBand() {
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 */
	@Override
	public void perform() throws PerformanceException {
            for (Instrument instrument : Instruments) {
            	instrument.play();
			}
	}
	
	private Collection<Instrument> Instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.Instruments = instruments;
	}

}
