package com.acko.pager.pager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acko.pager.pager.model.Team;

@Repository
public interface NotificationTeamAlertRepository extends JpaRepository<Team, Long>{

}
