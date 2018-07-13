package enviroment.mapper;

import enviroment.vo.I1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:58
 */
@Repository
public interface I1Mapper {
    @Select("select * from I1 where type=#{type}")
    I1 select(String type);

    @Insert("insert into I1 values (#{A},#{B},#{Uz},#{type},#{Uf})")
    int insert(I1 f2);
}
