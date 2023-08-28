package com.springboot.restwebservice.helloWorldController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method= RequestMethod.GET,path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path="/new-hello-world")
    public String newHelloWorld(){
        return "New Hello World";
    }
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }
}
