package enviroment.mapper;

import enviroment.vo.H1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:56
 */
@Repository
public interface H1Mapper {
    @Select("select * from H1 where type=#{type}")
    H1 select(String type);

    @Insert("insert into H1 values (#{A},#{H},#{Kf},#{Qf},#{L},#{type},#{Gf},#{Uf})")
    int insert(H1 f2);
}
