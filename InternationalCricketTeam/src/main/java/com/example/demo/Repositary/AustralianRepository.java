package com.example.demo.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.AustralianEntity;


@Repository
public  interface AustralianRepository extends JpaRepository<AustralianEntity,Integer>{
	@Query(value="select i.playerid,i.age,i.country,i.fifties,i.highest,i.hundreds,i.name,i.notouts,i.total_runs,i.wickets,a.playerid,a.age,a.country,a.fifties,a.highest,a.hundreds,a.name,a.notouts,a.total_runs,a.wickets,s.playerid,s.age,s.country,s.fifties,s.highest,s.hundreds,s.name,s.notouts,s.total_runs,s.wickets from australian_entity as i inner join indian_entity as a on i.playerid = a.playerid inner join south_african_entity as s on a.playerid = s.playerid",nativeQuery=true)
    List<AustralianEntity> findAll();
}

