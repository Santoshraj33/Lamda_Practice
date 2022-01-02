package com.san.logic;

import java.util.ArrayList;
import java.util.List;

import com.san.util.Customer;

public class Logical {
	Customer customer, customer1 = null;
	List<Customer> list = null;

	public List<Customer> getDetails() {

		list = new ArrayList<Customer>();
		customer = new Customer();
		customer1 = new Customer();

		customer.setName("Santosh");
		customer.setId(12);
		customer.setCity("Hyderabad");

		customer1.setName("Ramcharan");
		customer1.setId(201);
		customer1.setCity("Suryapet");

		list.add(customer);
		list.add(customer1);

		return list;
	}

}
