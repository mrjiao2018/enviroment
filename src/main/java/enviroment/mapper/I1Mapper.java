package enviroment.mapper;

import enviroment.vo.I1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:58
 */
@Repository
public interface I1Mapper {
    @Select("select * from I1 where type=#{type}")
    I1 select(String type);

    @Insert("insert into I1 values (#{A},#{B},#{Uz},#{Uf},#{type}) ON DUPLICATE KEY UPDATE " +
            "A=#{A},B=#{B},Uz=#{Uz},Uf=#{Uf}")
    int insert(I1 f2);

    @Update("update total set I1Uf = #{I1Uf} where type = #{type}")
    int update(@Param("I1Uf") Double I1Uf, @Param("type") String type);
}
