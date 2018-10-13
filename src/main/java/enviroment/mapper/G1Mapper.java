package enviroment.mapper;

import enviroment.vo.G1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by zhong on 2018/7/13 16:56
 */
@Repository
public interface G1Mapper {
    @Select("select * from G1 where type=#{type}")
    G1 select(String type);

    @Insert("insert into G1 values (#{A},#{B},#{C1},#{C2},#{R1},#{R2},#{R3},#{P},#{K},#{N},#{Gp},#{Up}#{Gn},#{Un},#{Gk},#{Uk},{Uz},#{type})" +
            " ON DUPLICATE KEY UPDATE " +
            "A=#{A},B=#{B},C1=#{C1},C2=#{C2},R1=#{R1},R2=#{R2},R3=#{R3},P=#{P},K=#{K},N=#{N},Gp=#{Gp},Up=#{Up},Gn=#{Gn},Un=#{Un},Gk=#{Gk},Uk=#{Uk},Uz=#{Uz}")
    int insert(G1 g1);

    @Update("update total set G1GK = #{G1GK},G1GN=#{G1GN},G1GP = #{G1GP},G1UN=#{G1UN},G1UK = #{G1UK},G1UP=#{G1UP} where type = #{type}")
    int update(@Param("G1GK") Double G1GK, @Param("G1GN") double G1GN,
               @Param("G1GP") Double G1GP, @Param("G1UK") double G1UK,
               @Param("G1UN") Double G1UN, @Param("G1UP") double G1UP,
               @Param("type") String type);
}
