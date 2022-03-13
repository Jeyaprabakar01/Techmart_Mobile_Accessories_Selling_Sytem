package com.jeyaprabakar.advancedprogramming;



import com.jeyaprabakar.advancedprogramming.model.entity.Product;
import com.jeyaprabakar.advancedprogramming.controller.ProductController;
import com.jeyaprabakar.advancedprogramming.repository.ProductRepository;
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
public class ProductUnitTests {

    private static Product product;

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @Before("")
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @BeforeAll
    public static void init(){

        product = new Product();

        product.setPname("test name");
        product.setBrand("test brand");
        product.setPcat("test cat");
        product.setSubcat("test sub cat");
        product.setPrice(20000);
        product.setPhoto("test photo");
    }


    @Test
    void createProduct(){

        Product productSaved = productRepository.save(product);
        Mockito.verify(productRepository, Mockito.times(1)).save(product);
    }


    @Test
    void findAllProducts(){

        Mockito.when(productRepository.findAll()).thenReturn(Arrays.asList());
        Assertions.assertEquals(productRepository.findAll().size(),0);
        Mockito.verify(productRepository, Mockito.times(1)).findAll();
    }


    @Test
    void findProductById(){
        try{
            ResponseEntity<?> productSaved = productController.findProduct(1);
            Assertions.assertEquals(product.getPname(), productSaved.getBody());
        }catch(Exception e){

        }
    }


    @Test
    void deleteProductsById(){
        try {
            productController.deleteProduct(6);
            Mockito.verify(productRepository, Mockito.times(1)).deleteById(6);
        }catch (Exception e){
        }
    }

}
