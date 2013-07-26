package com.childe.san.design.pattern.templatemethod;

/**
 * 参考
 * http://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html
 * 
 * HttpServlet
 * 
 * @author zhangh
 * @createTime 2013-7-26 上午10:38:40
 */
public interface JobTask {

	// 模板方法(template method)
	public void startJob();

	// 基本方法(primitive method)
	// 钩子方法的名字应当以do开始，这是熟悉设计模式的Java开发人员的标准做法。
	// 具体的业务由具体的子类去实现
	public void doJob(Object... args);
}
