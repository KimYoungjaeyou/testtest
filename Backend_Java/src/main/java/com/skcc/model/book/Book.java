package com.skcc.model.book;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	private String book_id;
	
	@Column (nullable = true)
	private String user_id;
	
	@Column (nullable = true)
	private String concert_id;
	
	private Date book_start_time;
	
	private Date book_end_time;
	
	@Enumerated(EnumType.STRING)
    private Status status;

	private Date final_datetime;
	
}
