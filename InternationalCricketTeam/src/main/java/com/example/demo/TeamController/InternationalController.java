package com.example.demo.TeamController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.InternationalEntity;
import com.example.demo.Service.InternationalService;

@RestController
public class InternationalController {
	@Autowired InternationalService sv;
	
	@RequestMapping(value= "/internationalPlayersForInternationalRanjiTrophy",method = RequestMethod.GET)
	public String fetchPlayersForInternationalRanjiTrophy(){
		return sv.fetchPlayersForInternationalRanjiTrophy();
		
	}
	@RequestMapping(value= "/saveInternationalPlayersForInternationalRanjiTrophy",method = RequestMethod.POST)
	public String savePlayersForInternationalRanjiTrophy(@RequestBody List<InternationalEntity> international){
		return sv.savePlayersForInternationalRanjiTrophy(international);
		
	} 

}
