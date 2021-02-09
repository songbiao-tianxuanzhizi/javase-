/**
 * 类和对象
 *
 * @author SongBiao
 * @Date 2021/1/06
 */

/**
 * 一个类由属性和行为组成
 * 属性也被称为成员变量或者字段
 * 行为也被称作方法或者函数
 * Person称作类，也叫做类型，也被称为自定义类型，所以它也可以像基本数据类型那样创建变量
 */
class Person {
    /**以下这四种统称为访问修饰限定符(不一样的限定符其权限是不一样的)
     * public,private,protected,默认权限
     */

    /**
     * 成员变量：(此处注意与成员变量的区别)
     * 成员变量是定义在方法外部和类内部的变量
     * 当实例成员变量没有被赋值时，是有默认值的：
     * byte short int long 0
     * float 0.0f;  double 0.0
     * boolean  false
     * char'\u0000'
     * 实例成员变量的访问方式：通过对象的引用来访问实例成员变量
     * 局部变量在使用时必须对其进行赋值
     */
    public String name;//其别名有三种：属性/实例成员变量/字段
    public int age;
    public boolean flg;
    public char ch;
    /**
     * 静态成员变量的默认值与实例成员变量相同
     */
    public static int count;//静态成员变量

    //一个人可以有很多的行为，例如吃饭睡觉打豆豆，而这些行为是由方法来实现的
    //行为也被称作方法或者函数
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("碎觉");
    }

    //定义一个静态方法
    public static void play() {
        /*
        静态的成员方法内部  不可以调用非静态方法
        eat();
        */
        System.out.println("打豆豆");
    }

    //@Override为注解，注解是有很多种的，现在我们只是看到了其中一种，代表当前方法是重写的方法
/*    @Override
    //此处重写toString方法
    public String toString() {
        return "Person{" + "name=" + name + "age=" + age + "}";
    }
}*/
}

public class LeiHeDuiXiang {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.age = 14;
    }
}

/*
        public static void main4(String[] args) {
            *//**
 * 静态的成员变量和成员方法必须通过类名来进行访问，访问形式为：类名.
 * 所以说静态的成员变量和成员方法有些书也把它们叫做类变量和类方法
 *//*
            //对于静态成员变量的调用需要通过类来调用
            Person person = new Person();
            //通过类来对静态成员变量进行访问
            System.out.println(Person.count);
            //此处虽然程序报错，但是还是可以编译通过的，但我们并不建议这么书写
            //因为实例成员变量是存储在堆上的，而静态成员变量是存储在方法区的，存储在堆上的对象只能通过对象的引用来调用那个
            System.out.println(person.count);
            //通过类来对静态成员方法进行访问
            Person.play();

            //一个类可以new多个对象出来
            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();
            //person4这个引用指向了person3这个引用所指向的对象
            Person person5 = person3;

            //person4这个引用不指向任何对象
            Person person4 = null;
            //如果引用为空，则输出null
            System.out.println(person4);
            //如果此时重写的toString方法不在Person类中的话，此处输出的值仍为Person@4554617c
            System.out.println(person1);
        }

        public static void main1(String[] args) {
            */

/**
 * 对象(也被称作实体)：new Person()
 * person：被称作引用
 * 我们把new Person()这一过程称作对象的实例化，也可称作实例化了一个对象
 *//*
            Person person = new Person();
            //默认值为0
            System.out.println(person.age);
            //默认值为null
            System.out.println(person.name);
            //默认值为'\u0000'，输出时不显示任何东西
            System.out.println(person.ch);
            //默认值为false
            System.out.println(person.flg);
            //完成引用对方法的调用
            person.eat();
            person.sleep();
        }
    }*/





