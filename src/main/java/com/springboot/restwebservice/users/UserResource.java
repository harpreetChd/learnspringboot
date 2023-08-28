package com.springboot.restwebservice.users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    private UserDAOService service;
    public UserResource(UserDAOService service){
        this.service = service;
    }
    @GetMapping(path="/users")
    public List<User> retrieveAllUsers(){
        return service.findAllUsers();
    }

    @GetMapping(path="/users/{userId}")
    public User retrieveOneUser(@PathVariable("userId") String userId){
        return service.findUser(userId);
    }

    @DeleteMapping(path="/users/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        return service.deleteUser(userId);
    }

    @PostMapping(path="/users")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }
}
