package enviroment.mapper;

import enviroment.vo.C1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:41
 */
@Repository
public interface C1Mapper {
    @Insert("insert into C1 values (#{A1},#{A2},#{A3},#{A4},#{A5},#{A6},#{B1},#{B2},#{B3},#{B4}," +
            "#{B5},#{B6},#{C1},#{C2},#{C3},#{C4},#{C5},#{C6},#{D1},#{type}) ON DUPLICATE KEY UPDATE " +
            "A1=#{A1},A2=#{A2},A3=#{A3},A4=#{A4},A5=#{A5},A6=#{A6},B1=#{B1},B2=#{B2},B3=#{B3}" +
            ",B4=#{B4},B5=#{B5},B6=#{B6}," +
            "C1=#{C1},C2=#{C2},C3=#{C3},C4=#{C4},C5=#{C5},C6=#{C6},D1=#{D1}")
    int insert(C1 a1);

    @Select("select * from C1 where type=#{type}")
    C1 select(String type);

    @Update("update total set C1D1 = #{C1D1} where type = #{type}")
    int update(@Param("C1D1") Double C1D1, @Param("type") String type);
}
