package koreatech.cse.controller;

import koreatech.cse.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {
    @ModelAttribute("name")
    private String getName() {
        return "IamHomeControllerModelAttribute";
    }

    @RequestMapping
    //함수를 호출하면 model을 자동으로 넣어줌
    public String home(Model model)
    {

        return "index";
    }




}
