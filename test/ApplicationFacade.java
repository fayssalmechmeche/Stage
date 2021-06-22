package test;

import java.util.Scanner;
import java.util.function.Supplier;

import javax.management.Notification;

import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.patterns.facade.Facade;
import org.puremvc.java.patterns.mediator.Mediator;

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


