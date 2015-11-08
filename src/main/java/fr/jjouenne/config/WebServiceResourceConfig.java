package fr.jjouenne.config;

import org.glassfish.jersey.server.ResourceConfig;

public class WebServiceResourceConfig extends ResourceConfig{
	
	public WebServiceResourceConfig() {
		packages("fr.jjouenne.resources");
    }
}
