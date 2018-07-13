package enviroment.mapper;

import enviroment.vo.G1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:56
 */
@Repository
public interface G1Mapper {
    @Select("select * from G1 where type=#{type}")
    G1 select(String type);

    @Insert("insert into G1 values (#{A},#{B},#{C1},#{C2},#{R1},#{R2},#{R3},#{P},#{K},#{N},#{type},#{Gp},#{Up}#{Gn},#{Un}#{Gk},#{Uk})")
    int insert(G1 g1);
}
