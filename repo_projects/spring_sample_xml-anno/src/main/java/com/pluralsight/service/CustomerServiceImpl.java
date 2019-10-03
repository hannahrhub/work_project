package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRespository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

@Service("customerService")

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRespository customerRespository

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }
}
