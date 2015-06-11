package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("audience")
public class Audience {
    public void takeSeats()
    {
    	System.out.println("表演未开始前，观众坐在位置上了 ");
    }
    
    public void turnOffCellPhones()
    {
    	System.out.println("表演未开始前，观众关闭他们的手机");
    }
    
    public void applaud()
    {
    	System.out.println("表演结束观众鼓掌");
    }
    
    public void demandRefund()
    {
    	System.out.println("表演出现异常，哎，我们想要回我们的钱。");
    }
    
    public void watchPerformance(ProceedingJoinPoint joinpoint)
    {
    	try {
			System.out.println("表演未开始前，观众坐在位置上了 ");
			System.out.println("表演未开始前，观众关闭他们的手机");
			long start = System.currentTimeMillis();
			joinpoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("表演结束观众鼓掌");
			System.out.println("这个表演者表演了"+(end -start)+" 毫秒");
			
		} catch (Throwable e) {
			System.out.println("表演出现异常，哎，我们想要回我们的钱。");
		}
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
