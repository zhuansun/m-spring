package org.springframework.test.ioc.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {

	private String name;

	private int age;

	private Car car;

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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", car=" + car +
				'}';
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//这里会在Bean实例化的时候，执行
	}

	@Override
	public void destroy() throws Exception {
		//这里会在bean销毁的时候执行
	}
}
