package com.childe.san.design.pattern.templatemethod;

/**
 * 
 * 在springQuartz中使用MethodInvokingJobDetailFactoryBean
 * 指定要调用的任务方法时即可指定startJob(targetMethod)
 * 
 * 
 * @author zhangh
 * @createTime 2013-7-26 上午10:40:07
 */
public abstract class AbstractJobTask implements JobTask {

	@Override
	public void startJob() {
		doJob();
	}

}
