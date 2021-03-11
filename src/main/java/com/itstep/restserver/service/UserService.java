package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbUser;

import java.util.List;

public interface UserService {

    DbUser getUser(Long id);


    List<DbUser> getAllUsers();

    void saveUser(DbUser user);

    void deleteUser(Long id);
}
