import config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean( User.class);
        System.out.println(user.getName());

        /*不适用@Configuration依旧能够完成对象的实例化，简单的情况下可能没问题*/
        /*这样的话，对于User来说，他被实例化了两次，单例被打破了，对于Person来说，他所依赖的User不是由Spring创建的*/
        ApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfig.class);
        User bean = context1.getBean("user",User.class);
        System.out.println(bean);
        System.out.println(user == bean);

        

    }


}
