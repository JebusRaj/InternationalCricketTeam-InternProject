package com.example.demo.ServiceImplements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.IndianEntity;
import com.example.demo.Repositary.IndianRepository;
import com.example.demo.Service.IndianService;
import com.example.demo.VO.IndianVO;
@Service
public class IndianImpl implements IndianService {

	@Autowired
	IndianRepository db;
	
	@Override
	public String getAllIndianPlayerDetails() {
		try{  System.out.println(db.findAll());
	}catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}

	@Override
	public String getPlayerForRanjiTrophy() {
	try {	List<IndianEntity> india = db.findAll();
		List<IndianEntity> ranji = new ArrayList<IndianEntity>();
	for(IndianEntity IndianVO: india) {
		if(IndianVO.getAge()>18 && IndianVO.getAge()<25) {
		ranji.add(IndianVO);    
	}	
	}
	System.out.println(ranji);
	}catch (Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
	return ConstantVariableDeclaration.consoleCheckMessage;
	}
	

	@Override
	public String getPlayerDetails() {
		try{System.out.println(db.findAll()); 
		}catch(Exception e){
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
			return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String savePlayerDetails(@RequestBody IndianEntity india) {
		try {System.out.println(db.save(india));
		}catch(Exception e){
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public  String updatePlayerDetails(IndianEntity india) {
		try {System.out.println(db.save(india));
		} catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
			return ConstantVariableDeclaration.consoleCheckMessage;
}

	@Override
	public String deletePlayerDetails() {
		try {  db.deleteById(11);
	}catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.taskCompletionMessage;
}

	@Override
	public String getPlayerForDuleepTrophy() {
	   try { List<IndianEntity> india = db.findAll();
	         List<IndianEntity> duleep = new ArrayList<IndianEntity>();
	         for(IndianEntity IndianVO : india) {
	        	 if(IndianVO.getTotalRuns()>3000) {
	        		 duleep.add(IndianVO);
	        	 }
	         }
	         System.out.println(duleep);
	   }catch(Exception e){
		   System.out.println(ConstantVariableDeclaration.exceptionMessage);
		   
	   }
	   return ConstantVariableDeclaration.consoleCheckMessage;
}

	@Override
	public String getPlayerForICCTrophy() {
		try { List<IndianEntity> india = db.findAll();
        List<IndianEntity> icc = new ArrayList<IndianEntity>();
        for(IndianEntity IndianVO : india) {
       	 if(IndianVO.getHundreds()>10) {
       		 icc.add(IndianVO);
       	 }
        }
        System.out.println(icc);
  }catch(Exception e){
	   System.out.println(ConstantVariableDeclaration.exceptionMessage);
	   
  }
  return ConstantVariableDeclaration.consoleCheckMessage;
	}

	@Override
	public   Map<Object,List<IndianEntity>> fetchPlayerForInternationalRanjiTrophy(Integer playerAge ) {
	     List<IndianEntity> india = db.fetchPlayerForInternationalRanjiTrophy(playerAge);
	     List<IndianEntity> intTrophy = new ArrayList<IndianEntity>();
	     intTrophy.addAll(india);
	     System.out.println(intTrophy);
	   Map<Object,List<IndianEntity>> ranjiMap = new HashMap<Object,List<IndianEntity>>();
	   int count =1;
	   int team = 1;
	   List<IndianEntity> trophy = new ArrayList<IndianEntity>();
	   for(IndianEntity ranjiTrophy : intTrophy) {
		   if (count<=11) {
			   if(ranjiTrophy != null ) {
				   trophy.add(ranjiTrophy);
				   ranjiMap.put("TEAM" +7, trophy);
				   int size = Math.round(trophy.size());
					 System.out.println(Math.round(size));
				  
			   }
			   count ++;
		   }
		   else {
			   List<IndianEntity> itrophy = new ArrayList<IndianEntity>(trophy);
			  ranjiMap.put("TEAM" + team, itrophy);
			  trophy.clear();
			  trophy.add(ranjiTrophy);
			  int size = Math.round(trophy.size());
				 System.out.println(Math.round(size));
			   team +=1;
			   count = 2;
		   }
		   }
	   
		return ranjiMap;
	}

	}


