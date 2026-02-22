package com.eatm.dto;

import com.eatm.entity.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {
	private int taskId;
	private String taskName;
	private int duration;
	private Status status;
	
	  private int employeeId;
}
