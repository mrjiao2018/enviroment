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

    @ResponseBody
    @RequestMapping("/B1")
    public String calcB1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/B2")
    public String calcB2(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/C1")
    public String calcC1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/D1")
    public String calcD1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }


    @ResponseBody
    @RequestMapping("/D2")
    public String calcD2(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/E1")
    public String calcE1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/B2")
    public String calcE21(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/B2")
    public String calcE22(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/F1")
    public String calcF1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/F2")
    public String calcF2(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/G1")
    public String calcG1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H1")
    public String calcH1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H2")
    public String calcH2(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H3")
    public String calcH3(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H4")
    public String calcH4(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/I1")
    public String calcI1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/J1")
    public String calcJ1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/K1")
    public String calcK1(A1 a1){
        a1.cale();
        return gson.toJson(a1);
    }
}
