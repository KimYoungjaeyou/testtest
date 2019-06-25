package com.skcc.model.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private String user_id;
	
	@Column (nullable = true)
	private String user_password;
	
	private String user_name;
	
	private String phone_num;
	
	private Date final_datetime;
	

}
