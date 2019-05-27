package controller;

import domain.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/")
    public String first() {
        return  "index";
    }

    @RequestMapping(value = "/login")
    public String welcome(){ return "index"; }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserVO user){
        System.out.println("로그인 처리");
        System.out.println(user.toString());

        return "index";
    }

    @RequestMapping(value = "/forgot")
    public String forgot(){ return "forgot"; }
}
