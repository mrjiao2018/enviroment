package enviroment.mapper;

import enviroment.vo.C1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:41
 */
@Repository
public interface C1Mapper {
    @Insert("inert into C1 values (#{A1},#{A2},#{A3},#{A4},#{A5},#{A6},#{B1},#{B2},#{B3},#{B4}," +
            "#{B5},#{B6},#{C1},#{C2},#{C3},#{C4},#{C5},#{C6},#{D1},#{D2},#{type})")
    int insert(C1 a1);

    @Select("select * from C1 where type=#{type}")
    C1 select(String type);
}
