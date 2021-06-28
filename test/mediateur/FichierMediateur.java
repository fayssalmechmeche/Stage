package test.mediateur;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
			
	        ObjectMapper mapper = new ObjectMapper();
	        JsonNode node = mapper.readTree(element);
            System.out.println("node"+node);
            String code = node.get("code").asText();
            System.out.println(code);
            String currency = node.get("currency").asText();
            System.out.println(currency);
            String name = node.get("name").asText();
            System.out.println(name);
            String fullName = node.get("fullName").asText();
            System.out.println(fullName);
            String Bitcoin = node.get("Bitcoin").asText();
            System.out.println(Bitcoin);
            String precision = node.get("precision").asText();
            System.out.println(precision);
            String confirms = node.get("confirms").asText();
            System.out.println(confirms);
            String contractAddress = node.get("contractAddress").asText();
            System.out.println(contractAddress);
            String withdrawalMinSize = node.get("withdrawalMinSize").asText();
            System.out.println(withdrawalMinSize);
            String withdrawalMinFee = node.get("withdrawalMinFee").asText();
            System.out.println(withdrawalMinFee);
            String isWithdrawEnabled = node.get("isWithdrawEnabled").asText();
            System.out.println(isWithdrawEnabled);
            String isDepositEnabled = node.get("isDepositEnabled").asText();
            System.out.println(isDepositEnabled);
            String isMarginEnabled = node.get("isMarginEnabled").asText();
            String isDebitEnabled = node.get("isDebitEnabled").asText();
            System.out.println(isDebitEnabled);System.out.println(isMarginEnabled);
            
            
          
            
			} catch (JsonParseException e) { // si je mettais pas ça j'avais une erreur 
				
				e.printStackTrace();
			} catch (JsonMappingException e) {// si je mettais pas ça j'avais une erreur 
				
				e.printStackTrace();
			} catch (IOException e) {// si je mettais pas ça j'avais une erreur 
				
				e.printStackTrace();
			}
		
	}
	
	
	
	
	
	
	}

}
