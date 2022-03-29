public class Node {                             //创建一个Node类
    Object element;                             //成员变量
    Node next;                                  //成员变量
    public Node(Node nextval){next=nextval;}    //参数为nextval的构造方法
    public Node(Object obj,Node nextval){       //参数为obj和nextval的构造方法
        element=obj;
        next=nextval;
    }
}
