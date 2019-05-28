package controller;

import domain.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping(value = "/")
    public String first() {
        return  "index";
    }

    @RequestMapping(value = "/login")
    public String welcome(){ return "index"; }

    // post 로 보낸 정보를 command 객체를 이용해서 받고있다.
    // 메소드의 매개변수로 @RequestParam("name속성값") 자료형 인수이름 형태로 주면 그 속성을 받아올 수 있다.
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(UserVO user, ModelAndView mv){
        System.out.println("로그인 처리");
        System.out.println(user.toString());

        //객체 보내기 view에선 EL표기법으로 받음
        //model.addAttribute("loginInfo", user);
        //return "loginTest";

        //model and view 활용
        mv.addObject("loginInfo", user);
        mv.setViewName("loginTest");

        return mv;
    }



    @RequestMapping(value = "/forgot")
    public String forgot(){ return "forgot"; }
}
