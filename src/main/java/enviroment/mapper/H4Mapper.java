package enviroment.mapper;

import enviroment.vo.H4;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:57
 */
@Repository
public interface H4Mapper {
    @Select("select * from H4 where type=#{type}")
    H4 select(String type);

    @Insert("insert into H4 values (#{Kz},#{Qz},#{A},#{type},#{Gz},#{Uz}) ON DUPLICATE KEY UPDATE " +
            "Kz=#{Kz},Qz=#{Qz},A=#{A},Gz=#{Gz},Uz=#{Uz}")
    int insert(H4 f2);

    @Update("update total set H4Gz = #{H4Gz},H4Uz=#{H4Uz} where type = #{type}")
    int update(@Param("H4Gz") Double H4Gz, @Param("H4Uz") double H4Uz, @Param("type") String type);
}
