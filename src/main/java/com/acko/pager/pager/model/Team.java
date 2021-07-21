package com.acko.pager.pager.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity(name = "team")
@Data
public class Team implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany
	@JoinColumn(name= "team_id")
	private List<Developer> developers;

}
