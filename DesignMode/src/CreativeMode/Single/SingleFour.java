package CreativeMode.Single;

/**
 *  懒汉模式/延时加载
 *   使用 synchronized同步代码块 实现线程安全
 * @author
 */
  public class SingleFour {
        private  static SingleFour singleFour;
        /**
         * 构造方法私有化
         */
        private SingleFour(){}

        /**
         * synchronized方法
         * @return
         */
          public  static SingleFour getSingleFour()  {
              synchronized(SingleFour.class){
                  //延时加载
                  if(singleFour==null){
                      try {
                          Thread.sleep(2000);
                          singleFour=new SingleFour();
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
              }
            }
            return  singleFour;
        }
    }
