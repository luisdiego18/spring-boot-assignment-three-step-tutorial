package edu.wctc.springbootassignmentthreesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wood")
public class SelectAndApplyController {

    @RequestMapping("/select-and-apply-a-wood-stain")
    public String showAddAClearProtective(){
        return "pages/select-and-apply-a-wood-stain";
    }
}
