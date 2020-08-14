/*package com.paypal.bfs.test.employeeserv.impltest;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.impl.EmployeeResourceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServImplTest {

    @InjectMocks
    EmployeeResourceImpl employeeResourceImpl;

    @Test
    public void employeeGetById(){
        ResponseEntity<Employee> responseEntity = employeeResourceImpl.employeeGetById("205");
        Employee emp = responseEntity.getBody();
        Assert.assertEquals(getEmployee(), emp);
    }

    public Employee getEmployee(){
        Employee emp = new Employee();
        Address address= new Address();
        address.setLine1("3503 Aston manor ct");
        address.setLine2("apt 203");
        address.setCity("Silver Spring");
        address.setState("Maryland");
        address.setCountry("USA");
        address.setZipCode(20904);
        emp.setId(205);
        emp.setFirstName("pooja");
        emp.setLastName("eaga");
        emp.setDateOfBirth("Nov 02 1993");
        emp.setAddress(address);
        return emp;

    }



} */
