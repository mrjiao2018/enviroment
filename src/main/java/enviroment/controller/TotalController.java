package enviroment.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import enviroment.mapper.TotalMappere;
import enviroment.vo.Total;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhong on 2018/7/16 19:44
 */
@Controller
public class TotalController {

    @Autowired
    private Gson gson;

    @Autowired
    private TotalMappere totalMappere;

    @ResponseBody
    @RequestMapping("")
    public String getTotals(){
        List<Total> totals=totalMappere.select();
        return gson.toJson(totals);
    }


}
