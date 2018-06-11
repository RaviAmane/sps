package com.ra.sps.iam.permission;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Action {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long actionId;
	
	private String name;

	public Long getActionId() {
		return actionId;
	}

	public String getName() {
		return name;
	}

}
