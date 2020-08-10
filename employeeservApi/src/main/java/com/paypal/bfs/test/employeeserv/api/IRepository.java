package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

import java.sql.SQLException;

public interface IRepository {
    Boolean persist(Employee emp) throws SQLException;
    Employee retrive(Long id) throws SQLException;
}
