package com.gbrramos.fcamarachallenge.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cnpj;
    private String address;
    private long phone;
    private Integer quantMotorcicles;
    private Integer quantCars;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public Integer getQuantMotorcicles() {
        return quantMotorcicles;
    }
    public void setQuantMotorcicles(Integer quantMotorcicles) {
        this.quantMotorcicles = quantMotorcicles;
    }
    public Integer getQuantCars() {
        return quantCars;
    }
    public void setQuantCars(Integer quantCars) {
        this.quantCars = quantCars;
    }
}
