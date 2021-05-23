package StructuralModel.proxy.dynamicProxy.CglibProxyFactory;


/**
 * @author mashenglin
 */
public class SendService {
    public String send(String message){
        System.out.println("send message"+message);
        return message;
    }
}
