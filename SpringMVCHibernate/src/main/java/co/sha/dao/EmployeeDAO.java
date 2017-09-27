package co.sha.dao;

import java.util.List;

import co.sha.model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();

}
