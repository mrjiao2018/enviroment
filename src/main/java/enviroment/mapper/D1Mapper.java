package enviroment.mapper;

import enviroment.vo.D1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface D1Mapper {
    @Insert("insert into D1 values (#{A},#{P},#{E},#{C},#{Ck},#{type},#{Gt},#{Ut}) ON DUPLICATE KEY UPDATE " +
            "A=#{A},P=#{P},E=#{E},C=#{C},Ck=#{Ck},Gt=#{Gt},Ut=#{Ut}")
    int insert(D1 d1);

    @Select("select * from D1 where type=#{type}")
    D1 select(String type);

    @Update("update total set D1Gt = #{D1Gt},D1Ut=#{D1Ut} where type = #{type}")
    int update(@Param("D1Gt") Double D1Gt, @Param("D1Ut") double D1Ut, @Param("type") String type);
}
