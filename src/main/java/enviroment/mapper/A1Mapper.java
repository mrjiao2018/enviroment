package enviroment.mapper;

import enviroment.vo.A1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface A1Mapper {

    @Insert("inert into A1 values (#{A1},#{A2},#{A3},#{A4},#{A5},#{A6},#{A7},#{A8},#{A9},#{B1},#{B2},#{B3},#{B4}," +
            "#{B5},#{B6},#{B7},#{B8},#{B9},#{C1},#{C2},#{C3},#{C4},#{C5},#{C6},#{C7},#{C8},#{C9},#{D1},#{D2},#{type})")
    int insert(A1 a1);

    @Select("select * from A1 where type=#{type}")
    A1 select(String type);
}
