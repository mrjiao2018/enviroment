package enviroment.mapper;

import enviroment.vo.D1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface D1Mapper {
    @Insert("insert into D1 values (#{A},#{P},#{E},#{C},#{Ck},#{type},#{Gt},#{Ut})")
    int insert(D1 d1);

    @Select("select * from D1 where type=#{type}")
    D1 select(String type);
}
