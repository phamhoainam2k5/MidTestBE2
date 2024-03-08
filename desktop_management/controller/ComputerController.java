package com.vang.midtest.desktop_management.controller;

import com.vang.midtest.desktop_management.model.Computer;
import com.vang.midtest.desktop_management.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computers")
public class ComputerController {

    @Autowired
    private IComputerService iComputerService;

    @GetMapping
    public ResponseEntity<List<Computer>> findAllComputer() {
        List<Computer> computers = iComputerService.findAll();
        if (computers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> findComputerById(@PathVariable Long id) {
        Computer computer = iComputerService.findById(id);
        return new ResponseEntity<>(computer, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Computer> saveComputer(@RequestBody Computer computer) {
        return new ResponseEntity<>(iComputerService.save(computer), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Computer> updateCustomer(@PathVariable Long id, @RequestBody Computer computer) {
        Computer computerOptional = iComputerService.findById(id);
        computer.setId(computerOptional.getId());
        return new ResponseEntity<>(iComputerService.save(computer), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Computer> deleteCustomer(@PathVariable Long id) {
        Computer computer = iComputerService.findById(id);
        iComputerService.remove(id);
        return new ResponseEntity<>(computer, HttpStatus.OK);
    }
}
