package com.itstep.restserver.model;

import lombok.Data;

import java.util.Set;

@Data
public class User {

    Long id;
    String email;
    String password;
    String fullname;
    Set<Role> roles;
}
