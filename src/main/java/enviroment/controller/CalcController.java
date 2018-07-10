package enviroment.controller;

import com.google.gson.Gson;
import enviroment.vo.A1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/calc")
@Controller
public class CalcController {

    @Autowired
    private Gson gson;

    @ResponseBody
    @RequestMapping("/A1")
    public String calcA1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }



}
