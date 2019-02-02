package com.socialtech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class AdditionTestClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AdditionClass obj = (AdditionClass)context.getBean("addition");
		  Scanner input = new Scanner(System.in);
	      System.out.println("Enter first Number:");
	      int a = input.nextInt();
	      System.out.println("Enter Second Number:");
	      int b = input.nextInt();
	      obj.add(a, b);
	      System.out.println(obj.getResults());
	}

}
