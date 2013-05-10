package LoLStats;

import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class MatchRecord {
    private String champion;
    private Integer kills;
    private Integer deaths;
    private Integer assists;
    private Integer gold;
    private boolean win;
    private String position;
    private boolean ranked;
    private String date;
    private Integer cs;

    public boolean isRanked() {
        return ranked;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        this. date = date.toString();
    }
    
    public void setDate(String day, String month, String year){        
            String d = day + "/" + month + "/" + year;
            date = d;
            
    }
    
    public void setRanked(boolean gameType) {
        this.ranked = gameType;
    }
    
    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public boolean isWin() {
        return win;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void printAll(){
        System.out.println("Champion: " + champion);
        System.out.println("Position: " + position);
        System.out.println("Win?: " + win);
        System.out.println("Kills: " + kills);
        System.out.println("Deaths: "+ deaths);
        System.out.println("Assists: " + assists);
        System.out.println("Gold: " + gold);
        System.out.println("Ranked?: "+ ranked);
        System.out.println("Date: " + date);
        System.out.println("Minion kills: " + cs);
    }
}
