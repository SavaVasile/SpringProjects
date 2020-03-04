//package com.springProject.spring;
//
//import com.springProject.spring.service.DataReader;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//@SpringBootApplication
//public class Application implements CommandLineRunner {
//    @Autowired
//    private SchoolManager schoolManager;
//
//    @Autowired
//    private DataReader dataReader;
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//
//    }
//
//    public void run(String... args) throws Exception {
//
//
//        schoolManager.saveAll(dataReader.readStudents());
//        //schoolManager.saveAllSchools(dataReader.readSchools());
//        schoolManager.saveData();
//
//        System.out.println(schoolManager.getSchoolRepository().findByName("Bla School"));
//        System.out.println(schoolManager.getStudentRepository().findByName("BlaBla"));
//        System.out.println(schoolManager.getStudentRepository().findByCnp("195210998190"));
//
//    }
//}
