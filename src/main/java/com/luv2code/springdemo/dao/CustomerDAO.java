package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
/*
 
dao is a simple java class which contains JDBC logic . Data Access Layer has proven 
good in separate business logic layer and persistent layer. The DAO design pattern 
completely hides the data access implementation from its clients.
  
The Data Access Object is basically an object or an interface that provides access
to an underlying database or any other persistence storage.

 */
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
