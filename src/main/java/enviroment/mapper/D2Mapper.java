package enviroment.mapper;

import enviroment.vo.D2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface D2Mapper {

    @Insert("insert into D2 values (#{A},#{P},#{E},#{C},#{K},#{type},#{Gt},#{Us})")
    int insert(D2 d2);

    @Select("select * from D2 where type=#{type}")
    D2 select(String type);
}
