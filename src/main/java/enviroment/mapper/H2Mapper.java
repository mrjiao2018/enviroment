package enviroment.mapper;

import enviroment.vo.H2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:57
 */
@Repository
public interface H2Mapper {
    @Select("select * from H2 where type=#{type}")
    H2 select(String type);

    @Insert("insert into H2 values (#{A},#{Ke},#{Qe},#{Kd},#{Qd},#{Kf},#{Qf},#{type},#{G},#{U})")
    int insert(H2 f2);
}
