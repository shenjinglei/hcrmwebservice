package com.kyee.util;

/**
 * Created by zrc on 17/3/1.
 */
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 以静态变量保存Spring ApplicationContext, 可在任何代码任何地方任何时候中取出ApplicaitonContext.
 *
 */
@Service
public class SpringContextHolder implements ApplicationContextAware {
    private static ApplicationContext applicationContext ;
    /**
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     *
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;

    }
    /**
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    /**
     * 获取对象
     * 这里重写了bean方法，起主要作用
     * @param name
     * @return Object 一个以所给名字注册的bean的实例
     * @throws BeansException
     */
    public static Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }
    /**
     * 获取对象 ,根据类对象和名字
     *
     * @param name
     * @return Object 一个以所给名字注册的bean的实例
     * @throws BeansException
     */
    public static <T>T getBean(String beanName , Class<T>clazz) {
        return applicationContext.getBean(beanName , clazz);
    }
}
