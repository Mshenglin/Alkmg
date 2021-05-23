package CreativeMode.Single;

/**
 * 单例模式 饱汉模式/延时加载
 * @author
 */
public class SingletonTwo {
    /**
     *给该属性不分配空间
     */
    private  static  SingletonTwo singletonTwo;
    /**
     * 构造方法私有化
     */
    private  SingletonTwo(){}
    public  static  SingletonTwo getSingletonTwo()  {
        //延时加载
        if(singletonTwo==null){
            try {
                Thread.sleep(2000);
                singletonTwo=new SingletonTwo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return  singletonTwo;
    }
}
