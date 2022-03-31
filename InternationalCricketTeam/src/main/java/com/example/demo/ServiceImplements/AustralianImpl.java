package com.example.demo.ServiceImplements;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.AustralianEntity;
import com.example.demo.Repositary.AustralianRepository;
import com.example.demo.Service.AustralianService;
import com.example.demo.VO.AustralianVO;
@Service
public  class AustralianImpl implements AustralianService {
	@Autowired
	AustralianRepository db;
	@Override
	public String deleteTheAustralianPlayerByID() {
		try{db.deleteById(3);
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.taskCompletionMessage;
	}
	
	@Override
	public String getPlayersForAshesTrophy() {
		try{List<AustralianEntity> australia = db.findAll();
		List<AustralianEntity> ashes =new ArrayList<AustralianEntity>();
		for(AustralianEntity AustralianVO: australia) {
			if(AustralianVO.getAge()>16 && AustralianVO.getAge()<30) {
				ashes.add(AustralianVO);
			}
		}
		System.out.println(ashes); 
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
		
	}
	@Override
	public String getPlayerDetails() {
		try{System.out.println(db.findAll()); 
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String savePlayerDetails(AustralianEntity australia) {
		 try { System.out.println(db.save(australia));
	} catch (Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		 return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String updatePlayerDetails(AustralianEntity australia) {
		try { System.out.println(db.save(australia));
	} catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String deletePlayerDetails() {
		try {db.deleteById(3);
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.taskCompletionMessage;
}

	@Override
	public String getPlayersForBorderGavaskarTrophy() {
		try{List<AustralianEntity> australia = db.findAll();
		List<AustralianEntity> borderGavaskar =new ArrayList<AustralianEntity>();
		for(AustralianEntity AustralianVO: australia) {
			if(AustralianVO.getAge()>16 && AustralianVO.getAge()<30) {
				borderGavaskar.add(AustralianVO);
			}
		}
		System.out.println(borderGavaskar); 
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
		
	}

	@Override
	public String getPlatersForBBLTrophy() {
		try{List<AustralianEntity> australia = db.findAll();
		List<AustralianEntity> bbl =new ArrayList<AustralianEntity>();
		for(AustralianEntity AustralianVO: australia) {
			if(AustralianVO.getAge()<40) {
				bbl.add(AustralianVO);
			}
		}
		System.out.println(bbl); 
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
		
	}

	
}
