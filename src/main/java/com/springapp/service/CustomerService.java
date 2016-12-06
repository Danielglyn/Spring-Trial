package com.springapp.service;

import com.springapp.dto.Customer;

import java.util.List;

/**
 * Created by dgly0001 on 29/08/2016.
 */
public interface CustomerService {

  List<Customer> findAll();
}
