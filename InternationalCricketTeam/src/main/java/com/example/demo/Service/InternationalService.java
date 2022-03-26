package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.InternationalEntity;

public interface InternationalService {
	public String fetchPlayersForInternationalRanjiTrophy();
	public  String savePlayersForInternationalRanjiTrophy(List<InternationalEntity> international);

}
