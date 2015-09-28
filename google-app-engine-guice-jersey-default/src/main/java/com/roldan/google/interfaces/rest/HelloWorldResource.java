package com.roldan.google.interfaces.rest;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.roldan.google.application.Service;

@Path("helloworld")
@Singleton
public class HelloWorldResource {

	@Inject
	private Service service;
	
	@GET
	@Produces("application/json")
	public Response getHello() {
		Greeting greeting = new Greeting(service.getGreeting(), "Jorge");
		return Response.status(Response.Status.OK).entity(greeting).build(); 
	}
}
