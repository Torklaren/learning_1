package com.example.learning.service;

import com.example.learning.model.Employee;
import com.example.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
	
	//todo return this from DB
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getallEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}

	public void addEmployee(Employee employee) {
		//todo controller add A new Employee to the DB
		employeeRepository.save(employee);

	}

	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).get();
	}
}
