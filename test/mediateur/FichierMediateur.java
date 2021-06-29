package test.mediateur;

import java.io.EOFException;
import java.io.IOException;
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
	        
	        System.out.println("statusCode-" + json.getStatusCode());
	        System.out.println("statusMessage-" + json.getStatusMessage());
	        System.out.println("ipAddress-" + json.getIpAddress());
	        System.out.println("countryCode-" + json.getCountryCode());
	        System.out.println("countryName-" + json.getCountryName());
	        System.out.println("regionName-" + json.getRegionName());
	        System.out.println("cityName-" + json.getCityName());
	        System.out.println("zipCode-" + json.getZipCode());
	        System.out.println("latitude-" + json.getLatitude());
	        System.out.println("longitude-" + json.getLongitude());
	        System.out.println("timeZone-" + json.getTimeZone());
		}
		catch(IOException e) {
			
		}
	  
	}
	}
	}


