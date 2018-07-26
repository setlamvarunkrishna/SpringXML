package com.learning.SpringXmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.SpringXmlbased.model.EmployeeModel;

public class App {
	public static void main(String[] args) {
		// we need to specify the bean location in below
		// we are using Application context IOC

		ApplicationContext context = new ClassPathXmlApplicationContext("Beam.xml");
		// em and em1 are two ways to create object
		EmployeeModel em1 = (EmployeeModel) context.getBean("hello");
		EmployeeModel em = context.getBean(EmployeeModel.class);
		System.out.println(em.geteName());
		System.out.println(em1.toString());
	}
}
