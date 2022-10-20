package net.javaguides.springboot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.javaguides.springboot.model.Donator;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.DonatorRepository;
import net.javaguides.springboot.repository.EmployeeRepository;





import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;



@DataJpaTest

public class DonorRepositoryTest {

	@Autowired
private DonatorRepository donatorRepository;
	
	//Junit test for savedonator
	@Test
	public void saveEmployeeTest() {
	
	Donator donator = new Donator();
	donator.setFirstName("Aman");
	
    Assertions.assertEquals("Aman", donator.getFirstName());
}
@Test
	//Junit test for list of employees
	public void getListOfDonatorTest(){

        List<Donator> donator = null;
		try {
			donator = donatorRepository.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Assertions.assertEquals(0, donator.size());
        
           
        
}
}