package com.acko.pager.pager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acko.pager.pager.model.TeamDetails;
import com.acko.pager.pager.service.NotificationService;

@RestController
@RequestMapping("/acko")
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;

	@PostMapping(path = "/mapteam", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createTeam(@RequestBody TeamDetails teamDetails) {
		
		notificationService.mapTeamToDevelopers(teamDetails);
		
	}
	
	
	
	
	
//	Create team api - This api takes in a team and a list of developers to be mapped with this team, and is
//	expected to create the corresponding entries in the database.
//	Sample request: {"team": {"name": "claims"}, "developers": [{"name": "someone", "phone_number":
//	"9999999999"}, {"name": "somebody", "phone_number": "9111111111"}]}
	
}
