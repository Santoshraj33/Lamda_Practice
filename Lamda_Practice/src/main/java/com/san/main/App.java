package com.san.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.san.logic.Logical;
import com.san.util.Customer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Customer> list = null;
		Logical logical = new Logical();
		list = new LinkedList<>();

		list = logical.getDetails();
		Collections.sort(list, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
		for (Customer customer : list) {
			System.out.println(customer.getName());
		}

	}
}
