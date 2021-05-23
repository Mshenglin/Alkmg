package CreativeMode.Single;

/**
 * 懒汉模式/延时加载
 * 使用 synchronized同步方法 实现线程安全
 * @author
 */
public class SingleonThree {
    private  static SingleonThree singleonThree;
    /**
     * 构造方法私有化
     */
    private SingleonThree(){}

    /**
     * synchronized方法
     * @return
     */
    synchronized   public  static  SingleonThree getSingletonTwo()  {
        //延时加载
        if(singleonThree==null){
            try {
                Thread.sleep(2000);
                singleonThree=new SingleonThree();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return  singleonThree;
    }
}
