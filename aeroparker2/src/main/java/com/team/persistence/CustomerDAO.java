package com.team.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team.entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, String>{
	
	public Customer getCustomerByID(int ID);	
}
