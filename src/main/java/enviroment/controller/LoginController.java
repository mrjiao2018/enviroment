package enviroment.controller;

import enviroment.mapper.UserMapper;
import enviroment.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhong on 2018/7/12 16:15
 */
@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public String login(User user){
        if (userMapper.select(user)==null){
            return "";
        }else {
            return "";
        }
    }
}
