package enviroment.mapper;

import enviroment.vo.A1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface A1Mapper {

    @Insert("insert into A1 values (#{A1},#{A2},#{A3},#{A4},#{A5},#{A6},#{A7},#{A8},#{B1},#{B2},#{B3},#{B4}," +
            "#{B5},#{B6},#{B7},#{B8},#{C1},#{C2},#{C3},#{C4},#{C5},#{C6},#{C7},#{C8},#{D1},#{D2},#{type}) ON DUPLICATE KEY UPDATE " +
            "A1=#{A1},A2=#{A2},A3=#{A3},A4=#{A4},A5=#{A5},A6=#{A6},A7=#{A7},A8=#{A8},B1=#{B1},B2=#{B2},B3=#{B3}" +
            ",B4=#{B4},B5=#{B5},B6=#{B6},B7=#{B7},B8=#{B8}," +
            "C1=#{C1},C2=#{C2},C3=#{C3},C4=#{C4},C5=#{C5},C6=#{C6},C7=#{C7},C8=#{C8},D1=#{D1},D2=#{D2}")
    int insert(A1 a1);

    @Select("select * from A1 where type=#{type}")
    A1 select(String type);


    @Update("update total set A1D1 = #{A1D1} where type = #{type}")
    int update(@Param("A1D1") Double A1D1,@Param("type") String type);
}
