package jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public Employee getEmployeeBean() {
		Employee empl = new Employee();
		empl.setCode(123);
		empl.setEmpname("TCS"); 
		return empl;
	}
}
