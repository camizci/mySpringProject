package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean(name = "welcome")
    public String getWelcomeMessage(){
        return "Welcome to Account App";
    }
    @Bean(name = "practice")
    public String getPracticeMessage(){
        return "Spring Core Practice";
    }

}
