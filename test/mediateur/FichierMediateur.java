package test.mediateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

public class FichierMediateur extends Mediator {
	public FichierMediateur() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	
	@Override
	public void onRegister() { // la methode donnait ça dans le fichier Mediator : " Called by the View when the Mediator is registered" 
		// TODO Auto-generated method stub
		super.onRegister();
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Veuillez saisir un url :");
		String url = saisieUtilisateur.next();
		sendNotification("LIRE_FICHIER",url,"url");
		sendNotification("LIRE_FICHIER","files/momo/test.txt","texte");
		}
	
	
	@Override
	public String[] listNotificationInterests() {
		String[] result = new String[1];
		result[0]="FICHIER_LU";
		
		return result;
		
	}
	


	
	@Override
	public void handleNotification(INotification notification) {
		
		List<String> list = (List) notification.getBody();
	for (String element : list) {
		System.out.println(element);
	}
	
	
		
	}

}
