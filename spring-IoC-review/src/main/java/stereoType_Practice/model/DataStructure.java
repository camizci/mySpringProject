package stereoType_Practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
@Data  //Instead of use AllArgs, use Data with NonNull annotation
public class DataStructure {

    @NonNull // with @Data annotation
    ExtraHours extraHours;

    public String getTotalHours(int hour){
        return "Total hours: " + (20 + hour);
    }

    public String getTotalHours(){
        return "Total hours: " + (20 + extraHours.getHours());
    }
}
