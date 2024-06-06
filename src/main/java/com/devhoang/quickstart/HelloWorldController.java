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
}
