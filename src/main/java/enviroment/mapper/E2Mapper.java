package enviroment.mapper;

import enviroment.vo.E2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface E2Mapper {

    @Insert("insert into E2 values (#{A},#{X1},#{X2},#{C1},#{C2},#{C3},#{R1},#{R1},#{R3},#{M},#{P},#{K},#{N},#{type},#{Gf},#{Uf})")
    int insert(E2 e2);

    @Select("select * from E2 where type=#{type}")
    E2 select(String type);

    @Update("update total set E2Gf = #{E2Gf},E2Uf=#{E2Uf} where type = #{type}")
    int update(@Param("E2Gf") Double E2Gf, @Param("E2Uf") double E2Uf, @Param("type") String type);
}
