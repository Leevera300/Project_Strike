package com.strike.user.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table (name = "user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "loginId")
	private int loginId;
	
	private String password;
	
	private String name;
	
	private String email;
	
	@CreationTimestamp
	@Column(name = "createdAt")
	private int createdAt;
	
	@UpdateTimestamp
	@Column(name = "updatedAt")
	private int updatedAt;
	
}
