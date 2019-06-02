package project.service;

import project.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.repository.UserDAO;

import javax.inject.Inject;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    //회원가입
    public void Register(UserVO userVO){
        userDAO.registerUser(userVO);
    }

    //로그인
    public UserVO LogIn(UserVO userVO){
        UserVO returnUser;
        returnUser = userDAO.LogIn(userVO);
        return returnUser;
    }

    //    //이메일 입력해서 찾기
//    public UserVO selectUser(){
//        return user.selectUser(email);
//    }

}
