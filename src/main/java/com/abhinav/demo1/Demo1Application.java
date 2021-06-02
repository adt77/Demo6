package com.abhinav.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	//Triangle triangle = new Triangle();
	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	ApplicationContext context = new ClassPathXmlApplicationContext(new FileSystemResource("spring.xml"));

	/*Triangle triangle = (Triangle) context.getBean("triangle");
	triangle.draw();*/
	Shape shape = (Shape) context.getBean("circle");
	shape.draw();

}
}



