package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigEmployee {

    @Bean
    FullTimeEmployee getFullTimeEmployee(){
       return new FullTimeEmployee();
    }

    @Bean
    PartTimeEmployee getPartTimeEmployee(){
       return new PartTimeEmployee();
    }



}
