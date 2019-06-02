package project.repository;

import org.apache.ibatis.session.SqlSession;
import project.domain.UserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.inject.Named;

@Repository
public class UserDAO{

    @Autowired
    private SqlSessionTemplate sqlSession;
    private static final String NAMESAPCE = "mapper.userMapper";

    //회원가입
    public void registerUser(UserVO user){
        sqlSession.insert(NAMESAPCE+".registerUser", user);
    }

    //로그인
    public UserVO LogIn(UserVO user) {
        UserVO result;
        result = sqlSession.selectOne(NAMESAPCE+".LogIn", user);
        return result;
    }
//    //회원 이메일로 비번찾기
//    UserVO selectUser(String userEmail){
//        return
//    }
}