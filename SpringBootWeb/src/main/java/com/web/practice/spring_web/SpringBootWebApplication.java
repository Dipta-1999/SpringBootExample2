package com.web.practice.spring_web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication

public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		Calculation ca1=(Calculation)con.getBean("ad");
		/**ca1.AddNum();
		Calculation ca2=(Calculation)con.getBean("su");
		ca2.SubNum();
		Calculation ca3=(Calculation)con.getBean("mu");
		ca3.MulNum();
		Calculation ca4=(Calculation)con.getBean("de");
		ca4.DeviNum();*/
	}
}
