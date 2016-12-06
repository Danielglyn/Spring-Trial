import com.springapp.repository.CustomerRepository;
import com.springapp.repository.HibernateCustomerRepositoryImpl;
import com.springapp.service.CustomerService;
import com.springapp.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.springapp"})
public class AppConfig {

  @Bean(name = "customerService")
  public CustomerService getCustomerService(){
    CustomerServiceImpl customerService = new CustomerServiceImpl();
   // customerService.setCustomerRepository(getCustomerRepository());

    return customerService;
  }

  @Bean(name = "customerRepository")
  public CustomerRepository getCustomerRepository(){
    return new HibernateCustomerRepositoryImpl();
  }

}
