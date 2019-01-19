package com.example.demo.enhancer;

import com.example.demo.enhancer.annotation.LogBeforeExec;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CgLibLoggerProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    // 其他地方如果注入的是代理对象，调用代理对象的方法时，以下拦截方法每次都会执行。
    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {

        LogBeforeExec logBeforeExec = method.getAnnotation(LogBeforeExec.class);
        if(logBeforeExec != null){
            System.out.println(String.format("%s - [%s]",logBeforeExec.value(), Arrays.toString(objects)));
        }
        return methodProxy.invokeSuper(o,objects);
    }
}
