package edu.wctc.springbootassignmentthreesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/credits")
    public String redirectOffsite(){
        return "redirect:https://www.minwax.com/how-to-finish-wood/three-easy-steps-to-a-beautiful-finish/";
    }
}
