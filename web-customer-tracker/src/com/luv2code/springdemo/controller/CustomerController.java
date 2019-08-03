package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//Need to inject the customer dao
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		//Get list of customer
		List<Customer> theCustomers = customerService.getCustomers();
		
		//add the customers to model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		//Create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		//add the customers to model
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		// save the customer using our service
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
		
	}
	
	//Update student
	@GetMapping("/showFromForUpdate")
	public String showFromForUpdate(@RequestParam("customerId") int theId, Model theModel)
	{
		//Get the customer from service
		Customer theCustomer = customerService.getCustomer(theId);
		
		
		//set customer as model attributes to prepopulate the form
		theModel.addAttribute("customer", 	theCustomer);
		
		
		//Send over to farm
		return "customer-form";
	}
}
