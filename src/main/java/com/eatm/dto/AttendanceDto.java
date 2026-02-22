package com.eatm.dto;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope(value ="prototype")
public class AttendanceDto {
	
	private int attendanceId;
	private LocalDateTime loginTime;
	private LocalDateTime logoutTime;
}
