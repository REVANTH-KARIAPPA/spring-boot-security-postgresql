package com.LensCart.repository;

import java.util.Optional;

import com.LensCart.entity.ERole;
import com.LensCart.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
