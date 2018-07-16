package enviroment.mapper;

import enviroment.vo.Total;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhong on 2018/7/16 19:39
 */
public interface TotalMappere {
    @Insert("insert into total (type) values (#{type})")
    int insert(String type);

    @Select("select * from total")
    List<Total> select();
}
