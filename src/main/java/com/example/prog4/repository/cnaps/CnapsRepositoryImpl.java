package com.example.prog4.repository.cnaps;

import com.example.prog4.model.EmployeeFilter;
import com.example.prog4.repository.cnaps.entity.Employee;
import com.example.prog4.repository.facade.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class CnapsRepositoryImpl implements EmployeeRepository {
  private CnapsRepository cnapsRepository;
  @Override
  public Optional<com.example.prog4.repository.employee.entity.Employee> findById(String id) {
    return null;
  }

  @Override
  public com.example.prog4.repository.employee.entity.Employee saveEmployee(com.example.prog4.repository.employee.entity.Employee employee) {
    return null;
  }


  @Override
  public List<Employee> findByCriteria(EmployeeFilter filter) {
    return null;
  }

  @Override
  public Employee saveCnaps(Employee employee) {
    return cnapsRepository.save(employee);
  }

  @Override
  public Optional<Employee> findByEndToEndId(String employeeEndToEndId){
    return cnapsRepository.findByEndToEndId(employeeEndToEndId);
  };
  @Override
  public Optional<Employee> findByFirstNameAndLastName(String firstname, String lastname){
    return cnapsRepository.findByFirstNameAndLastName(firstname, lastname);
  };
}
