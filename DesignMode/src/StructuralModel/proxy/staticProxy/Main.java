package StructuralModel.proxy.staticProxy;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
         SendServiceImpl sendService = new SendServiceImpl();
         SendProxy sendProxy = new SendProxy(sendService);
         sendProxy.send("hello");
    }
}
