package masterspringmvc.masterspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    //@ResponseBody
    public String hello(@RequestParam(defaultValue = "world") String name, Model model){
        //return "hello world";
        model.addAttribute("message", "Hello " + name);
        return "resultPage";
    }
}

