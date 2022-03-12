package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.SouthAfricanEntity;


@Repository
public  interface SouthAfricanRepository extends JpaRepository<SouthAfricanEntity,Integer>{

}

