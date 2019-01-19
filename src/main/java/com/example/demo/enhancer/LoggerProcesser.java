package com.example.demo.enhancer;

import com.example.demo.enhancer.annotation.EnableLogger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.annotation.Annotation;

public class LoggerProcesser implements BeanPostProcessor {

    private CgLibLoggerProxy cgLibLoggerProxy = new CgLibLoggerProxy();

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class clazz = bean.getClass();

        Annotation annotation = clazz.getAnnotation(EnableLogger.class);
        if(annotation == null){
            return bean;
        }
        return cgLibLoggerProxy.getProxy(clazz);
    }
}
