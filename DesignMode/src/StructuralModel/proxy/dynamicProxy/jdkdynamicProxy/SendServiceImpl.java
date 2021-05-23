package StructuralModel.proxy.dynamicProxy.jdkdynamicProxy;

/**
 * @author mashenglin
 */
public class SendServiceImpl implements SendService{
    @Override
    public String send(String message) {
        System.out.println("send message"+message);
        return message;
    }
}
