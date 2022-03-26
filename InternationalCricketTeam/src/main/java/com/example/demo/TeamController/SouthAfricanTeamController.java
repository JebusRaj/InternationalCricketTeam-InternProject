package com.example.demo.TeamController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.SouthAfricanEntity;
import com.example.demo.Service.SouthAfricanService;

@RestController
public class SouthAfricanTeamController {
	@Autowired
	SouthAfricanService sv;
	@RequestMapping(value ="/getSouthAfricanPlayerDetails",method =RequestMethod.GET)
	public  String getPlayerDetails() {
		return sv.getPlayerDetails();
	}
	@RequestMapping(value ="/saveSouthAfricanPlayerDetails",method =RequestMethod.POST)
	public String savePlayerDetails(@RequestBody SouthAfricanEntity southAfrica) {
		sv.savePlayerDetails(southAfrica);
		SouthAfricanEntity savePlayer = southAfrica;
	  if(savePlayer != null) {
		  return ConstantVariableDeclaration.saveMessage;
	  }else {
		  return ConstantVariableDeclaration.declineMessage;
	  }
	}
	@RequestMapping(value="/updateSouthAfricanPlayerDetails",method =RequestMethod.PUT)
	public String updatePlayerDetails(@RequestBody SouthAfricanEntity southAfrica  ) {
	   sv.updatePlayerDetails(southAfrica);
	   SouthAfricanEntity updatePlayer = southAfrica;
	  if(updatePlayer!= null) {
		  return ConstantVariableDeclaration.updateMessage;
	  }else
		  return ConstantVariableDeclaration.declineMessage;
	}
	
	@RequestMapping(value ="/deleteSouthAfricanPlayerDetails",method=RequestMethod.DELETE)
	public String deletePlayerDetails() {
		 sv.deletePlayerDetails();
				return ConstantVariableDeclaration.deleteMessage;
	}
	
	@RequestMapping(value="/updateTheSouthAfricanPlayername",method=RequestMethod.PUT)
	public String updateThePlayername(@RequestBody SouthAfricanEntity  southAfrica) {
		 sv.updateTheSouthAfricanPlayername();
		 SouthAfricanEntity updateSouthAfricanPlayer = southAfrica;
		 if( updateSouthAfricanPlayer != null){
				return ConstantVariableDeclaration.updateMessage;
			}
			else {
				return ConstantVariableDeclaration.declineMessage;
			}
}
	@RequestMapping(value ="/freedomTrophy",method=RequestMethod.GET)
	public String getPlayersForFreedomTrophy() {
		return sv.getPlayersForFreedomTrophy();
	}
	@RequestMapping(value ="/saplTrophy",method=RequestMethod.GET)
	public String getPlayersForSAPLTrophy() {
		return sv.getPlayersForSAPLTrophy();
	}
	@RequestMapping(value ="/southAfricanPlayersForInternationalRanjiTrophy",method=RequestMethod.GET)
	public List<SouthAfricanEntity> fetchPlayerFromAllTeamForRanjiTrophy() {
		return sv.fetchPlayerFromAllTeamForRanjiTrophy();
	}
}


