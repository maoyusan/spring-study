package mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.util.List;


public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {



    @Override
    public List<User> selectUsers() {
        addUsers(new User(9,"8"));
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }

    @Override
    public void addUsers(User user) {
        getSqlSession().getMapper(UserMapper.class).addUsers(user);
    }


    @Override
    public void deleteUsers() {

    }

}
