package edu.iu.aublwill.primesservice.controller;

import edu.iu.aublwill.primesservice.service.IPrimesService;
import edu.iu.aublwill.primesservice.service.PrimesService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    PrimesService primesService;

    public PrimesController(PrimesService primesService){
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n){
        return primesService.isPrime(n);
    }
}
