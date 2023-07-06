package com.mahmouddello.model.repository;

import com.mahmouddello.model.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
    RegistrationEntity findByEmail(String email);
    boolean existsByEmail(String email);
}
