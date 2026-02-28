package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao custDao;
	
	@Override
	public Customer saveCustomer(Customer cust) {
		
		return custDao.saveCustomer(cust);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		
		return custDao.getCustomerById(id);
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		
		return custDao.updateCustomer(cust);
	}

	@Override
	public List<Customer> deleteCustomerById(int id) {
		
		return custDao.deleteCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return custDao.getAllCustomers();
	}

}
