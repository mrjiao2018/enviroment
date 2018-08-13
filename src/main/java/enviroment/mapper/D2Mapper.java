package enviroment.mapper;

import enviroment.vo.D2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface D2Mapper {

    @Insert("insert into D2 values (#{A},#{P},#{E},#{C},#{Ck},#{type},#{Gt},#{Us}) ON DUPLICATE KEY UPDATE " +
            "A=#{A},P=#{P},E=#{E},C=#{C},Ck=#{Ck},Gt=#{Gt},Us=#{Us}")
    int insert(D2 d2);

    @Select("select * from D2 where type=#{type}")
    D2 select(String type);

    @Update("update total set D2Gt = #{D2Gt},D2Us=#{D2Us} where type = #{type}")
    int update(@Param("D2Gt") Double D1Gt, @Param("D2Us") double D1Ut, @Param("type") String type);
}
