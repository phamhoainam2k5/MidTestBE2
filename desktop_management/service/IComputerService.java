package com.vang.midtest.desktop_management.service;

import com.vang.midtest.desktop_management.model.Computer;

import java.util.List;

public interface IComputerService {
    List<Computer> findAll();

    Computer findById(Long id);

    Computer save(Computer computer);

    void remove(Long id);
}
