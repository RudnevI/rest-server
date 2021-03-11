package com.itstep.restserver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_table", schema = "users")
public class DbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String email;
    String password;
    String fullname;
}
