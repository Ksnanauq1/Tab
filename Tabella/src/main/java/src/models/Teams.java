package src.models;

import java.util.ArrayList;
import java.util.List;

public class Teams {
	
private String position;
private String team;
private String matches;
private String points;
private String goals;

public Teams(String Position, String Team, String Matches, String Points, String Goals ){
	this.position = Position;
	this.team = Team;
	this.matches = Matches;
	this.points = Points;
	this.goals = Goals;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public String getMatches() {
	return matches;
}

public void setMatches(String matches) {
	this.matches = matches;
}

public String getPoints() {
	return points;
}

public void setPoints(String points) {
	this.points = points;
}

public String getGoals() {
	return goals;
}

public void setGoals(String goals) {
	this.goals = goals;
}

public class Matches{
	
	private List <String> list;
	
	public Matches() {
		list = new ArrayList<String>();
	}
	
	public void addElement(String element ) {
		list.add(element);
	}
	
	public void showElements() {
		for(String element : list) {
			System.out.println(element);
			
		}
	}
	
}


}

