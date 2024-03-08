package com.vang.midtest.employee_managerment.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private int age;
    private String gender;
    private Date birthDate;
    private String address;
    private String phone;
    private String email;
    private String department;
    private String position;
    private int salary;
    private Date workStartDate;
    private String status;
    private String insuranceInformation;


}
