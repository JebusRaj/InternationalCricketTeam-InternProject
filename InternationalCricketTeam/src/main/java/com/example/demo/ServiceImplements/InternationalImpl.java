package com.example.demo.ServiceImplements;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.InternationalEntity;
import com.example.demo.Repositary.InternationalRepository;
import com.example.demo.Service.InternationalService;
@Service
public class InternationalImpl implements InternationalService  {
	@Autowired InternationalRepository db;

	@Override
	public String fetchPlayersForInternationalRanjiTrophy() {
		try{List<InternationalEntity> international = db.findAll();
			List<InternationalEntity> intRanji = new ArrayList<InternationalEntity>();
			for(InternationalEntity InternationalVO : international) {
				if(InternationalVO.getAge()<30) {
					intRanji.add(InternationalVO);
				}
			}
			System.out.println(intRanji);
	}catch(Exception e) {
		System.out.println(ConstantVariableDeclaration.exceptionMessage);
	}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}

	@Override
	public String savePlayersForInternationalRanjiTrophy(List<InternationalEntity> international ) {
		try {
			System.out.println(db.saveAll(international));
		}catch (Exception e) {
			System.out.println(ConstantVariableDeclaration.exceptionMessage);
		}
		return ConstantVariableDeclaration.consoleCheckMessage;
	}

}
