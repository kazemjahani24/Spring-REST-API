package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

//this class is just like services side for talking  to our backend DAO side
//and this delegates(entrust (a task or responsibility) to another person) the calls
//from CustomerService to the Actual CustomerDAO

/*
 
 Inheritance in Java programming is the process by which one class takes the property
  of another other class. ... Delegation means that you use an object of another class
   as an instance variable, and forward messages to the instance.
 
 */
public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
