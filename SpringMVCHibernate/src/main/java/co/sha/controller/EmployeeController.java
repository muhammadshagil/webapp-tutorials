package co.sha.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.sha.model.Employee;
import co.sha.service.EmployeeService;

@Controller
public class EmployeeController {
	private static final Logger logger = Logger
            .getLogger(EmployeeController.class);
	
    public EmployeeController() {
        System.out.println("EmployeeController()");
    }
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(value="/home")
    public ModelAndView listEmployees(ModelAndView model) {
    	List<Employee> employeeList = employeeService.getAllEmployees();
    	for(Employee e : employeeList) {
    		System.out.println(e.getName());
    	}
    	model.addObject("listEmployee", employeeList);
    	model.setViewName("home");
    	return model;
    }
    
    @RequestMapping(value="/")
    public ModelAndView welcomePage(ModelAndView model) {
    	System.out.println("entered welcomPage");
    	String message = "Welcome to Employee forum";
    	model.addObject("message", message);
    	model.setViewName("index");
    	return model;
    }
}
