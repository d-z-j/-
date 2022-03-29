import java.util.List;

public class linkList implements List_interface{
    private Node head;//头指针
    private int length;//单链表的长度
    public linkList(){                      //单链表的初始化，创建一个head，head的element和next都为null
        length=0;
        head=new Node(null);
    }
    public Node prior(){return head;}
    public void setSize(int len){length=len;}
    public Node getHead(){                  //获取单链表表头结点的位置
        return head;
    }
    public boolean add(Object obj,int pos){     //单链表的插入
        //先判断pos值是否合法
        if((pos<1||pos>length+1)){
            System.out.println("pos值不合法");
            return false;
        }
        //设置计数器
        int num=1;
        //p、q为临时变量，将head赋给p，head的后继head.next赋给q
        Node p=head,q=head.next;
        //执行循环至要插入的位置，另临时变量p，q移动到要插入的位置。先将下一个的值赋给p，再将第二个的next赋给q
        while (num<pos){
            p=q;
            q=q.next;
            num++;
        }
        p.next=new Node(obj,q);             //当num==pos时，结束循环。先将后继next指针p赋给插入值，再插入元素至pos位置
        length++;                           //表长+1
        return true;
    }
    public Object remove(int pos){          //单链表的删除
        //判断单链表是否为空
        if (isEmpty()){
            System.out.println("链表为空");
            return null;
        }
        //判断pos值是否合法
        else{
            if ((pos<1||pos>length+1)){
                System.out.println("pos值不合法");
                return null;
            }
            //与插入元素相同，找到要删除的位置
            int num=1;
            Node p=head,q=head.next;
            while (num<pos){
                p=q;
                q=q.next;
                num++;
            }
            p.next=q.next;      //将删除元素后一个的后继赋给前一个的后继
            length--;
            return q.element;   //返回被删除位置的值
        }
    }

    @Override
    public int find(Object obj, int pos) {
        return 0;
    }

    public Object value(int pos){                   //输出单链表指定位置的值
        //判断单链表是否为空
        if (isEmpty()){
            System.out.println("链表为空表");
            return null;
        }
        //判断pos值是否合法
        else{
            if ((pos<1||pos>length+1)){
                System.out.println("pos值不合法");
                return null;
            }
            //找到pos位置的结点
            int num=1;
            Node p=head.next;
            while (num<pos){
                p=p.next;
                num++;
            }
            return p.element;       //返回值
        }
    }
    public int find(Object obj){                //找出单链表中元素的位置pos
        //判断单链表是否为空
        if (isEmpty()){
            System.out.println("链表为空表");
            return -1;
        }
        int num=1;
        Node p=head.next;//p引用的是头结点之后的节点
        while (p!=null){//单链表的判空条件
            if (p.element.equals(obj)==false) {//equals判断两个对象值是否相等
                p = p.next;
                num++;
            }
            else break;
        }
        //查找到单链表最后一个结点时，next为null，返回-1
        if (p==null) return -1;
        return num;
    }
    public boolean modify(Object obj,int pos){          //修改单链表中的数据元素
        //判断单链表是否为空
        if (isEmpty()){
            System.out.println("链表为空表");
            return false;
        }
        //判断pos值是否合法
        else{
            if ((pos<1||pos>length+1)){
                System.out.println("pos值不合法");
                return false;
            }
            //方法同插入元素
            int num=1;
            Node q=head.next;
            while (num<pos){
                q=q.next;
                num++;
            }
            q.element=obj;
            return true;
        }
    }
    public boolean isEmpty(){           //判断单链表是否为空，空 为true ，不为空 为false
        return length==0;
    }
    public int size(){                  //获取单链表的表长
        return length;
    }
    public void nextOrder(){            //单链表的排序，遍历每一个元素，并输出值
        Node p=head.next;
        while (p!=null){
            System.out.println(p.element);
            p=p.next;
        }
    }

    @Override
    public void preOrder() {

    }

    public void clear(){            //清空单链表，令表长为0，头指针为null
        length=0;
        head.next=null;
    }

    public void reverseList(){      //单链表的反转
        if (head.next==null||head.next.next==null){     //判断链表是否为空或只有一个结点
            return;
        }
        Node reverse=new Node(null,null);      //一个中间变量reverse为null
        Node p=head.next;      //另p指向第一个结点
        Node q=null;            //q为null
        while(p!=null){         //当p结点不为空时，开始循环
            q=p.next;               //先将p.next赋给q
            p.next=reverse.next;    //将reverse的next赋给p的next。第一次循环为null，往后依次为head的第一个节点、第二个节点......
            reverse.next=p;         //将p赋给reverse的next
            p=q;                    //将q赋给p
        }
        head.next=reverse.next;     //将reverse的next赋给head的next
    }
    @Override
    public List sort() {
        return null;
    }
}
