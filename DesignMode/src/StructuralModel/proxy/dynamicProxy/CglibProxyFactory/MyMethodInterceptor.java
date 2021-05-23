package StructuralModel.proxy.dynamicProxy.CglibProxyFactory;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author mashenglin
 */
public class MyMethodInterceptor implements MethodInterceptor {
    /**
     *
     * @param o 被拦截的对象
     * @param method 被拦截的方法
     * @param objects 方法入参
     * @param methodProxy 用于调用的初始方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前"+method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后"+method.getName());
        return object;
    }
}
