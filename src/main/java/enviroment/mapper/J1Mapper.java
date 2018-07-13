package enviroment.mapper;

import enviroment.vo.J1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:58
 */
@Repository
public interface J1Mapper {
    @Select("select * from J1 where type=#{type}")
    J1 select(String type);

    @Insert("insert into J1 values (#{Ss},#{A},#{Us},#{type})")
    int insert(J1 f2);

}
