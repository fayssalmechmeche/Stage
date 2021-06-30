package test.mediateur;

import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import test.Json;


public class FichierMediateur extends Mediator {
	public FichierMediateur() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	
	@Override
	public void onRegister() { // la methode donnait ça dans le fichier Mediator : " Called by the View when the Mediator is registered" 
		
		super.onRegister();
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Veuillez saisir un url :");
		String url = saisieUtilisateur.next();
		sendNotification("LIRE_FICHIER",url,"url");
		//sendNotification("LIRE_FICHIER","files/momo/test.txt","texte");
		}
	
	
	@Override
	public String[] listNotificationInterests() {
		String[] result = new String[1];
		result[0]="FICHIER_LU";
		
		return result;
		
	}
	


	
	@Override
	public void handleNotification(INotification notification) {
		
	ArrayList<String> list = (ArrayList) notification.getBody();
		
	for (String element : list) {
		System.out.println(element+"\n");
		
			
		
        

		
		try {
			
			
	        ObjectMapper obj_ObjectMapper = new ObjectMapper();
	        Json json = new Json();
	        json = obj_ObjectMapper.readValue(element, Json.class);
	        System.out.println("userId : " + json.getUserId() + " id : " + json.getId() + " title : " + json.getTitle() + " completed : " + json.isCompleted());
	        
	      
	       
		} catch (IOException e1) {
			
		}
	  
	}
	}
	}


