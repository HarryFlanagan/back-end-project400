package com.example.project400.employee;

import com.example.project400.model.Employee;
import com.example.project400.model.ScheduledShift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }


    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById (Long employeeId) {
        boolean employeeExists = employeeRepository.existsById(employeeId);
        if (!employeeExists){
            throw new IllegalStateException("Employee with id " + employeeId + " does not exist");
        }
        return employeeRepository.findById(employeeId);
    }

    public void addNewEmployee(Employee employee) {
        Optional<Employee> employeeOptional =
        employeeRepository.findEmployeeByEmail(employee.getEmail());
        if(employeeOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        System.out.println(employee);
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId) {
               boolean employeeExists = employeeRepository.existsById(employeeId);
               if (!employeeExists){
                   throw new IllegalStateException("Employee with id " + employeeId + " does not exist");
               }
               employeeRepository.deleteById(employeeId);
    }

    @Transactional
    public void updateEmployee(Long employeeId, String firstName) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new IllegalStateException("Employee with id " + employeeId + " does not exist"));

        employee.setFirstName(firstName);
    }
}
