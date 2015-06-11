package com.springinaction.springidol;


/**
 * 
 * 文件名称：Sonnet29
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月27日 下午4:33:54
 * 备注:
 * @version 1.0.0
 * 
 */

public class Sonnet29 implements Poem {
    
	/**
	 * 创建一个新的实例 Sonnet29.
	 *
	 */
	public Sonnet29() {
		
	}
	private static String[] LINES = {
    	"每一寸土地，",
    	"都是神奇，",
    	"都值得我们",
    	"表达崇高的敬意！",
    	"每一分光阴，",
    	"都是珍宝，",
    	"都值得我们",
    	"倾注热情的努力！",
    	"每一个生命，",
    	"都是奇迹，",
    	"都值得我们 ",
    	"洞察绝世的美丽！",
    	"千万别忘了 ",
    	"平凡而又不平凡的自己！",
    	"去深爱每一寸土地 ，",
    	"珍惜每一分光阴 ， ",
    	"尊重每一个生命！",
    	"这就是人生全部的秘密。"
    };
	@Override
	public void recite() {
		  for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}

	}

}
