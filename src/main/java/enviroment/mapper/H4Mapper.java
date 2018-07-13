package enviroment.mapper;

import enviroment.vo.H4;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:57
 */
@Repository
public interface H4Mapper {
    @Select("select * from H4 where type=#{type}")
    H4 select(String type);

    @Insert("insert into H4 values (#{Kz},#{Qz},#{A},#{type},#{Gz},#{Uz})")
    int insert(H4 f2);
}
