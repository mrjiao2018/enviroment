package enviroment.mapper;

import enviroment.vo.J1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:58
 */
@Repository
public interface J1Mapper {
    @Select("select * from J1 where type=#{type}")
    J1 select(String type);

    @Insert("insert into J1 values (#{Ss},#{A},#{Us},#{type}) ON DUPLICATE KEY UPDATE " +
            "Ss=#{Ss},A=#{A},Us=#{Us}")
    int insert(J1 f2);

    @Update("update total set J1Us = #{J1Us} where type = #{type}")
    int update(@Param("J1Us") Double J1Us, @Param("type") String type);

}
