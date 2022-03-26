package com.example.demo.TeamController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ConstantVariableDeclaration;
import com.example.demo.Entity.AustralianEntity;
import com.example.demo.Service.AustralianService;

@RestController
public class AustralianTeamController {
	@Autowired
	AustralianService sv;
	@RequestMapping(value ="/getAustralianPlayerDetails",method =RequestMethod.GET)
	public  String getPlayerDetails() {
		return sv.getPlayerDetails();
	}
	@RequestMapping(value ="/saveAustralianPlayerDetails",method =RequestMethod.POST)
	public String savePlayerDetails(@RequestBody AustralianEntity australia) {
		sv.savePlayerDetails(australia);
		AustralianEntity savePlayer = australia;
	 if( savePlayer!= null) {
		return ConstantVariableDeclaration.saveMessage;
	 }else {
		 return ConstantVariableDeclaration.declineMessage;
	 }
	}
	@RequestMapping(value="/updateAustralianPlayerDetails",method =RequestMethod.PUT)
	public String updatePlayerDetails(@RequestBody AustralianEntity australia) {
	   sv.updatePlayerDetails(australia);
	   AustralianEntity updatePlayer = australia;
	   if(updatePlayer!= null) {
		   return ConstantVariableDeclaration.updateMessage;
	   }
	   else {
		   return ConstantVariableDeclaration.declineMessage;
	   }
	}
	@RequestMapping(value ="/deleteAustralianPlayerDetails",method=RequestMethod.DELETE)
	public String deletePlayerDetails() {
		 sv.deletePlayerDetails();
		 return ConstantVariableDeclaration.deleteMessage;
	}
	
	@RequestMapping(value ="/deleteTheAustralianPlayerByID",method=RequestMethod.DELETE)
	public void deleteTheAustralianPlayerByID(@RequestBody AustralianEntity australia) {
		sv.deleteTheAustralianPlayerByID();
	}
	@RequestMapping(value ="/ashesTrophy",method=RequestMethod.GET)
	public String getPlayersForAshesTrophy() {
		return sv.getPlayersForAshesTrophy();
	}
	@RequestMapping(value ="/borderGavaskarTrophy",method=RequestMethod.GET)
	public String getPlayersForBorderGavaskarTrophy() {
		return sv.getPlayersForBorderGavaskarTrophy();
	}
	@RequestMapping(value ="/bblTrophy",method=RequestMethod.GET)
	public String getPlayersForBBLTrophy() {
		return sv.getPlatersForBBLTrophy();
	}
	@RequestMapping(value = "australianPlayersForInternationalRanjiTrophy",method=RequestMethod.GET)
	public List<AustralianEntity> fetchPlayerFromAllTeamForRanjiTrophy(){
		return sv.fetchPlayerFromAllTeamForRanjiTrophy();
	}
}

