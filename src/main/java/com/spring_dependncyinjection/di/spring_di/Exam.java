package com.spring_dependncyinjection.di.spring_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		System.out.println("This is spring framework!");
		/*
		 * Student student = new Student();
		 * student.setStudentID(1);
		 * student.setStudentName("Yonatan Embiza");
		 * student.displayStudentInfo();
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Student student1 = context.getBean("student1", Student.class);
		// Student student2 = context.getBean("student2", Student.class);
		Student student = context.getBean("student", Student.class);

		// student1.displayStudentInfo();
		// student2.displayStudentInfo();
		student.displayStudentInfo();
	}
}
