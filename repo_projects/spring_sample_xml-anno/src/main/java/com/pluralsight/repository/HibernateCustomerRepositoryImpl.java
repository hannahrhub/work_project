package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")

public class HibernateCustomerRepositoryImpl implements CustomerRespository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer =  new Customer();

        customer.setFirstName("Brian");
        customer.setLastName("Hansen");

        customers.add(customer);

        return customers;
    }
}
