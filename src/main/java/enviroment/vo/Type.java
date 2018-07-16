package enviroment.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhong on 2018/7/13 18:57
 */
public class Type {
    private String year;
    private String position;
    private String type;
    private String inputDate;

    public Type(String year, String position, String type) {
        this.year = year;
        this.position = position;
        this.type = type;
    }

    public Type() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        inputDate=df.format(new Date());
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return year+position+type+inputDate;
    }
}
