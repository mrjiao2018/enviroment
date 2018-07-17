package enviroment.mapper;

import enviroment.vo.H3;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:57
 */
@Repository
public interface H3Mapper {
    @Select("select * from H3 where type=#{type}")
    H3 select(String type);

    @Insert("insert into H3 values (#{Qf},#{type},#{Kz},#{Uz})")
    int insert(H3 f2);

    @Update("update total set H3Gz = #{H3Gz},H3Uz=#{H3Uz} where type = #{type}")
    int update(@Param("H3Gz") Double H3Gz, @Param("H3Uz") double H3Uz, @Param("type") String type);
}
