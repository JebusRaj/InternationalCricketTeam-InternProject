package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.IndianEntity;


@Repository
public  interface IndianRepository extends JpaRepository<IndianEntity,Integer>{

	

	

}
