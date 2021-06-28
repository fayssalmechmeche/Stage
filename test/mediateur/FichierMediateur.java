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
import com.fasterxml.jackson.databind.ObjectMapper;

import test.jsonToJava;

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
		ObjectMapper map = new ObjectMapper();
		
		try {
			jsonToJava json = map.readValue(element,jsonToJava.class);
					System.out.println("code" + json.getCode() + "data : " + json.getData() + "currency : " + json.getCurrency() + "name : " + json.getName() + " full name : " + json.getFullName() + "precision : " + json.getPrecision() + "confirms : " + json.getConfirms() + "contractAddress : " + json.getContractAddress() + "withdrawalMinSize : " + json.getWithdrawalMinSize() + "withdrawalMinFee : " + json.getWithdrawalMinFee() + "isWithdrawEnabled : " + json.isWithdrawEnabled() + "isDepositEnabled" + json.isDepositEnabled() + " isMarginEnabled" + json.isMarginEnabled() + "isDebitEnabled" + json.isDebitEnabled() );
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
