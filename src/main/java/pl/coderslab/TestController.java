package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping("/helloParam")
    @ResponseBody
    public String helloParam(HttpServletRequest request) {
        String param = request.getParameter("paramName");
        System.out.println(param);
        return "My param = " + param;
    }

    @RequestMapping("/helloRequestParam")
    @ResponseBody
    public String helloRequest(@RequestParam (defaultValue="1") String paramName){

        System.out.println(paramName);
        return "My param=" + paramName;

    }
}

