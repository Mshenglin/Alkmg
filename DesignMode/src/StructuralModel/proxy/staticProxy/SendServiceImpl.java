package StructuralModel.proxy.staticProxy;

/**
 * @author mashenglin
 */
public class SendServiceImpl implements SendService {
    @Override
    public String send(String message) {
        System.out.println("send"+message);
        return message;
    }
}
