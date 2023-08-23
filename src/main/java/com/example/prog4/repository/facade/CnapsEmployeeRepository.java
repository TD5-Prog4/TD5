package com.example.prog4.repository.facade;

import com.example.prog4.model.EmployeeFilter;
import com.example.prog4.repository.employee.entity.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public interface CnapsEmployeeRepository {
    Employee findById(String id);
    Employee save(Employee employee);
    List<Employee> findByCriteria(EmployeeFilter filter);
    com.example.prog4.repository.cnaps.entity.Employee findByEndToEndId(String endToEndId);

}
