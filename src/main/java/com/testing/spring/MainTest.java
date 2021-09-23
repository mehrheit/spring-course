package com.testing.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleg on 04/02/16.
 */
public class MainTest {

    public static void main(String[] args) {
        List<MainTest> list = new ArrayList<>();

        MainTest tst = null;
        list.add(tst);

        list.stream().map(t -> t.getGreetings()).forEach(System.out::println);
    }

    private static String getGreetings() {
        return "Greetings :)";
    }

}
