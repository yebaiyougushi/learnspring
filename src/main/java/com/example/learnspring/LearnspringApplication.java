package com.example.learnspring;

import com.example.learnspring.DB.StudentJDBCTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


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
//        Student student = (Student) context.getBean("student");
//        student.getName();
//        student.getAge();
//        student.printThrowException();
//        spring jdbc 框架测试
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);
        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
    //test
}
