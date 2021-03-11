package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbUser;
import com.itstep.restserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public DbUser getUser(Long id) {
        return userRepository.getOne(id);
    }


    @Override
    public List<DbUser> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(DbUser user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
