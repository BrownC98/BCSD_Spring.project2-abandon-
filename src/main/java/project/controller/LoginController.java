package project.controller;

import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.service.UserService;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String welCome() {
        return "login";
    }

    // post 로 보낸 정보를 command 객체를 이용해서 받고있다.
    // 메소드의 매개변수로 @RequestParam("name속성값") 자료형 인수이름 형태로 주면 그 속성을 받아올 수 있다.
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(UserVO user, ModelAndView mv) {
        System.out.println("로그인 처리");
        System.out.println(user.toString());
        UserVO userVo = userService.LogIn(user);
        System.out.println("vo 확인");
        System.out.println(userVo.getUserEmail()+" "+userVo.getUserPassword());
        //디비에 없는 이메일인지 체크 || 입력한 아이디에 매치하지 않는 비번인지 체크
        if (userVo == null || !(userVo.getUserPassword().equals(user.getUserPassword()))) {
            mv.addObject("wrong", true);
            mv.setViewName("login");
            return mv;
       } else  {
            //게시판 홈으로 이동 model and view 활용
            mv.addObject("loginInfo", user);
            mv.setViewName("index");
            return mv;
        }

        //객체 보내기 view에선 EL표기법으로 받음
        //model.addAttribute("loginInfo", user);
        //return "loginTest";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register(ModelAndView mv) {
        mv.setViewName("register");
        return mv;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerPost(UserVO user, ModelAndView mv, RedirectAttributes redirect){
            userService.Register(user);
            redirect.addFlashAttribute("msg", "가입완료");
            mv.setViewName("redirect:/login");

            return mv;
    }

    //가입한후 login 창으로 이동하는 용도
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView afterRegister(ModelAndView mv) {
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "/forgot", method = RequestMethod.POST)
    public ModelAndView forgot(ModelAndView mv) {
        mv.setViewName("forgot");
        return mv;
    }
}
