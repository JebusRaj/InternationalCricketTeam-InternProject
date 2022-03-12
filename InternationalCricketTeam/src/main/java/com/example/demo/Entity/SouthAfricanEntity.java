package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class SouthAfricanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer playerID;
    public String name;
    public Integer age;
    public Integer totalRuns;
    public String country;
    public Integer fifties;
    public Integer hundreds;
    public Integer highest;
    public Integer wickets;
    public Integer notouts;
	public Integer getPlayerID() {
		return playerID;
	}
	public void setPlayerID(Integer playerID) {
		this.playerID = playerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(Integer totalRuns) {
		this.totalRuns = totalRuns;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getFifties() {
		return fifties;
	}
	public void setFifties(Integer fifties) {
		this.fifties = fifties;
	}
	public Integer getHundreds() {
		return hundreds;
	}
	public void setHundreds(Integer hundreds) {
		this.hundreds = hundreds;
	}
	public Integer getHighest() {
		return highest;
	}
	public void setHighest(Integer highest) {
		this.highest = highest;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}
	public Integer getNotouts() {
		return notouts;
	}
	public void setNotouts(Integer notouts) {
		this.notouts = notouts;
	}
	@Override
	public String toString() {
		return playerID + "-"+ name + "-" + age + "-"+ totalRuns + "-" + country + "-" + fifties +"-" + hundreds + "-"+ highest + "-" + wickets + "-" + notouts;	
	}
}

