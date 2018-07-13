package enviroment.mapper;

import enviroment.vo.H3;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:57
 */
@Repository
public interface H3Mapper {
    @Select("select * from H3 where type=#{type}")
    H3 select(String type);

    @Insert("insert into H3 values (#{Qf},#{type},#{Kz},#{Uz})")
    int insert(H3 f2);
}
