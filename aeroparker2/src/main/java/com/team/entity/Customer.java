package com.team.entity;

import java.text.SimpleDateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer{
	@Id
	
	private int ID;
	private String registered = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	private String email_address;
	private String title;
	private String first_name;
	private String last_name;
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String postcode;
	private String phone_number;
}
