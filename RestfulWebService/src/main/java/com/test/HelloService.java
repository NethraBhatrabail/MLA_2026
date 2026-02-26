package com.test;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String  simlePlainTextResponse()
	{
		return "This is simple RestFul we service Plain text Response";
	}
	
	@GET
	@Produces
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit") String card)
	{
		return "<html> <body> <h1> Simple RestAPI HTML Response card no : "+card+"</h1> </body> </html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg)  // agter u run in url after html?msg= Hi this message will come in web page 
	{
		return msg;
	}
	
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUsersData()
	{
		UserDetails u1 = new UserDetails(1, "Rohit", "Sharma", "java@dev.com", 1234567890);
		UserDetails u2 = new UserDetails(2, "Virat", "Kohli", "web@dev.com", 987654312);
		UserDetails u3 = new UserDetails(1, "Anushka", "Sharma", "python@dev.com", 1239967890);
		return List.of(u1,u2,u3);
	}

}
