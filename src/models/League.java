package models;

import java.util.Arrays;

public class League {
private String name;
private Team[] teams;

public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public Team[] getTeams() {
  return teams;
}
public void setTeams(Team[] teams) {
  this.teams = teams;
}



public League(String name, Team[] teams) {
  this.name = name;
  this.teams = teams;
}


@Override
public String toString() {
  return "League [name=" + name + ", teams=" + Arrays.toString(teams) + "]";
}


public int getTotalActiveGoals() {
  int total = 0;
  if(teams!=null){
    for(int i= 0; i<teams.length;i++){
      Player[] players = teams[i].getPlayers();
      if(players!= null){
        for(int j =0; j<players.length;j++){
          if (players[j].isActive()){
            total+=players[j].getGoals();
          }
        }
      }
    }
  }
  return total;
}





}
