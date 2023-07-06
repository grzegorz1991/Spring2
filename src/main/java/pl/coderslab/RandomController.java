package pl.coderslab;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping(value = "/show-random", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    @ResponseBody
    public String showRandom() {
        Random random = new Random();
        return "Wylosowano liczbę: " + String.valueOf(random.nextInt(100) + 1);
    }

    @GetMapping(value = "/random/{max}" ,produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    @ResponseBody
    public String randomMax(@PathVariable int max) {
        Random random = new Random();
        String response = "Użytkownik podał wartość : " + max + " Wylosowano liczbę : " + String.valueOf(random.nextInt(max) + 1);
        return response;
    }
}
