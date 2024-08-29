package com.kgisl.sb1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customer")
@RestController
public class CustomerController {
    {System.out.println("CustomerController");}
    
    @GetMapping
    public  List<String> getAllCustomers(){
        List<String> emp= List.of("Raji","Madhu");
        return emp;
    }
}
