package stereoType_Practice.model;

import org.springframework.stereotype.Component;

@Component
public class MicroService {

    public String getTotalHours(int hour){
        return "Total hours: " + (20 + hour);
    }
}
