package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("AAAA");
		employee.setLastName("BBB");
		employee.setEmailId("sdsd");
		employeeRepository.save(employee);

		Employee employee2 = new Employee();
		employee2.setFirstName("AAAA2");
		employee2.setLastName("BBB3");
		employee2.setEmailId("sdsd4");
		employeeRepository.save(employee2);
	}
}
