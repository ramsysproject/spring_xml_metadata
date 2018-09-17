package com.emramirez;

import com.emramirez.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args){
        //Define the spring application context based on classpath xmls
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Gets a bean instance from the application context
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
    }
}
