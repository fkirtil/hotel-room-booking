package com.fk.upod.adapter.out.persistence.repository;

import com.fk.upod.adapter.out.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    @Query("SELECT c FROM CustomerEntity c ORDER BY c.createdAt DESC")
    List<CustomerEntity> findAllByCreatedAtDesc();
}
