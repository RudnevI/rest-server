package com.itstep.restserver.controller;

import com.itstep.restserver.entity.DbUser;
import com.itstep.restserver.model.User;
import com.itstep.restserver.service.UserService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getAllUsers")
    public List<DbUser> getUsers() {
        return service.getAllUsers();


    }

    @GetMapping("user/{id}")
    @SneakyThrows
    public User getUserById(@PathVariable Long id) {
        var user = new User();
        DbUser dbUser = service.getUser(id);
        user.setId(dbUser.getId());
        user.setFullname(dbUser.getFullname());
        user.setEmail(dbUser.getEmail());
        user.setPassword(dbUser.getPassword());
        return user;
    }

    @PutMapping("/addUser")
    public void saveUser(@RequestBody DbUser user) {
        service.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {

        service.deleteUser(id);
    }
}
