package com.itstep.restserver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role_table", schema = "users")
public class DbRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name")
    private String role;
}
