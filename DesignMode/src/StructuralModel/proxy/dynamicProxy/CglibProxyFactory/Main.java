package StructuralModel.proxy.dynamicProxy.CglibProxyFactory;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        //获取代理对象
         SendService proxy = (SendService) CglibProxyFactory.getProxy(SendService.class);
         proxy.send("hello");
    }
}
