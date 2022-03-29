# Reverse-linkList
代码内容：

![5BRB J_@R$3EUM7_YUI(S}2](https://user-images.githubusercontent.com/101461459/160610403-1b54c0f5-6f4a-44a4-8e83-6f689c641c80.png)

![07ICOBR(S@4$N7( WDNLP%E](https://user-images.githubusercontent.com/101461459/160610426-36ea5021-9be9-48d9-a1c2-003c331beb5d.png)



主要思路：

![IMG_5229](https://user-images.githubusercontent.com/101461459/160609651-6230bb42-696e-434b-a623-2b5141159eca.JPG)

难点：

      p.next=reverse.next;
      
      reverse.next=p;
      
第一次循环：先将reverse.next的值（第一次循环为null）赋给p.next，这样就使p.next指向结点2变为了null，使结点1和结点2断开；

再将p赋给reverse.next，这样就使结点1成为reverse的后继。此时reverse——结点1

将p、q向后移，继续进行这两个操作。

第二次循环：先将reverse.next的值（第二次循环为结点1）赋给p.next，这样就使p.next指向结点3变为了结点1，使结点2和结点3断开；

再将p赋给reverse.next，这样就使结点2成为reverse的后继。此时reverse——结点2——结点1

以此循环完成反转后，将reverse.next赋给head.next即可。
