package com.springapp.service;

import com.springapp.dto.Customer;
import com.springapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl(){};

  public CustomerServiceImpl(CustomerRepository customerRepository){
    this.customerRepository = customerRepository;
  };

  public void setCustomerRepository(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

}
