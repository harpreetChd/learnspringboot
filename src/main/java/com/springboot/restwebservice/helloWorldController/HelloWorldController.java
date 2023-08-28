package com.springboot.restwebservice.helloWorldController;

import org.springframework.web.bind.annotation.*;

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

    //path parameter - /users/{1} ==> users/1

    @GetMapping(path = "/hello-world-variable/{name}")
    public HelloWorldBean getUsers(@PathVariable String name){
        return new HelloWorldBean("Hello World " + name);
    }
}
