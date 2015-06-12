package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * 文件名称：AudienceAspect
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年6月12日 上午10:28:35
 * 备注:
 * @version 1.0.0
 * 
 */
@Component("audienceAspect")
@Aspect
public class AudienceAspect {
    /*
     * 定义切点
     */
	@Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
	public void performace()
	{
		
	}
	@Before("performace()")
    public void takeSeats()
    {
    	System.out.println("表演未开始前，观众坐在位置上了 ");
    }
	@Before("performace()")
    public void turnOffCellPhones()
    {
    	System.out.println("表演未开始前，观众关闭他们的手机");
    }
    @AfterReturning("performace()")
    public void applaud()
    {
    	System.out.println("表演结束观众鼓掌");
    }
    @AfterThrowing("performace()")
    public void demandRefund()
    {
    	System.out.println("表演出现异常，哎，我们想要回我们的钱。");
    }
    
    /*
     * 环绕通知
     */
    @Around("performace()")
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
