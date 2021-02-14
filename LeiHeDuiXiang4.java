/**
 * 类和对象
 * this关键字
 * * 在这里讲下为什么this是对象的引用而不是对象？
 * * 首先来看下实例化一个对象分为几步吧：
 * * 第1步：为对象分配内存
 * * 第2步：调用合适的构造方法。注意：合适二字意味着构造函数可不止一个
 * * this不是对象的原因是当我们完成对构造方法的调用后对象才会创建，而我们此时能在构造函数中去使用this,则说明
 * * this出现在对象创立之前，所以this并不是指对象
 * * 当我们在实例化对象的时候，第一步是为对象分配内存，既然有了内存就一定有了地址，地址是存在引用当中的，所以我们
 * * 说此时this指的是对象的引用。
 * <p>
 * <p>
 * <p>
 * this的三种使用方式：
 * 1：this访问成员变量
 * 2：this调用成员方法
 * 3：this调用构造方法：在一个方法内部调用另外一个构造方法
 *
 * @author SongBiao
 * @date 2021/1/08
 */

class People1 {
    private String name;
    private int age;
    public String sex;
    public static int count;

    //this调用构造方法
    People1() {
        /*
        注意this不能调用本身的构造函数，不然会陷入死循环
        this();
        */
        /*
        this在调用构造方法时只能放在第一行并且只能调用一次构造函数
        this在调用构造方法时只能用在构造方法中

        */
        this("songbiao");
        /*
        注意此时this如果想要调用第二个构造函数便会报错
        this("haha",10);
         */
        System.out.println("haha");
    }

    People1(String name) {
        System.out.println("hehe");
    }

    People1(String name, int age) {
        System.out.println("heheda");
    }


    //普通成员方法
    public void eat() {
        People1 p = new People1();
        System.out.println("吃饭");
    }

    /*1.普通的成员方法中是可以使用this来访问实例成员变量和静态成员变量的
      2.普通的成员方法中是可以使用this来调用实例成员方法和静态成员方法的

    */
    public void print() {
        //使用this来访问实例成员变量
        System.out.println("name=" + this.name + " " + "age=" + this.age + " " + "sex=" + sex);
        //使用this来访问静态成员变量，虽然不妥但是编译时不会出错的
        System.out.println(this.count);
        //使用this来调用实例成员方法
        this.eat();
        //使用this来调用静态成员方法，虽然不妥但是编译时不会出错的
        this.func1();
        //可以直接调用静态成员方法
        func1();
        //可以直接调用实例成员方法
        eat();
         /*
         注意不管是静态的方法还是非静态的方法中都不能定义静态的变量,但是可以定义非静态的
         原因：因为静态的变量属于类并不属于方法，也就是我们俗称的类变量
         static int a=10;(不允许）
        */
        //可以直接访问静态成员方法
        count++;
    }


    public static void func1() {
        int a = 10;
        System.out.println("sss");
    }

    /*
    静态方法中是不能使用this的，原因是this代表对象的引用，而静态是不依赖对象的
     */
    public static void func() {
        // 静态方法中不能使用this访问实例成员变量或者静态成员变量
        //System.out.println(this.name);
        //System.out.println(this.count);
        //静态方法中不能使用this调用实例成员方法或者静态成员方法
        //this.print();
        //this.func1();
        //静态方法中不能直接调用非静态成员方法
        //print();
        //静态方法中可以直接调用静态成员方法
        func1();
        //静态方法中可以直接访问静态成员变量
        count++;
        /*注意不管是静态的方法还是非静态的方法中都不能定义静态的变量,但是可以定义非静态的
          static int a=10;(不允许)
        //总结：静态方法中不能访问成员变量，同时也不能调用成员方法，并且不能在静态方法中定义静态变量
        */
        System.out.println("此方法为静态方法");
    }
}

public class LeiHeDuiXiang4 {
    public static void main(String[] args) {
        People1 person = new People1();
        person.eat();
    }
}
