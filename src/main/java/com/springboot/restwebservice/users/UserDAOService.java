package com.springboot.restwebservice.users;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAOService {
    private static List<User> users = new ArrayList<>();
    private static int counter=0;
    static{
        users.add(new User(++counter,"Adam", LocalDate.now().minusYears(20).atStartOfDay()));
        users.add(new User(++counter,"John", LocalDate.now().minusYears(30).atStartOfDay()));
        users.add(new User(++counter,"Kylie", LocalDate.now().minusYears(10).atStartOfDay()));
    }
    public List<User> findAllUsers(){
        return this.users;
    }

    public User findUser(String userId){
        for(User user:users){
            if(user.getId().equals(Integer.parseInt(userId))){
                return user;
            }
        }
        return null;
    }

    public String deleteUser(String userId){
        for(User user:users){
            if(user.getId().equals(Integer.parseInt(userId))){
                users.remove(user);
                return "Removed successfully";
            }
        }
        return "No record found";
    }

    public User addUser(User newUser){
        newUser.setId(++counter);
        users.add(newUser);
        return newUser;
    }

}
