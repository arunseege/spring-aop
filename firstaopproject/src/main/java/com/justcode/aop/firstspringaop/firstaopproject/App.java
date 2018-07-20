package com.justcode.aop.firstspringaop.firstaopproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.justcode.aop.firstspringaop.firstaopproject.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
  ApplicationContext context =   new ClassPathXmlApplicationContext("spring.xml");
  ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
  System.out.println(shapeService.getTriangle().getName());
    }
}
