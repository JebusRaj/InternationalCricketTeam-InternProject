package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import com.example.demo.Entity.IndianEntity;


public interface IndianService {
	public  String getPlayerDetails();
	public String savePlayerDetails(IndianEntity india) ;
	public String updatePlayerDetails( IndianEntity india);
	public  String deletePlayerDetails();
	public String getAllIndianPlayerDetails();
	public String getPlayerForRanjiTrophy();
	public String getPlayerForDuleepTrophy();
	public String getPlayerForICCTrophy();
	public  Map<Object,List<IndianEntity>> fetchPlayerForInternationalRanjiTrophy(Integer playername);
}
