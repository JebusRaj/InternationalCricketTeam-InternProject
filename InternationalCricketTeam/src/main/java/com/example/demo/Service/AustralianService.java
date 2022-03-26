package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.AustralianEntity;

public interface AustralianService {
	public  String getPlayerDetails();
	public String savePlayerDetails( AustralianEntity australia);
	public String updatePlayerDetails( AustralianEntity australia);
	public String deletePlayerDetails();
	public String deleteTheAustralianPlayerByID();
	public String getPlayersForAshesTrophy();
    public String getPlayersForBorderGavaskarTrophy();
    public String getPlatersForBBLTrophy();
    public List<AustralianEntity> fetchPlayerFromAllTeamForRanjiTrophy();

}
