import java.util.List;
public interface List_interface {                   //定义一个List_interface接口
    Object value(int pos);
    void setSize(int len);                          //设置线性表长度
    boolean add(Object obj,int pos);                //添加元素方法
    Object remove(int pos);                         //删除元素方法
    int find(Object obj,int pos);                   //查找元素方法
    boolean modify(Object obj,int pos);             //修改元素方法
    boolean isEmpty();                              //判断是否为空
    int size();                                     //线性表长度
    void nextOrder();
    void preOrder();
    void clear();
    List sort();
}
