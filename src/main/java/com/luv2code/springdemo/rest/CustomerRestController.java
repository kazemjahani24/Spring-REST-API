package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")

public class CustomerRestController {
	
	//autowire the customerService
	@Autowired
	private CustomerService customerService;
	
	//add mapping for GET/ 
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		
		return customerService.getCustomers();
		
	}
	
	//add mapping for GET /customers/{customerId}
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		Customer theCustomer = customerService.getCustomer(customerId);
		
		//25.2.3_
		if(theCustomer ==null) {
			throw new CustomerNotFoundException("Customer id not found - " +customerId);
		}
		
		return theCustomer;
		
	}
	
	
	//25.3.1_ add mapping for post customers - add new customer
	@PostMapping("/customers")
	//in the line below,with the RequestBody annotation,we will ge the json as java pojo
	public Customer addCustomer(@RequestBody Customer theCustomer) {
		
		//also just inccase we pass an id in json... set id to 0
		
		//this will force a save for a new item instead of update
		theCustomer.setId(0);
		
		customerService.saveCustomer(theCustomer);
		
	return theCustomer;
	}
	
	//25.4_ add  add mapping for PUT / customers -update existing customer
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
		
		//in the line below we are delegating the call to the customer service
		customerService.saveCustomer(theCustomer);
		
		return theCustomer;
	}
	
	
	//25.5_ add mapping for DELETE/customers/{customerId} - delete customer
	@DeleteMapping("customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		
		//in the line below, we are retrieving the customer
		Customer tempCustomer =  customerService.getCustomer(customerId);
		
		//after retrieving we will check if the customer id is null or not, if it is null then throw exception, and if it is
		//not null then delete that customer
		if(tempCustomer ==null) {
			throw new CustomerNotFoundException("Customer id not found - " +customerId);
		}
		
		
				//delegating the call to the service
			 	//A delegate is a type that represents references to methods with a particular parameter list and return
				// type. ... This makes it possible to programmatically change method calls, and also plug new code into
				//existing classes. In the context of method overloading, the signature of a method does not include the return value
		customerService.deleteCustomer(customerId);
		
		return "Deleted customer id - " +customerId;
		
	}
	
	
	
	
	
	

}
