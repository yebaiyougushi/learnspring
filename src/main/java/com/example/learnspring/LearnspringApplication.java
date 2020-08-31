package com.example.learnspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class LearnspringApplication {

    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//
//        obj.getMessage();
//        context.registerShutdownHook();
//
//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        te.spellCheck();
//        注入集合
//
//        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
//        jc.getAddressList();
//        jc.getAddressSet();
//        jc.getAddressMap();
//        jc.getAddressProp();
//        Profile profile = (Profile) context.getBean("profile");
//        profile.printAge();
//        profile.printName();
//        AOP
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
    //test
}
