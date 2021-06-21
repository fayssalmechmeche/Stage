package test.controller;

import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

import test.model.FichierProxy;
import test.model.URLProxy;

public class LireFichierCommand extends SimpleCommand {
	
	@Override
	public void execute(INotification notification) {
		// TODO Auto-generated method stub
		super.execute(notification);
		if(notification.getType().equals("url")) { // mettre du code ici
			URLProxy proxy = (URLProxy) facade.retrieveProxy("url_proxy");
			proxy.getCode((String)notification.getBody()); 
			
		} else {
		FichierProxy proxy = (FichierProxy) facade.retrieveProxy("fichier_proxy");
		proxy.read((String) notification.getBody());
		}
	}

}
