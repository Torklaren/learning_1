package com.example.learning.controller;

import com.example.learning.model.Employee;
import com.example.learning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getallEmployees();
				}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}

	@PostMapping("/employees")
	public Long addEmployee(@RequestBody Employee employee ) {
		employeeService.addEmployee(employee);
		return employee.getId();
	}
}
