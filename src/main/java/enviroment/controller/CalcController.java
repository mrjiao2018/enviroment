package enviroment.controller;

import com.google.gson.Gson;
import enviroment.mapper.*;
import enviroment.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/calc")
@Controller
public class CalcController {

    @Autowired
    private Gson gson;

    @Autowired
    private A1Mapper a1Mapper;

    @Autowired
    private B1Mapper b1Mapper;

    @Autowired
    private B2Mapper b2Mapper;

    @Autowired
    private C1Mapper c1Mapper;

    @Autowired
    private D1Mapper d1Mapper;

    @Autowired
    private D2Mapper d2Mapper;

    @Autowired
    private E1Mapper e1Mapper;

    @Autowired
    private E2Mapper e2Mapper;

    @Autowired
    private F1Mapper f1Mapper;

    @Autowired
    private F2Mapper f2Mapper;

    public static String type;

    public void submit(String year,String position,String type){
        this.type=year+position+type;
    }

    @ResponseBody
    @RequestMapping("/A1")
    public String calcA1(A1 a1){
        a1.cale();
        a1.setType(type);
        a1Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/B1")
    public String calcB1(B1 b1){
        b1.cale();
        b1.setType(type);
        b1Mapper.insert(b1);
        return gson.toJson(b1);
    }

    @ResponseBody
    @RequestMapping("/B2")
    public String calcB2(B2 b2){
        b2.cale();
        b2.setType(type);
        b2Mapper.insert(b2);
        return gson.toJson(b2);
    }

    @ResponseBody
    @RequestMapping("/C1")
    public String calcC1(C1 a1){
        a1.cale();
        a1.setType(type);
        c1Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/D1")
    public String calcD1(D1 a1){
        a1.cale();
        a1.setType(type);
        d1Mapper.insert(a1);
        return gson.toJson(a1);
    }


    @ResponseBody
    @RequestMapping("/D2")
    public String calcD2(D2 a1){
        a1.cale();
        a1.setType(type);
        d2Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/E1")
    public String calcE1(E1 a1){
        a1.cale();
        a1.setType(type);
        e1Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/E2")
    public String calcE2(E2 a1){
        a1.cale();
        a1.setType(type);
        e2Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/F1")
    public String calcF1(F1 a1){
        a1.cale();
        a1.setType(type);
        f1Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/F2")
    public String calcF2(F2 a1){
        a1.cale();
        a1.setType(type);
        f2Mapper.insert(a1);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/G1")
    public String calcG1(A1 a1){
        a1.cale();
        a1.setType(type);
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
