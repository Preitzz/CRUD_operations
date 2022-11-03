package com.cloudtech.crud.service;

import java.util.ArrayList;

import com.cloudtech.crud.entity.Employee;

public interface EmpServ {
	
	    ArrayList<Employee> findAllEmployee();
	    Employee findAllEmployeeByID(int id);
	    void addEmployee();
	    void deleteAllData();
	
}
