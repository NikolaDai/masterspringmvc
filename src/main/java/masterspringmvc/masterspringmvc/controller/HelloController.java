package masterspringmvc.masterspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    //@ResponseBody
    public String hello(@RequestParam(defaultValue = "world") String name, Model model){
        //return "hello world";

        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");

        model.addAttribute("tweets", c);
        model.addAttribute("message", "Hello " + name);
        return "resultPage";
    }
}

