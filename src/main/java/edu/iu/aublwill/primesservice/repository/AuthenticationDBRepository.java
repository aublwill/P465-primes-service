package edu.iu.aublwill.primesservice.repository;

import edu.iu.aublwill.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer,String> {

    Customer findByUsername(String username);
}
