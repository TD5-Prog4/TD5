package com.example.prog4.repository.facade;

import com.example.prog4.model.EmployeeFilter;
import com.example.prog4.repository.employee.entity.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Primary
@Repository
public interface EmployeeRepository {
    Optional<Employee> findById(String id);
    Employee saveEmployee(Employee employee);
    com.example.prog4.repository.cnaps.entity.Employee saveCnaps(com.example.prog4.repository.cnaps.entity.Employee employee);
    List<com.example.prog4.repository.cnaps.entity.Employee> findByCriteria(EmployeeFilter filter);
    public Optional<com.example.prog4.repository.cnaps.entity.Employee> findByEndToEndId(String endToEndId);
    Optional<com.example.prog4.repository.cnaps.entity.Employee> findByFirstNameAndLastName(String firstname, String lastname);
}
