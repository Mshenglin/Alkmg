package StructuralModel.proxy.dynamicProxy.CglibProxyFactory;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author mashenglin
 */
public class CglibProxyFactory {
    public  static  Object getProxy(Class<?> c){
        //创建动态代理增强类
        Enhancer enhancer=new Enhancer();
        //设置类加载器
        enhancer.setClassLoader(c.getClassLoader());
        //设置被代理类
        enhancer.setSuperclass(c);
        //设置方法的拦截器
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer;
    }
}
