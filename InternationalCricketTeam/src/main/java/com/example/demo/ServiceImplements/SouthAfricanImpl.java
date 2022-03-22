package com.example.demo.ServiceImplements;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.SouthAfricanEntity;
import com.example.demo.Repositary.SouthAfricanRepository;
import com.example.demo.Service.SouthAfricanService;
@Service
public   class SouthAfricanImpl implements SouthAfricanService {
	@Autowired
	SouthAfricanRepository db;
	@Override
	public String updateTheSouthAfricanPlayername( @RequestBody SouthAfricanEntity  southAfrica) {	 
		try { System.out.println(db.save(southAfrica));
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
}
	@Override
	public String updateTheSouthAfricanPlayername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPlayersForFreedomTrophy() {
		try{List<SouthAfricanEntity> southAfrica = db.findAll();
		List<SouthAfricanEntity> freedom =new ArrayList<SouthAfricanEntity>();
		for(SouthAfricanEntity SouthAfricanVO: southAfrica) {
			if(SouthAfricanVO.getAge()>18 && SouthAfricanVO.getAge()<22) {
				freedom.add(SouthAfricanVO);
			}
		}
		System.out.println(freedom);
	} catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String getPlayerDetails() {
		try { System.out.println( db.findAll());
	}catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String savePlayerDetails(SouthAfricanEntity southAfrica) {
		try { System.out.println(db.save(southAfrica));
	}catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public  String updatePlayerDetails(SouthAfricanEntity southAfrica) {
		try { System.out.println(db.save(southAfrica));
	} catch (Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}
	@Override
	public String deletePlayerDetails() {
		try{ db.deleteById(3);
		
		}catch(Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.taskCompletionMessage;	
}
	@Override
	public String getPlayersForSAPLTrophy() {
		try{List<SouthAfricanEntity> southAfrica = db.findAll();
		List<SouthAfricanEntity> sapl =new ArrayList<SouthAfricanEntity>();
		for(SouthAfricanEntity SouthAfricanVO: southAfrica) {
			if(SouthAfricanVO.getTotalRuns()>2000) {
				sapl.add(SouthAfricanVO);
			}
		}
		System.out.println(sapl);
	} catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	
	}
}

	

