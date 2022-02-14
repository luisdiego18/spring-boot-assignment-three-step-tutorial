package edu.wctc.springbootassignmentthreesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wood")
public class PrepareWoodController {

    @RequestMapping("/prepare-the-wood")
    public String showAddAClearProtective(){
        return "pages/prepare-the-wood";
    }
}
