package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {


    @GetMapping(path="/freeTime", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandom(){
        //Pobierz aktualną datę
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int hour = now.getHour();
        if(dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY && hour >= 9 && hour <=17){
            return "Pracuję nie dzwoń";
        }
        else {
            return "Po Pracy";
        }
    }

}
