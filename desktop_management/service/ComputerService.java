package com.vang.midtest.desktop_management.service;

import com.vang.midtest.desktop_management.model.Computer;
import com.vang.midtest.desktop_management.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService implements IComputerService {

    @Autowired
    private IComputerRepository iComputerRepository;


    @Override
    public List<Computer> findAll() {
        return iComputerRepository.findAll();
    }

    @Override
    public Computer findById(Long id) {
        return iComputerRepository.findComputerById(id);
    }

    @Override
    public Computer save(Computer computer) {
        return iComputerRepository.save(computer);
    }

    @Override
    public void remove(Long id) {
        iComputerRepository.deleteById(id);
    }
}
