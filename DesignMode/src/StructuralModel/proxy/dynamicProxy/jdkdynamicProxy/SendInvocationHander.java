package StructuralModel.proxy.dynamicProxy.jdkdynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author mashenglin
 */
public class SendInvocationHander implements InvocationHandler {
    /**
     * 创建自己所要代理的对象
     */
    private  final Object target;

    public SendInvocationHander(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 动态生成的代理类
     * @param method 与代理对象调用的方法相对应
     * @param args 当前方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用方法之前，可以添加自己的操作
        System.out.println("调用方法之前"+method.getName());
         Object invoke = method.invoke(target, args);
         //调用方法之后，添加操作
        System.out.println("调用方法之后"+method.getName());
        return invoke;
    }
}
