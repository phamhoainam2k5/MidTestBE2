package com.vang.midtest.desktop_management.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String manufacturer;
    private String typeComputer;
    private String  systemType;
    private String cpu;
    private String ram;
    private String rom;
    private String graphicsCard;
    private String display;
    private int price;
    private Date manufactureDate;
    private String status;
    private String description;

    public Computer() {
    }

    public Computer(String name, String manufacturer, String typeComputer, String system, String cpu, String ram, String rom, String graphicsCard, String display, int price, Date manufactureDate, String status, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.typeComputer = typeComputer;
        this.systemType = system;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.graphicsCard = graphicsCard;
        this.display = display;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.status = status;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTypeComputer() {
        return typeComputer;
    }

    public void setTypeComputer(String typeComputer) {
        this.typeComputer = typeComputer;
    }

    public String getSystem() {
        return systemType;
    }

    public void setSystem(String system) {
        this.systemType = system;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}