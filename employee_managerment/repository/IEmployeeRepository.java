package com.vang.midtest.employee_managerment.repository;

import com.vang.midtest.employee_managerment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findComputerById(Long id);
}
