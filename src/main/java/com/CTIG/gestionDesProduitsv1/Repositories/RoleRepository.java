package com.CTIG.gestionDesProduitsv1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CTIG.gestionDesProduitsv1.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}
