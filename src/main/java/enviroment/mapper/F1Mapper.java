package enviroment.mapper;

import enviroment.vo.F1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface F1Mapper {

    @Insert("insert into F1 values (#{A},#{Ct},#{Rt},#{Bn},#{Ft},#{type},#{Gt},#{Ut})")
    int insert(F1 f1);

    @Select("select * from F1 where type=#{type}")
    F1 select(String type);
}
