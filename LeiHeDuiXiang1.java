import com.sun.xml.internal.ws.message.StringHeader;

import java.util.Scanner;

/**
 * 类和对象
 *
 * @author SongBiao
 * @Date 2021/1/08
 */
class Man {
    public String name;//实例成员变量
    public int age;
    public int size;

    /**
     * static关键字修饰成员变量，简称静态成员变量，又称类变量
     * 1.访问方式：通过类名.静态成员变量名进行访问
     * 2.内存的存储方式：方法区
     * 3.特点：静态的只有一份，且不依赖对象
     */
    public static int count;//静态成员变量

    public void eat() {
        System.out.println(name + "吃饭");
        //static int c=20;
    }


    /**
     * static关键字修饰方法
     * 1:访问方式：通过类名.静态成员方法名()
     * 2：特点：在静态方法的内部是不能访问实例成员变量的，同样也不能访问实例成员方法
     */
    public static void func() {

        //不能访问实例成员方法
        //eat();
        System.out.println(count);

        /*
        此时若是输出实例成员变量age会报错
        System.out.println(age);
        */

        /*
        注意不管是静态的方法还是非静态的方法中都不能定义静态的变量,但是可以定义非静态的
        原因：因为静态的变量属于类并不属于方法，也就是我们俗称的类变量
        static int a=10;(不允许）
        */
    }
}

public class LeiHeDuiXiang1 {


    public static void main(String[] args) {
      /*我们会发现最终的输出结果都为0，原因是每个引用在堆中都有对应的对象，
        相当于size是每个对象都私有的，给其中一个size++并不影响其他对象的size值*/
        Man person = new Man();
        System.out.println(person.size++);
        Man person1 = new Man();
        System.out.println(person1.size++);
        Man person2 = new Man();
        System.out.println(person2.size++);
        System.out.println("================================");
        /**
         * 最终count的输出结果为 1
         *                    1
         *                    2
         *因为count为静态成员变量，其存储在方法区中且只有一个，是共享的，所以每次当访问它时，都会影响它的值
         */
        Man.count++;
        System.out.println(Man.count);
        Man.count++;
        System.out.println(Man.count);
        Man.count++;
        System.out.println(Man.count);

    }

    /**
     * 成员变量的三种赋值方法：
     * 1:默认赋值
     * 2：就地初始化：即在类里定义时直接初始化
     * 3：类外初始化：(用的最多)
     */
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);

    }
}
