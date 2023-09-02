package stereoType_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereoType_Practice.config.WorkHoursConfig;
import stereoType_Practice.model.DataStructure;
import stereoType_Practice.model.MicroService;

public class StereoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(WorkHoursConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        System.out.println("dataStructure.getTotalHours(15) = " + dataStructure.getTotalHours(15));

        MicroService microService = container.getBean(MicroService.class);
        System.out.println("microService.getTotalHours(100) = " + microService.getTotalHours(100));

        System.out.println("dataStructure.getTotalHours() = " + dataStructure.getTotalHours());
    }
}
