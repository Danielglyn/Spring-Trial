import com.springapp.service.CustomerService;
import com.springapp.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dgly0001 on 29/08/2016.
 */
public class Application {

  public static void main(String[] args) {

    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

   // CustomerService customerService = new CustomerServiceImpl();
   // ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
   // CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

    CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

    System.out.println(customerService.findAll().get(0).getFirstName());


  }

}
