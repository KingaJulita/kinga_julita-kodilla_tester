package com.kodilla.hibernate.manytomany;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTestSuite {

    @Test
    public void testCreateEmployee() {
        // Given
        Employee employee = new Employee("John", "Doe");

        // When & Then
        assertEquals("John", employee.getFirstname());
        assertEquals("Doe", employee.getLastname());
    }

    @Test
    public void testSetFirstname() {
        // Given
        Employee employee = new Employee("John", "Doe");

        // When
        employee.setFirstname("Jane");

        // Then
        assertEquals("Jane", employee.getFirstname());
    }

    @Test
    public void testSetLastname() {
        // Given
        Employee employee = new Employee("John", "Doe");

        // When
        employee.setLastname("Smith");

        // Then
        assertEquals("Smith", employee.getLastname());
    }

    @Test
    public void testAddCompanyToEmployee() {
        // Given
        Employee employee = new Employee("John", "Doe");
        Company company = new Company("Kodilla");

        List<Company> companies = new ArrayList<>();
        companies.add(company);

        // When
        employee.setCompanies(companies);

        // Then
        assertEquals(1, employee.getCompanies().size());
        assertEquals("Kodilla", employee.getCompanies().get(0).getName());
    }
}
