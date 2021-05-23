package CreativeMode.Single;

/**
 * 双重检验锁线程安全的单例设计
 * @author mashenglin
 */
public class SafeDoubleCheckedLocking {
    private volatile static SafeDoubleCheckedLocking instance=null;
    public static SafeDoubleCheckedLocking getSafeDoubleCheckedLocking(){
        if (instance == null) {
            synchronized (SafeDoubleCheckedLocking.class){
                if (instance == null) {
                    instance=new SafeDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
