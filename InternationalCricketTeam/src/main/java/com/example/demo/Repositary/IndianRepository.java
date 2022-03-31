package com.example.demo.Repositary;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.IndianEntity;


@Repository

public  interface IndianRepository extends JpaRepository<IndianEntity,Integer>{
	@Query(value="select  i.playerid,i.age,i.highest,i.country,i.fifties,i.hundreds,i.name,i.notouts,i.total_runs,i.wickets  from indian_entity as i where age< :playerAge  union select  a.playerid,a.age,a.highest,a.country,a.fifties,a.hundreds,a.name,a.notouts,a.total_runs,a.wickets from australian_entity as a  where age< :playerAge union select s.playerid,s.age,s.highest,s.country,s.fifties,s.hundreds,s.name,s.notouts,s.total_runs,s.wickets from south_african_entity as s  where age< :playerAge" ,nativeQuery=true)
	public List<IndianEntity> fetchPlayerForInternationalRanjiTrophy(@Param("playerAge") Integer playerAge);

	

}
