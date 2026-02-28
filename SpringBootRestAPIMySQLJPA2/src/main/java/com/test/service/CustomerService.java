package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entity.Customer;



public interface CustomerService {
	public Customer saveCustomer(Customer cust);

	public Optional<Customer> getCustomerById(int id);

	public Customer updateCustomer(Customer cust);

	public List<Customer> deleteCustomerById(int id);

	public List<Customer> getAllCustomers();

}
