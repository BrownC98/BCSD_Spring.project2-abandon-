package controller;

import domain.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.font.TrueTypeFont;

@Controller
public class LoginController {
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

        //디비에 없는 이메일인지 체크 || 입력한 아이디에 매치하지 않는 비번인지 체크
        //테스트용임 추후 db 연동 ㄱㄱ
        if (user.getUserEmail().equals("root") && user.getUserPassword().equals("1111")) {
            //게시판 홈으로 이동 model and view 활용
            mv.addObject("loginInfo", user);
            mv.setViewName("index");
            return mv;
       } else  {
            String msg = "아이디 또는 비밀번호를 다시 확인하세요.<br/>" +
                    "등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.";
            mv.addObject("warning", msg);
            mv.setViewName("login");
            return mv;
        }

        //객체 보내기 view에선 EL표기법으로 받음
        //model.addAttribute("loginInfo", user);
        //return "loginTest";


    }


    @RequestMapping(value = "/forgot")
    public ModelAndView forgot(ModelAndView mv) {
        mv.setViewName("forgot");
        return mv;
    }
}
