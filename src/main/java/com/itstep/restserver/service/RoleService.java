package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbRole;

import java.util.List;

public interface RoleService {

    DbRole getRole(Long id);

    List<DbRole> getAllRoles();

    void saveRole(DbRole role);

    void deleteRole(Long id);
}
