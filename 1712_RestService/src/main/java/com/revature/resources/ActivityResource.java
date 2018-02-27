package com.revature.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.revature.model.Activity;
import com.revature.repository.ActivityRepo;
import com.revature.repository.ActivityRepoImplementation;

@Path("activities") //Endpoint = http://localhost:8080/1712_RestService/rest/activities
public class ActivityResource {

	@GET
//	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})

	public List<Activity> getAllActivities() {
		ActivityRepo a1 = new ActivityRepoImplementation();
		return a1.findAllActivities();
	}
	
	@GET
	@Path("{getActivity}") //Endpoint = http://localhost:8080/1712_RestService/rest/activities/getActivity
	@Produces(MediaType.APPLICATION_XML)
	public Activity getActivity() {
		return new ActivityRepoImplementation().findActivity("1234");
	}
}
