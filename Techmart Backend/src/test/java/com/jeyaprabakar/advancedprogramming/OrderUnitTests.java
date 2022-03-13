package com.jeyaprabakar.advancedprogramming;

import com.jeyaprabakar.advancedprogramming.controller.CustomerController;
import com.jeyaprabakar.advancedprogramming.model.entity.Customer;
import com.jeyaprabakar.advancedprogramming.model.entity.Order;
import com.jeyaprabakar.advancedprogramming.controller.OrdersController;
import com.jeyaprabakar.advancedprogramming.repository.CustomerRepository;
import com.jeyaprabakar.advancedprogramming.repository.OrderRepository;
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
import java.util.Date;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
@ContextConfiguration
public class OrderUnitTests {

    private static Order order;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrdersController ordersController;

    @Before("")
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }



}
