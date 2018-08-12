package enviroment.mapper;

import enviroment.vo.E1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/12 15:42
 */
@Repository
public interface E1Mapper {

    @Insert("insert into E1 values (#{A},#{X1},#{X2},#{Ct},#{P},#{type},#{Gt},#{Ut})")
    int insert(E1 e1);

    @Select("select * from E1 where type=#{type}")
    E1 select(String type);

    @Update("update total set E1Gt = #{E1Gt},E1Ut=#{E1Ut} where type = #{type}")
    int update(@Param("E1Gt") Double E1Gt, @Param("E1Ut") double E1Ut, @Param("type") String type);
}
