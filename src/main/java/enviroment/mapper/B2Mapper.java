package enviroment.mapper;

import enviroment.vo.B2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:41
 */
@Repository
public interface B2Mapper {

    @Insert({"insert into B2 values (#{A},#{B},#{C},#{type})"})
    int insert(B2 b2);

    @Select("select * from B2 where type=#{type}")
    B2 select(String type);
}
