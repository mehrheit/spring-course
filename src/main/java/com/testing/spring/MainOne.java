package com.testing.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.ObjectError;

/**
 * Created by oleg on 04/02/16.
 */
public class MainOne {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");

        HelloSpring hello = (HelloSpring) applicationContext.getBean("helloSpring");

        System.out.println(hello.getMessage());

    }

}
