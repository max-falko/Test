package main;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Макс on 23.08.2017.
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String home (){
        return "index.jsp";
    }

    @RequestMapping(value = "/test.form")
    public String test (@RequestParam("name") String param, Model model){
        model.addAttribute("name", param);
        return "hello.jsp";
    }

}
