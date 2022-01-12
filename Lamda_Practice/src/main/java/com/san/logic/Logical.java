package com.san.logic;

import java.util.ArrayList;
import java.util.List;

import com.san.util.Customer;

public class Logical {
	Customer customer, customer1, customer2 = null;
	List<Customer> list = null;

	public List<Customer> getDetails() {

		list = new ArrayList<Customer>();
		customer = new Customer();
		customer1 = new Customer();
		customer2 = new Customer();

		customer.setName("Santosh");
		customer.setId(12);
		customer.setCity("Hyderabad");

		customer1.setName("Ramcharan");
		customer1.setId(201);
		customer1.setCity("Suryapet");

		customer2.setName("Venkat");
		customer2.setId(83);
		customer2.setCity("Nellore");

		list.add(customer);
		list.add(customer1);
		list.add(customer2);

		return list;
	}

}
