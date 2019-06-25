package com.skcc.model.payment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Payment {

	@Id
	private String payment_id;
	
	private String book_id;
	
	private String payee;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus payment_status;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod payment_method;
	
	private Date final_datetime;
	
}
