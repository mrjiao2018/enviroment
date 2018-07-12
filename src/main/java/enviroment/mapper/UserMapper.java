package enviroment.mapper;

import enviroment.vo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * Created by zhong on 2018/7/12 16:24
 */
@Repository
public interface UserMapper {

    @Select("select * from user where username=#{username} and password = #{password}")
    User select(User user);
}
