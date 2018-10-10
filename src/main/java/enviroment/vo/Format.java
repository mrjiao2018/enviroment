package enviroment.vo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Format {

    public static void set2Point(Object object){
        Field[] fields = object.getClass().getDeclaredFields();
        for (int i=0;i<fields.length;i++){
            fields[i].setAccessible(true);
            if (fields[i].getGenericType()==double.class){
                    try {
                        double value=fields[i].getDouble(object);
                        BigDecimal bd = new BigDecimal(value);
                        value= bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
                        fields[i].setDouble(object,value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
