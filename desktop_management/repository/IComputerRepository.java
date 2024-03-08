package com.vang.midtest.desktop_management.repository;

import com.vang.midtest.desktop_management.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IComputerRepository extends JpaRepository<Computer, Long> {
    Computer findComputerById(Long id);
}
