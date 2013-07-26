package com.childe.san.design.pattern.templatemethod;

/**
 * @author zhangh
 * @createTime 2013-7-26 上午10:44:55
 */
public class SpringQuartzJobTask extends AbstractJobTask {

	@Override
	public void doJob(Object... args) {
		System.out.println("this is a spring jms job!!");
	}
}
