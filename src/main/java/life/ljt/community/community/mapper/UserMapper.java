package life.ljt.community.community.mapper;

import life.ljt.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    @Insert("insert  into  USER(NAME ,ACCOUNT_ID,TOKEN,GMT_CREATE,GMT_MODIFIED) values (#{name},#{accountId},#{token} ,#{gmtCreate} ,#{gmtModified}  )")
    void addUser(User user);

    @Select("select * from USER where TOKEN=#{token} ")
    User findByToken(@Param("token") String token);
}
