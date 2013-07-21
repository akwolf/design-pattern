package com.childe.san.design.pattern.singleton;

/**
 * 单例模式
 * 封装与本线程有关的变量
 * 
 * @author zhangh
 * @createTime 2013-7-21 下午8:04:54
 */
public class ThreadScopeUser {

	private String name;

	private int age;

	private ThreadScopeUser() {
	}

	// 缓存与线程有关的ThreadScopeUser对象实例
	private static ThreadLocal<ThreadScopeUser> map = new ThreadLocal<ThreadScopeUser>();

	private static ThreadScopeUser instance;

	// 不用加上线程同步每一个线程取到的都是与本线程有关的ThreadScopeUser对象
	public static ThreadScopeUser getThreadInstance() {
		instance = map.get();

		if (instance == null) {
			instance = new ThreadScopeUser();
			map.set(instance);
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
