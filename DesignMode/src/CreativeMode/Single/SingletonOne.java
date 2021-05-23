package CreativeMode.Single;

/**
 * 单例模式，立即加载/饿汉模式
 * 未被同步，出现线程不安全的情况
 * @author mashenglin
 */
public class SingletonOne {
    /**
     * 在类初始化的时候，该变量已经被创建
     */
    private  static  SingletonOne singletonOne=new SingletonOne();

    /**
     * 构造方法私有化
     */
    private SingletonOne(){

    }

    /**
     * 向外界提供获取该类实例对象的方法
     * @return
     */
    public static SingletonOne getInstance(){
        return singletonOne;
    }
}
