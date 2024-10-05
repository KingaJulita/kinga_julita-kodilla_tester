package com.kodilla.hibernate.manytomany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class CompanyTestSuite {

    @Test
    public void testCreateCompany() {
        // Given
        Company company = new Company("Kodilla");

        // When & Then
        assertEquals("Kodilla", company.getName());
    }

    @Test
    public void testSetName() {
        // Given
        Company company = new Company("Kodilla");

        // When
        company.setName("New Kodilla");

        // Then
        assertEquals("New Kodilla", company.getName());
    }

    @Test
    public void testAddEmployeeToCompany() {
        // Given
        Company company = new Company("Kodilla");
        Employee employee = new Employee("John", "Doe");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);

        // When
        company.setEmployees(employees);

        // Then
        assertEquals(1, company.getEmployees().size());
        assertEquals("John", company.getEmployees().get(0).getFirstname());
    }
}
