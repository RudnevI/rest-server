package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbRole;
import com.itstep.restserver.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public DbRole getRole(Long id) {
        return roleRepository.getOne(id);
    }


    @Override
    public List<DbRole> getAllRoles() {

        return roleRepository.findAll();
    }

    @Override
    public void saveRole(DbRole role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
