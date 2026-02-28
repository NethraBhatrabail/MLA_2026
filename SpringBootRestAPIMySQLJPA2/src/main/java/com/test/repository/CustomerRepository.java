package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("select c from Customer c where c.name = :name") 
    List<Customer> getCustomerByName(@Param("name") String name);
     
      @Query("select c from Customer c where c.city= :city ")
     List<Customer> getCustomerByCity(@Param("city") String city);
      
      @Query("select c from Customer c order by c.name ASC") 
     List<Customer> getCustomersByNameASC();
	

}
