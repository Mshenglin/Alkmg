import java.util.HashMap;

/**
 * @author mashenglin
 */
public class leetcode146_LRU {
        HashMap<Integer,Node> map;
        DoubleLinkedList cache;
        int cap;

    /**
     * 构造方法
     */
    public leetcode146_LRU(int cap){
        map=new HashMap<>();
        cache=new DoubleLinkedList();
        this.cap=cap;
    }

    /**
     * 封装一些用于操作Map和cache的方法
     */
    /**
     * 将某个key设置为最近使用的元素
     */
    public void makeRecently(int key){
        //在map中取到Key所对应的节点
        Node node=map.get(key);
        //在链表中删除改节点，并将该节点加入链表的尾部
        cache.remove(node);
        cache.addLast(node);
    }

    /**
     * 添加一个最近使用的元素
     */
    public void addRecently(int key,int value){
        //构建节点
        Node x=new Node(key,value);
        //将他加入链表的尾部
        cache.addLast(x);
        //同时加入哈希表中
        map.put(key, x);
    }

    /**
     * 删除一个某个key元素的节点
     */
    public void deleteKey(int key){
        //在哈希表中和获取到该节点
        Node node=map.get(key);
        //在链表中删除该节点
        cache.remove(node);
        //哈希表中删除该元素
        map.remove(key);
    }

    /**
     *删除最久没有使用的元素
     */
    public void removeLastRecently(){
        //删除链表表头的元素
        Node frist=cache.removeFirst();
        //同时删除map中的元素
        map.remove(frist.key);
    }

    /**
     *
     * @param key
     * @return value
     */
    public int get(int key){
        //判断该元素在map中是否存在
        if(!map.containsKey(key)){
            return -1;
        }
        //如果存在的情况下，就将该节点提升为最近使用
        makeRecently(key);
        return map.get(key).value;
    }
    public  void put(int key, int value) {
        //当前存入的元素在链表中存在
        if(map.containsKey(key)){
            deleteKey(key);
            //添加一该元素为最近使用
            addRecently(key, value);
            return;
        }
        //当前存入的元素在链表中不存在
        //判断容量是否充足
        if(cap==cache.size()){
            //移除最久未使用的元素
            removeLastRecently();
        }
        //加入该元素到最近使用
        addRecently(key, value);
    }
    class Node{
            //节点包含的字段
            int key,value;
            //节点的两个指针
            Node prev,next;
            //构造函数
            public Node(int key,int value){
                this.key=key;
                this.value=value;
            }
        }
    /**
     *双向链表
      */
    class DoubleLinkedList{
            Node head;
            Node tail;
            int size;
            //构造方法
           public DoubleLinkedList(){
               //初始化双向链表的数据
               head=new Node(0,0);
               tail=new Node(0,0);
               head.next=tail;
               tail.prev=head;
               size=0;
           }
           //操作链表的方法
           //添加一个节点在尾部
           public  void addLast(Node node){
               node.prev=tail.prev;
               node.next=tail;
               tail.prev.next=node;
               tail.prev=node;
               size++;
           }
           //移除链表中的某个节点
        public void remove(Node node){
               node.prev.next=node.next;
               node.next.prev=node.prev;
               size--;
        }
        //删除链表的表头元素
        public Node removeFirst(){
               if(head.next==tail){
                   //链表中没有元素
                   return null;
               }
               Node frist=head.next;
               remove(head.next);
               return frist;
        }
        public  int size(){
               return size;
        }
       }

    public static void main(String[] args) {
        leetcode146_LRU lRUCache = new leetcode146_LRU(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));   // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));  // 返回 -1 (未找到)
        System.out.println(lRUCache.get(3));  // 返回 3
        System.out.println(lRUCache.get(4));    // 返回 4

    }
}
