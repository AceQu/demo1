package com.qu.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanTest {
    @Test
    public void test01(){
        //第一步，加载spring的配置文件
        Resource resource=new ClassPathResource("application-context.xml");
        //第二步，获取spring的容器--因为我们要从spring容器中去获取MyBean的对象
        //spring的基础核心容器叫做 BeanFactory
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        //第三步，从spring容器中获取bean（bean就是容器中的一个对象）
        //从spring获取bean通常有三种方式
        Object myBean=beanFactory.getBean("myBean");
        System.out.println(myBean);
    }
}
