package cn.tlovey.springframework.test;

import cn.tlovey.springframework.test.bean.UserService;
import cn.tlovey.springframework.test.springframework.BeanDefinition;
import cn.tlovey.springframework.test.springframework.BeanFactory;
import org.junit.Test;

public class ApiTest {

    @Test
    public  void test_BeanFactory(){
        //初始化BeanFactory
        BeanFactory beanFactory=new BeanFactory();
        //注册Bean
        BeanDefinition beanDefinition=new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
