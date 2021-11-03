import mapper.UserMapper;
import mapper.UserMapperImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper bean = context.getBean(UserMapper.class);
          bean.selectUsers();

    }
}
