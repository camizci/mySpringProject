package bean_practice;

import bean_practice.ConfigEmployee;
import bean_practice.FullTimeEmployee;
import bean_practice.MessageConfig;
import bean_practice.PartTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmployee.class, MessageConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

        ApplicationContext messageContainer = new AnnotationConfigApplicationContext(MessageConfig.class);

        String welcomeMessage = messageContainer.getBean("welcome", String.class);

        System.out.println(welcomeMessage);

        String practiceMessage = messageContainer.getBean("practice", String.class);

        System.out.println(practiceMessage);

        //Second solution
        // Adding the configuration class in container with comma
        //So we can use same container with different config class

        System.out.println("*********Second solution************");

        String welcome = container.getBean("welcome", String.class);
        System.out.println("welcome = " + welcome);

        String practice = container.getBean("practice", String.class);
        System.out.println("practice = " + practice);
    }
}
