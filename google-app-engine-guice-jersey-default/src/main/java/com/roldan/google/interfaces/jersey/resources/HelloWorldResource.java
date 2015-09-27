package com.roldan.google.interfaces.jersey.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.roldan.google.interfaces.guice.Service;

@Path("helloworld")
public class HelloWorldResource {
	public static final String CLICHED_MESSAGE = "Hello World!";

	@Inject
	private Service service;
	
	@GET
	@Produces("application/json")
	public String getHello() {
		Greeting greeting = new Greeting(service.getGreeting(), "Jorge");
		Gson gson = new Gson();
		return gson.toJson(greeting); 
	}
}
