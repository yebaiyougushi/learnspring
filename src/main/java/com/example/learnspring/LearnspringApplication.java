package com.example.learnspring;

import com.example.learnspring.main.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearnspringApplication {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
        context.registerShutdownHook();
    }
    //testg
}
