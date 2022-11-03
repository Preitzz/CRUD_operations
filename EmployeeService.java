package com.cloudtech.crud.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudtech.crud.entity.Employee;
import com.cloudtech.crud.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmpServ {

@Autowired

public EmployeeRepository employeeRepository;
@Override
public ArrayList<Employee> findAllEmployee(){
return(ArrayList<Employee>) findAllEmployee();
}

public void deleteAllData() {
    employeeRepository.deleteAll();
}

public void addEmployee(com.cloudtech.crud.controller.Employee employee) {
	employeeRepository.save(employee);
	
}

public void updateEmployee(String id, com.cloudtech.crud.controller.Employee employee) {
	employeeRepository.save(employee);
	
}

@Override
public Employee findAllEmployeeByID(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void addEmployee() {
	// TODO Auto-generated method stub
	
}

//public void deleteEmployee(String id) {
//	
//	
//}
//
//@Override
//public Employee findAllEmployeeByID(int id) {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public void addEmployee() {
//	// TODO Auto-generated method stub
//	
//}
//
//





}
