package com.childe.san.design.pattern.singleton;

import java.util.Random;

import org.junit.Test;

/**
 * @author zhangh
 * @createTime 2013-7-21 下午8:04:54
 */
public class ThreadScopeUserTest {

	@Test
	public void test() {
		final Random random = new Random();
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					int d = random.nextInt(100);
					ThreadScopeUser u = ThreadScopeUser.getThreadInstance();
					u.setName(Thread.currentThread().getName() + " : " + d);
					u.setAge(d);
					new B().get();
					new A().get();
				}
			}).start();
		}
	}

}

class B {
	public void get() {
		ThreadScopeUser u = ThreadScopeUser.getThreadInstance();
		System.out.println("B class get from : " + Thread.currentThread().getName() + ", name : " + u.getName()
				+ ", age : " + u.getAge());
	}
}

class A {
	public void get() {
		ThreadScopeUser u = ThreadScopeUser.getThreadInstance();
		System.out.println("A class get from : " + Thread.currentThread().getName() + ", name : " + u.getName()
				+ ", age : " + u.getAge());
	}
}
