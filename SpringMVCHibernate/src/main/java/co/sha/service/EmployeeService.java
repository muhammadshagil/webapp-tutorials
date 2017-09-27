package co.sha.service;

import java.util.List;

import co.sha.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
}
