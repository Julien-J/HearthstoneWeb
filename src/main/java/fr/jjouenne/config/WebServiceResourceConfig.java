package fr.jjouenne.config;

import org.glassfish.jersey.server.ResourceConfig;

public class WebServiceResourceConfig extends ResourceConfig{
	
	public WebServiceResourceConfig() {
		System.out.println("config");
        packages("fr.jjouenne.resources");
    }
}
