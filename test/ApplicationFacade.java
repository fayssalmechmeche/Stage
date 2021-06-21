package test;

import java.util.Scanner;
import java.util.function.Supplier;

import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.patterns.facade.Facade;

import test.controller.LireFichierCommand;
import test.mediateur.FichierMediateur;
import test.model.FichierProxy;
import test.model.URLProxy;

public class ApplicationFacade extends Facade {
	private static ApplicationFacade facade;
	 static ApplicationFacade getInstance() {
		 if (facade == null ) {
			 ApplicationFacade facade = new ApplicationFacade();
		 }
		 return facade;
		 
		 
	 }
	 @Override
	protected void initializeFacade() {
		// TODO Auto-generated method stub
		super.initializeFacade();
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Veuillez saisir un url :");
		String url = saisieUtilisateur.next();
		sendNotification("LIRE_FICHIER","files/momo/test.txt","texte");
		sendNotification("LIRE_FICHIER",url,"url"); // voir ça 
		
	}
	 @Override
		protected void initializeController() {
			// TODO Auto-generated method stub
			super.initializeController();
			Supplier<ICommand> supplier = ()-> new LireFichierCommand();
			this.registerCommand("LIRE_FICHIER", supplier );
		}
	 
	 @Override
	protected void initializeModel() {
		// TODO Auto-generated method stub
		super.initializeModel();
		this.registerProxy(new FichierProxy());
		this.registerProxy(new URLProxy());
	}
	 
	 @Override
	protected void initializeView() {
		// TODO Auto-generated method stub
		super.initializeView();
		this.registerMediator(new FichierMediateur());
	}

}
