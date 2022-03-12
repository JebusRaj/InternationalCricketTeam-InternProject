package com.example.demo.TeamController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.IndianEntity;
import com.example.demo.Service.IndianService;

@RestController
public class IndianTeamController {
	@Autowired
	IndianService sv;
	@RequestMapping(value ="/getIndianPlayerDetails",method =RequestMethod.GET)
	public  String getPlayerDetails() {
		return sv.getPlayerDetails();
	}
	@RequestMapping(value ="/saveIndianPlayerDetails",method =RequestMethod.POST)
	public String savePlayerDetails(@RequestBody IndianEntity india) {
		sv.savePlayerDetails(india);
		IndianEntity savePlayer =india;
		if(savePlayer!= null) {
			return ConstantVariableDeclaration.saveMessage;
		}else {
			return ConstantVariableDeclaration.declineMessage;
		}
	}
	@RequestMapping(value="/updateIndianPlayerDetails",method =RequestMethod.PUT)
	public String updatePlayerDetails(@RequestBody IndianEntity india) {
	   sv.updatePlayerDetails(india);
	   IndianEntity updatePlayer = india;
	   if(updatePlayer!= null) {
		   return ConstantVariableDeclaration.updateMessage;
	   }else {
		   return ConstantVariableDeclaration.declineMessage;
	   }
	 
	}
	@RequestMapping(value ="/deleteIndianPlayerDetails",method=RequestMethod.DELETE)
	public String deletePlayerDetails() {
		sv.deletePlayerDetails();
			return ConstantVariableDeclaration.deleteMessage;
	}
	@RequestMapping(value ="/getAllIndianPlayerDetails",method = RequestMethod .GET)
	public String getAllIndianPlayerDetails() {
		return sv.getAllIndianPlayerDetails();
	}
	@RequestMapping(value ="/ranjiTrophy",method = RequestMethod .GET)
	public String getPlayerForRanjiTrophy() {
		return sv.getPlayerForRanjiTrophy();
	}
}
