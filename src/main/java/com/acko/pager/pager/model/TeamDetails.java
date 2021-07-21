package com.acko.pager.pager.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamDetails {
	
	private Team team;	
	private List<Developer> developers;

}
