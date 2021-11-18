package cn.tlovey.springframework.test.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *代表Bean对象工厂，可以存放 Bean到 Map 中获取
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap =new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * Bean信息进行注册
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
