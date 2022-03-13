package com.jeyaprabakar.advancedprogramming;

import com.jeyaprabakar.advancedprogramming.model.entity.Seller;
import com.jeyaprabakar.advancedprogramming.controller.SellerController;
import com.jeyaprabakar.advancedprogramming.repository.SellerRepository;
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
public class SalesAgentUnitTests {

    private static  Seller seller;

    @Mock
    private SellerRepository sellerRepository;

    @InjectMocks
    private SellerController sellerController;

    @Before("")
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @BeforeAll
    public static void init(){

        seller = new Seller();

        seller.setName("Test sales agent");
        seller.setCity("test city");
        seller.setUserid("test userid");
        seller.setPwd("2001");
        seller.setPhone("0752547064");

    }


    @Test
    void createSalesAgent(){

        Seller sellerSaved = sellerRepository.save(seller);
        Mockito.verify(sellerRepository, Mockito.times(1)).save(seller);
    }


    @Test
    void findAllSalesAgent(){

        Mockito.when(sellerRepository.findAll()).thenReturn(Arrays.asList());
        Assertions.assertEquals(sellerRepository.findAll().size(),0);
        Mockito.verify(sellerRepository, Mockito.times(1)).findAll();
    }



    @Test
    void findSalesAgentById(){
        try{
            ResponseEntity<?> sellerSaved = sellerController.findSellerProfile(2);
            Assertions.assertEquals(seller.getName(), sellerSaved.getBody());
        }catch (Exception e){

        }
    }



    @Test
    void deleteSalesAgentById(){
        try {
            sellerController.deleteSeller(6);
            Mockito.verify(sellerRepository, Mockito.times(1)).deleteById(6);
        }catch (Exception e){
        }
    }

}
