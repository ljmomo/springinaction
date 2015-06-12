package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component("delegateContestant")
public class GraciousContestant implements Contestant {
	@Override
	public void receiveAward() {
           System.out.println("新加的方法。。。。。获得优秀奖");
	}

}
