package enviroment.mapper;

import enviroment.vo.H2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:57
 */
@Repository
public interface H2Mapper {
    @Select("select * from H2 where type=#{type}")
    H2 select(String type);

    @Insert("insert into H2 values (#{A},#{Ke},#{Qe},#{Kd},#{Qd},#{Kf},#{Qf},#{type},#{G},#{U}) ON DUPLICATE KEY UPDATE " +
            "A=#{A},Ke=#{Ke},Qe=#{Qe},Kd=#{Kd},Qd=#{Qd},Kf=#{Kf},Qf=#{Qf},G=#{G},U=#{U}")
    int insert(H2 f2);

    @Update("update total set H2Gz = #{H2Gz},H2Uz=#{H2Uz} where type = #{type}")
    int update(@Param("H2Gz") Double H2Gz, @Param("H2Uz") double H2Uz, @Param("type") String type);
}
