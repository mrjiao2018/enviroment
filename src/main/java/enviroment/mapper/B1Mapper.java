package enviroment.mapper;

import enviroment.vo.B1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:40
 */
@Repository
public interface B1Mapper {

    @Insert("insert into B1 values (#{M},#{f},#{Am},#{Le},#{type})")
    int insert(B1 b1);

    @Select("select * from B1 where type = #{type}")
    B1 select(String type);
}
