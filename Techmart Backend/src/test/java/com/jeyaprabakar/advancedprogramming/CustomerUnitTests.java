package com.jeyaprabakar.advancedprogramming;


import com.jeyaprabakar.advancedprogramming.model.entity.Customer;
import com.jeyaprabakar.advancedprogramming.controller.CustomerController;
import com.jeyaprabakar.advancedprogramming.repository.CustomerRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
@ContextConfiguration
public class CustomerUnitTests {

    private static  Customer customer;

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerController customerController;

    @Before("")
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @BeforeAll
    public static void init(){

        customer = new Customer();

        customer.setName("test name");
        customer.setCity("test city");
        customer.setUserid("test id");
        customer.setPwd("2001");
        customer.setPhone("076354604");
        customer.setGender("Male");
    }


    @Test
    void createCustomer(){

        Customer customerSaved = customerRepository.save(customer);
        Mockito.verify(customerRepository, Mockito.times(1)).save(customer);
    }


    @Test
    void findAllCustomers(){

        Mockito.when(customerRepository.findAll()).thenReturn(Arrays.asList());
        Assertions.assertEquals(customerRepository.findAll().size(),0);
        Mockito.verify(customerRepository, Mockito.times(1)).findAll();
    }


    @Test
    void findCustomerById(){
        try{
            ResponseEntity<?> customerSaved = customerController.findCustomerById(1);
            Assertions.assertEquals(customer.getName(), customerSaved.getBody());
        }catch(Exception e){

        }
    }





}
