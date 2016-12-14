package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring3HelloWorldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring3HelloWorld.xml");

		Spring3HelloWorld myBean = (Spring3HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");
		myBean.printHello();
	}

}
