import com.pluralsight.repository.CustomerRespository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.setCustomerRespository(getCustomerRepository());
        return service;
    }
    @Bean (name = "customerRepository")
    public CustomerRespository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}

//@configuration demo