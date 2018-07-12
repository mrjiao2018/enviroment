package enviroment.mapper;

import enviroment.vo.F2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface F2Mapper {

    @Insert("insert into F2 values (#{A},#{Bn},#{Cy},#{type},#{Gy},#{Uy})")
    int insert(F2 f2);

    @Select("select * from F2 where type=#{type}")
    F2 select(String type);
}
