package com.skcc.model.concert;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Concert {

	@Id
	private String concert_id;
	
	private String concert_name;
	
	private String place;
	
	private String place_image;
	
	private int price;
	
	private Date final_datetime;
	
	
}
