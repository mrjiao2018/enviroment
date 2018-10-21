package enviroment.mapper;

import enviroment.vo.Type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhong on 2018/7/13 18:55
 */
public interface TypeMapper {

    @Insert("insert into type values (#{year},#{position},#{type},#{inputDate})")
    int insert(Type type);

    @Select("select * from type where year=#{year} and position = #{position} and type=#{type}")
    Type select(Type type);

    @Select("select * from type where year != '9999'")
    List<Type> selectAll();
}
