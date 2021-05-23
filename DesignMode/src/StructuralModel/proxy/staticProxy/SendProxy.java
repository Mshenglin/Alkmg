package StructuralModel.proxy.staticProxy;

/**
 * @author mashenglin
 */
public class SendProxy implements  SendService{
    private  final  SendService sendService;

    public SendProxy(SendService sendService) {
        this.sendService = sendService;
    }

    @Override
    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method send()");
        sendService.send(message);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method send()");
        return null;
    }
}
