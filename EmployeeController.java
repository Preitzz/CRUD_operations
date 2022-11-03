package com.cloudtech.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudtech.crud.service.EmployeeService;
@SuppressWarnings("unused")
@RestController
@RequestMapping("/employees")
public class EmployeeController { 
	
	@Autowired 
private EmployeeService employeeService;
	
//	public List<Employee> getAllEmployee(){return employeeService.getAllEmployee();} 
//	@PostMapping
//	public EmployeeService addEmployee(@RequestBody Employee employee) {
//		return employeeService.save(employee);
//		
//	}
//	public EmployeeService getEmployeeService() {
//		return employeeService;
//	}
//
//	public void setEmployeeService(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}
//}

//public List<Employee> getAllEmployee(){
//    return employeeService.findAllEmployee();
//}
@RequestMapping(method = RequestMethod.POST, value="/office")
public void addSubject(@RequestBody Employee employee){
    employeeService.addEmployee(employee);
}
@RequestMapping(method = RequestMethod.PUT, value="/office/{id}")
public void updateSubject(@PathVariable  String id, @RequestBody Employee employee){
    employeeService.updateEmployee(id ,employee);
}
//@RequestMapping(method = RequestMethod.DELETE,value = "/office/{id}")
//public void deleteSubject(@PathVariable String id, @RequestBody Employee employee){
//    employeeService.deleteEmployee(id);
//}
@RequestMapping(method = RequestMethod.DELETE,value = "/office/{id}")
public void delete() {
	employeeService.deleteAllData();
}
}