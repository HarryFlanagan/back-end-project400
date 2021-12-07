package com.example.project400.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
@CrossOrigin(origins = "http://webhostingproject400.s3-website-eu-west-1.amazonaws.com")
public class EmployeeController {

    /*Dependency Injection*/
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    /*CRUD Operations*/
    @GetMapping("/aws")
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("Spring Boot App running on AWS EC2 Instance");
    }
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping
    public void registerNewEmployee(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping(path = "{employeeId}")
    public void updateEmployeeName(
            @PathVariable("employeeId") Long id,
            @RequestParam(required = false) String firstName){
        employeeService.updateEmployee(id, firstName);
    }
}

