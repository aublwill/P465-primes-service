package edu.iu.aublwill.primesservice.service;

import edu.iu.aublwill.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer)throws IOException;
    boolean login(String username, String password)throws IOException;
}
