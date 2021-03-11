package com.itstep.restserver.controller;

import com.itstep.restserver.entity.DbRole;
import com.itstep.restserver.model.Role;
import com.itstep.restserver.service.RoleService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api")
public class RoleController {


    @Autowired
    private RoleService service;

    @GetMapping("/getAllRoles")
    public List<DbRole> getRoles() {
        return service.getAllRoles();


    }

    @GetMapping("role/{id}")
    @SneakyThrows
    public Role getRoleById(@PathVariable Long id) {
        var role = new Role();
        DbRole dbRole = service.getRole(id);
        role.setId(dbRole.getId());
        role.setRole(dbRole.getRole());
        return role;
    }

    @PutMapping("/addRole")
    public void saveRole(@RequestBody DbRole role) {
        service.saveRole(role);
    }

    @DeleteMapping("/role/{id}")
    public void deleteRole(@PathVariable Long id) {

        service.deleteRole(id);
    }
}
