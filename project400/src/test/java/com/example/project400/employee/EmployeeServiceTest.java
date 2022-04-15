package com.example.project400.employee;

import com.example.project400.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;
    private  AutoCloseable autoCloseable;
    private EmployeeService underTest;

    @BeforeEach
    void setUp(){
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new EmployeeService(employeeRepository);
    }
    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    @Test
    void itShouldGetEmployees() {
        //when
        underTest.getEmployees();
        //then
        verify(employeeRepository).findAll();
    }

    @Test
    void getEmployeeById() {

    }

    @Test
    void itShouldAddNewEmployee() {
        //given
        Employee employee = new Employee(
                "Harry",
                "Flanagan",
                "harry@mail.com",
                "0871126409",
                LocalDate.of(1997, Month.JUNE, 30),
                15.50,
                true);
        //when
        underTest.addNewEmployee(employee);

        //then
        ArgumentCaptor<Employee> employeeArgumentCaptor = ArgumentCaptor.forClass(Employee.class);

        verify(employeeRepository).save(employeeArgumentCaptor.capture());

        Employee capturedEmployee = employeeArgumentCaptor.getValue();

        assertThat(capturedEmployee).isEqualTo(employee);
    }

    @Test
    void deleteEmployee() {
    }

    @Test
    void updateEmployee() {
    }
}