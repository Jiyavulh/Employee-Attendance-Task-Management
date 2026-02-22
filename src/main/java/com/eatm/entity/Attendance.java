package com.eatm.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendanceId;
	@CreationTimestamp//when we create attendance object
	private LocalDateTime loginTime;
	private LocalDateTime logoutTime;
}
