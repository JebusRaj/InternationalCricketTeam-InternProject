package com.example.demo.Service;

import com.example.demo.Entity.SouthAfricanEntity;

public interface SouthAfricanService {
	public  String getPlayerDetails();
	public String savePlayerDetails( SouthAfricanEntity southAfrica);
	public String updatePlayerDetails(SouthAfricanEntity southAfrica);
	public String deletePlayerDetails();
	public String updateTheSouthAfricanPlayername();
	public String getPlayersForFreedomTrophy();

	String updateTheSouthAfricanPlayername(SouthAfricanEntity southAfrica);

	
	
	

}