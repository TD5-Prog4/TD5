package com.example.prog4.repository.facade;

import java.util.List;
import java.util.Optional;

import com.example.prog4.model.EmployeeFilter;
import com.example.prog4.model.exception.NotFoundException;
import com.example.prog4.repository.cnaps.CnapsRepository;
import com.example.prog4.repository.employee.EmployeeRepository;
import com.example.prog4.repository.employee.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
@AllArgsConstructor
public class CnapsEmployeeRepositoryImpl extends CnapsEmployeeRepositoryFacadeImpl {
    private final EmployeeRepository employeeRepository;
    private final CnapsRepository cnapsRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
