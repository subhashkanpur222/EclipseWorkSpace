package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//Need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		//get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName",Customer.class);
		
		//execute query and retrieve users
		List<Customer> customers = theQuery.getResultList();
		
		//return the result
		return customers;
	}


	@Override
	public void saveCustomer(Customer theCustomer) {
		//Get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//SaveOrUpdate the customer, this will insert if row is not there and insert if row is there.
		currentSession.saveOrUpdate(theCustomer);
		
	}


	@Override
	public Customer getCustomer(int theId) {
		//Get current Session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//Get the customer based on customer id
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
		return theCustomer;
	}

}
