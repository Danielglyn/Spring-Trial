package com.springapp.repository;

import com.springapp.dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class HibernateCustomerRepositoryImpl implements CustomerRepository {

  @Override
  public List<Customer> findAll() {

    List<Customer> customers = new ArrayList<Customer>();

    Customer customer = new Customer();
    customer.setFirstName("Daniel");
    customer.setLastName("Glynn");

    customers.add(customer);

    return customers;

  }

}
