package enviroment.controller;

import com.google.gson.Gson;
import enviroment.mapper.UserMapper;
import enviroment.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhong on 2018/7/12 16:15
 */
@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Gson gson;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        Map map=new HashMap();
        if (userMapper.select(user)==null){
            map.put("status",700);

        }else {
            map.put("status",600);
        }
        return gson.toJson(map);
    }
}
