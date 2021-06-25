package test.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.puremvc.java.patterns.proxy.Proxy;
import java.net.*;
import java.io.*;


public class FichierProxy extends Proxy {
	
	String urlServeurDistant;
	public FichierProxy() {
		super("fichier_proxy");
		
		
	}
	public void read(String fileName)  {
		
		Path path = Paths.get(fileName);
		try {
			List<String> file = Files.readAllLines(path);
			

			sendNotification("FICHIER_LU",file);
				
		}
		catch (IOException exc) {
		
			
		}
	}
	
	

}
