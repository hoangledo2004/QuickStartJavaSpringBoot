package com.devhoang.quickstart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    // mvnw [options] [<goals(s)>] [<phrase(s)>]
    // Maven Concepts:
    // mvnw
    // clean -- remove temporary directories and files
    // default -- where the most useful goals live
    // site -- where documentation is generated


    // mvnw clean
    // pre-clean -- hook for before cleaning
    // clean -- does the actual cleaning
    // post-clean -- hook for after cleaning

    // mvnw default
    // compile -- compile your code into bytecode
    // test -- runs unit tests
    // package -- creates a jar or war file
    // verify -- run checks & integration tests


    // *******************************
    // Maven Spring Boot Plugin
    // another way to run our application file
    // ./mvnw spring-boot:run

    // *******************************
    // Spring Framework and Spring Boot
    // Spring Boot is a popular framework for building java applications.
    // A framework is a chunk of code written on top of a language's core
    // library to solve common problems.

    // Spring Framework
    // connect to db, expressing RESTApi
    // it is highly configurable -- takes efforts

    // Spring Boot is built on top of Spring Framework
    // so using Spring Boot do all the configurations for you

    // *******************************
    // Spring App Layers
    // Layers: Presentation - Service - Persistence

    // Persistence Layer
    // Entities -- Java Object, NoSQL
    // Repositories/DAOs (Data Access Objects)
    // CRUD

    // Service Layer
    // Presentation Layer


    // *******************************
    // Modularity

    // *******************************
    // Introducing Beans
    //
    // *******************************
    // Annotation
    // @SpringBootApplication
    // @Configuration -- this identifies a configuration class, which is somewhere Spring should look for bean during its component scanning phrase
    // @ComponentScan -- look for beans and placed that beans are needed
    // @EnableAutoConfiguration -- providing sensible default

}
