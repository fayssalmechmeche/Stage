package test.mediateur;

import java.util.ArrayList;
import java.util.List;

import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

public class FichierMediateur extends Mediator {
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
