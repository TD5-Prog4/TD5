package com.example.prog4.repository.employee;

import com.example.prog4.model.EmployeeFilter;
import com.example.prog4.repository.employee.entity.Employee;
import com.example.prog4.repository.facade.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private com.example.prog4.repository.employee.EmployeeRepository employeeRepository;
    @Override
    public Optional<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public com.example.prog4.repository.cnaps.entity.Employee saveCnaps(com.example.prog4.repository.cnaps.entity.Employee employee) {
        return null;
    }

    @Override
    public List<com.example.prog4.repository.cnaps.entity.Employee> findByCriteria(EmployeeFilter filter) {
        return null;
    }

    @Override
    public Optional<com.example.prog4.repository.cnaps.entity.Employee> findByEndToEndId(String endToEndId) {
        return Optional.empty();
    }

    @Override
    public Optional<com.example.prog4.repository.cnaps.entity.Employee> findByFirstNameAndLastName(String firstname, String lastname) {
        return Optional.empty();
    }
}
