package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.InternationalEntity;
@Repository
public interface InternationalRepository extends JpaRepository<InternationalEntity,Integer> {

}
