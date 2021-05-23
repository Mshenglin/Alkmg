package StructuralModel.proxy.dynamicProxy.jdkdynamicProxy;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        SendService sendService=new SendServiceImpl();
        SendService proxy = (SendService) JdkProxyFactory.getProxy(sendService);
        proxy.send("hello");
    }
}
