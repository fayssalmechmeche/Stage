package test.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.puremvc.java.patterns.proxy.Proxy;

public class URLProxy extends Proxy {
	public URLProxy() {
		super("url_proxy");
	
		
	}

	// mettre du code ici
	public  void getCode(String url){
		   List<String> list = new ArrayList();
	       String code = "";
	       
	        if(urlExists(url))
	        {
	                BufferedReader in = null;

	                try
	                {
	                    URL site = new URL(url);
	                    in = new BufferedReader(new InputStreamReader(site.openStream()));

	                    String inputLine;
	                    while ((inputLine = in.readLine()) != null)
	                    {
	                        code = code + "\n" + (inputLine);
	                    }

	                    in.close();

	                }
	                catch (IOException ex)
	                {
	                    
	                    list.add("Erreur dans l'ouverture de l'URL : " + ex);
	                    
	                }
	                finally
	                {
	                    try
	                    {
	                        in.close();
	                    }
	                    catch (IOException ex)
	                    {
	                        
	                        list.add("Erreur dans la fermeture du buffer : " + ex);
	                    }
	                }
	        }
	        else
	        {
	           list.add("\"Le site n'existe pas !\"");
	        }
	        
	       list.add(code);  
	       sendNotification("FICHIER_LU",list); 
	       
	    }
	public static boolean urlExists(String url)
	   {
	        try {
	            URL site = new URL(url);
	            try {
	                site.openStream();
	                return true;
	            } catch (IOException ex) {
	                return false;
	            }
	        } catch (MalformedURLException ex) {
	            return false;
	        }
	   }
}
