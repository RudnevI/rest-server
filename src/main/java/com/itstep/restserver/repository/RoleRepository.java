package com.itstep.restserver.repository;

import com.itstep.restserver.entity.DbRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<DbRole, Long> {


}
