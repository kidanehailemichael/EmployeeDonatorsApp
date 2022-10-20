package net.javaguides.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.javaguides.springboot.model.Donator;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;





import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;



@DataJpaTest

public class EmployeeRepositoryTest {
	
	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	//Junit test for savemployee
	@Test
	public void saveEmployeeTest() {
	
	Employee employee = new Employee();
	employee.setFirstName("Kidane");
	
    Assertions.assertEquals("Kidane", employee.getFirstName());
		
	}
	

@Test
	
	public void getListOfEmployeeTest(){

       // List<Employee> employees=employeeRepository.findAll();
        
       // Assertions.assertEquals(0, employees.size());
        
       
	 List<Employee> employee = null;
		try {
			employee = employeeRepository.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     Assertions.assertEquals(0, employee.size());
       
}
}
