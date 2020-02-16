package com.springProject.spring;

import com.springProject.spring.config.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        SchoolManager schoolManager = (SchoolManager) applicationContext.getBean("schoolManager");

        schoolManager.saveData();


    }
}
