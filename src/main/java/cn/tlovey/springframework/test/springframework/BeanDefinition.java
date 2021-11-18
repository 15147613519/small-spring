package cn.tlovey.springframework.test.springframework;

/**
 * 用于定义Bean实例化信息，以一个Object进行存放
 */
public class BeanDefinition {

    private Object bean;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "BeanDefinition{" +
                "bean=" + bean +
                '}';
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
