package com.cloudtech.crud.repository;
 
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

	void save(com.cloudtech.crud.controller.Employee employee);

	ArrayList<Employee> findAllEmployee();

}
