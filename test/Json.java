package test;

import org.puremvc.java.patterns.mediator.Mediator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;

public class Json {
	

private int userId;
private int id;
private String title;
private boolean completed;
	
	
	
	public int getUserId() {
	return userId;
}



public void setUserId(int userId) {
	this.userId = userId;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getTitle() {
	return title;
}



public void setTitle(String title) {
	this.title = title;
}



public boolean isCompleted() {
	return completed;
}



public void setCompleted(boolean completed) {
	this.completed = completed;
}



	public Json() {
		
	}



	


	
	


	
	
	
}
