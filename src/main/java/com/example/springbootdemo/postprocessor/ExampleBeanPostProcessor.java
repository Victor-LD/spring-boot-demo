package com.example.springbootdemo.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ExampleBeanPostProcessor implements BeanPostProcessor {

    public ExampleBeanPostProcessor() {
//        System.out.println("Example BeanPostProcessor created!");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
//        System.out.println("Before init: ");
//        System.out.println("Bean class: " + bean.getClass());
//        System.out.println("Bean name: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
//        System.out.println("After init: ");
//        System.out.println("Bean class: " + bean.getClass());
//        System.out.println("Bean name: " + beanName);
        return bean;
    }
}
