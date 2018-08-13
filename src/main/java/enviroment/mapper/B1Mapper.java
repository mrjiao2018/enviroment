package enviroment.mapper;

import enviroment.vo.B1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:40
 */
@Repository
public interface B1Mapper {

    @Insert("insert into B1 values (#{M},#{f},#{Am},#{Le},#{type}) ON DUPLICATE KEY UPDATE " +
            "M=#{M},f=#{f},Am=#{Am},Le=#{Le}")
    int insert(B1 b1);

    @Select("select * from B1 where type = #{type}")
    B1 select(String type);

    @Update("update total set B1M = #{B1M},B1Le=#{B1Le} where type = #{type}")
    int update(@Param("B1M") Double B1M, @Param("B1Le") double B1Le,@Param("type") String type);
}
