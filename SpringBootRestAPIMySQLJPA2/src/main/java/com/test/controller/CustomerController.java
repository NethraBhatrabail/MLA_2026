package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.repository.CustomerRepository;
import com.test.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/customer/v1/api")
@Tag(name = "CUSTOMER CRUD OPERATIONS")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	@Autowired
	private CustomerRepository repository;
	@PostMapping("/create")
	@Operation(summary = "CREATE CUSTOMER")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cust)
	{
		Customer cobj = service.saveCustomer(cust);
		
		if(cobj != null)
		{
			return new ResponseEntity<>(cobj, HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(cobj, HttpStatus.BAD_REQUEST); 
		}
	}
	
	@GetMapping("/list")
	@Operation(summary = "Listing all customers")
	public ResponseEntity<List<Customer>> listAllCustomers()
	{
		List<Customer> list = service.getAllCustomers();
		
		if(list.size() > 0)
		{
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/{id}", produces ="application/json")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id){
		Optional<Customer> cust = service.getCustomerById(id);
		if(cust != null) {
			return new ResponseEntity<>(cust, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(cust, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping(value= "/{id}", consumes = "application/json")
	public ResponseEntity<Customer> updateCustomerById(@PathVariable int id, @RequestBody Customer customer)
	{
		customer.setId(id);
		Customer cust = service.updateCustomer(customer);
		
		if(cust != null) {
			return new ResponseEntity<>(cust, HttpStatus.ACCEPTED);
		}else {
			//throw new EmployeeNotFoundException("NO_CONTENT_GIVEN_REQUEST");
			return new ResponseEntity<>(cust, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value= "/{id}", produces="application/json")
	public ResponseEntity<List<Customer>> deleteCustomerById(@PathVariable int id)
	{
		List<Customer> list = service.deleteCustomerById(id);
		if(list.size()>0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/byname/{name}")
	@Operation(summary="get employee by name")
	public ResponseEntity <List<Customer>> getCustomerByName(@PathVariable String name)
	{
		
	   List<Customer> cust= repository.getCustomerByName(name);	
	   if(cust != null) {
			return new ResponseEntity<>(cust, HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>(cust, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/bycust/{city}")
	@Operation(summary="get customer by city")
	public ResponseEntity <List<Customer>> getCustomerByCity(@PathVariable String city)
	{
		
	   List<Customer> list= repository.getCustomerByCity(city);	
		if(list.size()>0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/custlist/asc")
	@Operation(summary ="customer by asc order by name")
	public ResponseEntity<List<Customer>> getCustomersByNameASC()
	{
		List<Customer> list= repository.getCustomersByNameASC();	
		if(list.size()>0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
		}
	}


}
