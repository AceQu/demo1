package com.qu.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanGetTest {
    @Test
    public void get1(){
        //1.加载spring配置文件
        Resource resource = new ClassPathResource("application-context.xml");
        //2.获取核心容器 BeanFactory
        BeanFactory beanFactory =new XmlBeanFactory(resource);
        //3.获取bean--第一种方式 通过bean的id获取bean，在 spring4开始以后，基本上bean的id和name是一个东西
        Object myBean= beanFactory.getBean("myBean");
        System.out.println(myBean);
        //如果想要调用hello方法，需要强转
        MyBean bean=(MyBean) myBean;
        bean.hello();
    }
    public void get2(){
        //1.加载spring配置文件
        Resource resource = new ClassPathResource("application-context.xml");
        //2.获取核心容器 BeanFactory
        BeanFactory beanFactory =new XmlBeanFactory(resource);
        //3.获取bean--第一种方式 通过bean的id获取bean，在 spring4开始以后，基本上bean的id和name是一个东西
        Object myBean= beanFactory.getBean("myBean");
        System.out.println(myBean);
        //如果想要调用hello方法，需要强转
        MyBean bean=(MyBean) myBean;
        bean.hello();
    }
    public void get3(){
        //1.加载spring配置文件
        Resource resource = new ClassPathResource("application-context.xml");
        //2.获取核心容器 BeanFactory
        BeanFactory beanFactory =new XmlBeanFactory(resource);
        //3.获取bean--第一种方式 通过bean的id获取bean，在 spring4开始以后，基本上bean的id和name是一个东西
        Object myBean= beanFactory.getBean("myBean");
        System.out.println(myBean);
        //如果想要调用hello方法，需要强转
        MyBean bean=(MyBean) myBean;
        bean.hello();
    }
}
