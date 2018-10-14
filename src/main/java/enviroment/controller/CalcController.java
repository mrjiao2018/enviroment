package enviroment.controller;

import com.google.gson.Gson;
import enviroment.mapper.*;
import enviroment.vo.*;
import enviroment.vo.mpl.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private G1Mapper g1Mapper;

    @Autowired
    private H1Mapper h1Mapper;

    @Autowired
    private H2Mapper h2Mapper;

    @Autowired
    private H3Mapper h3Mapper;

    @Autowired
    private H4Mapper h4Mapper;

    @Autowired
    private I1Mapper i1Mapper;

    @Autowired
    private J1Mapper j1Mapper;

    @Autowired
    private K1Mapper k1Mapper;

    @Autowired
    private TypeMapper typeMapper;
    @Autowired
    private TotalMappere totalMappere;
    public static String type;
    
    @ResponseBody
    @RequestMapping("/type")
    public String submit(Type type){
        this.type=type.toString();
        System.out.println(this.type);
        if (typeMapper.select(type)==null){
            totalMappere.insert(type.toString());
            typeMapper.insert(type);
        }
        return this.type;
    }

    @ResponseBody
    @RequestMapping("/A1")
    public String calcA1(A1 a1){
        a1.cale();
        a1.setType(type);
        a1Mapper.insert(a1);
        a1Mapper.update(a1.getD1(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/B1")
    public String calcB1(B1 b1){
        b1.cale();
        b1.setType(type);
        b1Mapper.insert(b1);
        b1Mapper.update(b1.getM(),b1.getLe(),type);
        return gson.toJson(b1);
    }

    @ResponseBody
    @RequestMapping("/B2")
    public String calcB2(B2 b2){
        b2.cale();
        b2.setType(type);
        b2Mapper.insert(b2);
        b2Mapper.update(b2.getA(),b2.getC(),type);
        return gson.toJson(b2);
    }

    @ResponseBody
    @RequestMapping("/C1")
    public String calcC1(C1 a1){
        a1.cale();
        a1.setType(type);
        c1Mapper.insert(a1);
        c1Mapper.update(a1.getD1(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/D1")
    public String calcD1(D1 a1){
        a1.cale();
        a1.setType(type);
        d1Mapper.insert(a1);
        d1Mapper.update(a1.getGt(),a1.getUt(),type);
        return gson.toJson(a1);
    }


    @ResponseBody
    @RequestMapping("/D2")
    public String calcD2(D2 a1){
        a1.cale();
        a1.setType(type);
        d2Mapper.insert(a1);
        d2Mapper.update(a1.getGt(),a1.getUs(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/E1")
    public String calcE1(E1 a1){
        a1.cale();
        a1.setType(type);
        e1Mapper.insert(a1);
        e1Mapper.update(a1.getGt(),a1.getUt(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/E2")
    public String calcE2(E2 a1){
        a1.cale();
        a1.setType(type);
        e2Mapper.insert(a1);
        e2Mapper.update(a1.getGf(),a1.getUf(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/F1")
    public String calcF1(F1 a1){
        a1.cale();
        a1.setType(type);
        f1Mapper.insert(a1);
        f1Mapper.update(a1.getGt(),a1.getUt(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/F2")
    public String calcF2(F2 a1){
        a1.cale();
        a1.setType(type);
        f2Mapper.insert(a1);
        f2Mapper.update(a1.getGy(),a1.getUy(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/G1")
    public String calcG1(G1 a1){
        a1.cale();
        a1.setType(type);
        g1Mapper.insert(a1);
        g1Mapper.update(a1.getGk(),a1.getGn(),a1.getGp(),a1.getUk(),a1.getUn(),a1.getUp(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H1")
    public String calcH1(H1 a1){
        a1.cale();
        a1.setType(type);
        h1Mapper.insert(a1);
        h1Mapper.update(a1.getGf(),a1.getUf(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H2")
    public String calcH2(H2 a1){
        a1.cale();
        a1.setType(type);
        h2Mapper.insert(a1);
        h2Mapper.update(a1.getGz(),a1.getUz(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H3")
    public String calcH3(H3 a1){
        a1.cale();
        a1.setType(type);
        h3Mapper.insert(a1);
        h3Mapper.update(a1.getAz(),a1.getUz(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/H4")
    public String calcH4(H4 a1){
        a1.cale();
        a1.setType(type);
        h4Mapper.insert(a1);
        h4Mapper.update(a1.getGz(),a1.getUz(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/I1")
    public String calcI1(I1 a1){
        a1.cale();
        a1.setType(type);
        i1Mapper.insert(a1);
        i1Mapper.update(a1.getUf(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/J1")
    public String calcJ1(J1 a1){
        a1.cale();
        a1.setType(type);
        j1Mapper.insert(a1);
        j1Mapper.update(a1.getUs(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/K1")
    public String calcK1(K1 a1){
        a1.cale();
        a1.setType(type);
        k1Mapper.insert(a1);
        k1Mapper.update(a1.getUs(),type);
        return gson.toJson(a1);
    }

    @ResponseBody
    @RequestMapping("/total")
    public String getTotal(Type type){
        this.type=type.toString();
        List<Calc> calcs=new ArrayList<>();
        String tableType=this.type;
        calcs.add( a1Mapper.select(tableType));
        calcs.add( b1Mapper.select(tableType));
        calcs.add( b2Mapper.select(tableType));
        calcs.add( c1Mapper.select(tableType));
        calcs.add( d1Mapper.select(tableType));
        calcs.add( d2Mapper.select(tableType));
        calcs.add( e1Mapper.select(tableType));
        calcs.add( e2Mapper.select(tableType));
        calcs.add( f1Mapper.select(tableType));
        calcs.add( f2Mapper.select(tableType));
        calcs.add( g1Mapper.select(tableType));
        calcs.add( h1Mapper.select(tableType));
        calcs.add( h2Mapper.select(tableType));
        calcs.add( h3Mapper.select(tableType));
        calcs.add( h4Mapper.select(tableType));
        calcs.add( i1Mapper.select(tableType));
        calcs.add( j1Mapper.select(tableType));
        calcs.add( k1Mapper.select(tableType));

        return gson.toJson(calcs);
//        return gson.toJson(new A1());
    }
}
