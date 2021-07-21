package com.acko.pager.pager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acko.pager.pager.dao.NotificationDeveloperAlertRepository;
import com.acko.pager.pager.dao.NotificationTeamAlertRepository;
import com.acko.pager.pager.model.TeamDetails;

@Service
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	private NotificationTeamAlertRepository notificationTeamAlertRepository;
	
	@Autowired
	private NotificationDeveloperAlertRepository notificationDeveloperAlertRepository;

	@Override
	public void mapTeamToDevelopers(TeamDetails teamDetails) {
		
		notificationTeamAlertRepository.save(teamDetails.getTeam());
		
		notificationDeveloperAlertRepository.saveAll(teamDetails.getDevelopers());
		
		
	}

}
