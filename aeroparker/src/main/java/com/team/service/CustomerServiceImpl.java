package com.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.entity.Customer;
import com.team.persistence.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public boolean registerCustomer(Customer customer) {
		if (!customer.getEmail_address().equals("")) {
			try {
				customer.setEmail_address(customer.getEmail_address().toLowerCase());
				customerDAO.save(customer);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}
}
