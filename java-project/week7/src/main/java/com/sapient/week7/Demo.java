package com.sapient.week7;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class Demo 
{
	Map<Integer,Employee> mp=new HashMap<>();
    public static void main( String[] args )
    {
    	int id;
    	System.out.println("Enter ID");
    	Scanner sc=new Scanner(System.in);
    	id=sc.nextInt();
    	System.out.println(mp.get(id));      
        
    }
    public void add()
    {	
    	ApplicationContext factory= new ClassPathXmlApplicationContext("spring.xml");
    	Employee emp= (Employee) factory.getBean("employee");
        System.out.println("Enter id,name and city: ");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String name=sc.nextLine();
        String city=sc.nextLine();
        emp.setCity(city);
        emp.setId(id);
        emp.setName(name);
        mp.put(id,emp);
        
    	
    }
}
