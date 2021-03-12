package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * @author SongBiao
 * @Date 2021/1/18
 */
class Student {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //此处需要重写 toString()方法，不然最后打印出来的为哈希值
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


public class showList {
    public static void main(String[] args) {
        //对list进行排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(20);
        list.add(18);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main4(String[] args) {
        //要求自行定义一个类，并把其存入顺序表后自行打印出来
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("bit", 19, 89.9));
        list.add(new Student("bit2", 219, 189.9));
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main3(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //迭代器  用来打印集合中的元素的
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //建议大家 慎用iterator.remove
        iterator.remove();
        //最终的输出结果为[1, 2, 3, 4]，删除的是顺序表的最后一个元素
        /*
         iterator.remove();
         但是要注意不能再写第二个remove方法，因为
         */
        System.out.println(list);
    }

    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //System.out.println(list);//1 2 3 4 5

        List<Integer> list1 = new ArrayList<>();
        //subList(int fromIndex, int toIndex) 方法为取数组下标为fromIndex和数组下标为toIndex-1处的数字
        list1 = list.subList(1, 3);
        //最终取出的结果为[2, 3]，因为此处为取顺序表下标为1和2处的数字
        System.out.println(list1);

        //此时把取出的数组中下标为0处的数字改为88
        list1.set(0, 88);
        //将2改成88
        //输出结果为[88, 3]
        System.out.println(list1);//88 3

        //此时输出最终的顺序表全部数字
        //输出结果为[1, 88, 3, 4, 5]
        /*这种情况我们称之为浅拷贝，即当两个引用list1和list指向同一个对象时，一个引用对对象改变后，另一个引用引用
        相同的对象后会接收到改变后的结果。
        例如下面的线性表一开始的值为1 2 3 4 5，当list1引用利用sublist方法提取出下标为1和下标为2处的数字，并利用set方法修改了
        下标为1处的数字后，最终输出list的结果为[1, 88, 3, 4, 5]，这就是浅拷贝
        同时也告诉我们对于sublist方法要慎重使用哦*/

        System.out.println(list);

    }

    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(1);
        list.add(1, 2);
        //输出结果为[1, 2]
        System.out.println(list);


        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);
        arraylist.add(20);
        list.addAll(arraylist);
        //输出结果紧跟在上面数字的后面再插入10与20，最终输出list为[1, 2, 10, 20]
        System.out.println(list);


        //去掉线性表第一个元素
        list.remove(0);
        //输出结果为[2, 10, 20]
        System.out.println(list);

        //将此时线性表第一个元素设置为99
        list.set(0, 99);
        //输出结果为[99, 10, 20]
        System.out.println(list);

    }
}
