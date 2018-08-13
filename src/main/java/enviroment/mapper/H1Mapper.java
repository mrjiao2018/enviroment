package enviroment.mapper;

import enviroment.vo.H1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:56
 */
@Repository
public interface H1Mapper {
    @Select("select * from H1 where type=#{type}")
    H1 select(String type);

    @Insert("insert into H1 values (#{A},#{H},#{Kf},#{Qf},#{L},#{type},#{Gf},#{Uf}) ON DUPLICATE KEY UPDATE " +
            "A=#{A},H=#{H},Kf=#{Kf},Qf=#{Qf},L=#{L},Gf=#{Gf},Uf=#{Uf}")
    int insert(H1 f2);

    @Update("update total set H1Gf = #{H1Gf},H1Uf=#{H1Uf} where type = #{type}")
    int update(@Param("H1Gf") Double H1Gf, @Param("H1Uf") double H1Uf, @Param("type") String type);
}
