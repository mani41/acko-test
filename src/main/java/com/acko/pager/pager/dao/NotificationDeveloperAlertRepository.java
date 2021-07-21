package com.acko.pager.pager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acko.pager.pager.model.Developer;

@Repository
public interface NotificationDeveloperAlertRepository extends JpaRepository<Developer, Long> {

}
