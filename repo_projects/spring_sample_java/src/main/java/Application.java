import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = new CustomerServiceImpl();

        CustomerService service1 = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service1.findAll().get(0).getFirstName());


    }
}
