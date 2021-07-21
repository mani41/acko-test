package com.acko.pager.pager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Developer implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column(name = "team_id")
	private long teamId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
//	@ManyToOne
//	@JoinColumn(name = "")
//	private Team team;
}
