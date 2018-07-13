package enviroment.mapper;

import enviroment.vo.K1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:59
 */
@Repository
public interface K1Mapper {
    @Select("select * from K1 where type=#{type}")
    K1 select(String type);

    @Insert("insert into K1 values (#{A},#{Uz},#{type},#{Us})")
    int insert(K1 f2);
}
