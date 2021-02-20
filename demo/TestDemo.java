package com.bit.demo;

/**
 * 类和对象
 * 继承：
 * 面试问题：子类继承父类到底继承了什么？
 * 答：子类继承父类除构造方法外的所有东西
 *
 * @author SongBiao
 * @Date 2021/1/08
 */

class Animal {
    public String name;
    public int age;
    private String sex;
    public static int count;
    //默认权限a
    int a;

    public Animal(String name) {
        this.name = name;
        System.out.println("父类构造方法");
    }

    public void eat() {
        System.out.println(this.name + "吃饭");
    }

    private void fly() {
        System.out.println("this.name" + "会飞");
    }

    public static void func() {
        System.out.println("静态方法");
    }
}

//在java中extends关键字只能继承一个类
class Cat extends Animal {
    public void drink() {
        System.out.println(this.name + "喝水");
    }

    public Cat(String name, int age) {
        //super关键字，并注意与this关键字的对比
        //子类在构造时，要先帮助父类进行构造,
        //此时利用super()语句显示调用父类的构造方法，并且此句必须放在第一行，且此句只能放在构造方法中,且只能调用一次
        //所以父类中的构造方法并不是被继承的，而是在子类的中被显示调用的
        super(name);
        //super访问父类的实例成员变量
        super.name = "宋彪爸爸";
        //super访问父类的实例成员方法
        super.eat();

     /* super不能访问父类中私有的实例成员变量和调用私有的实例成员方法
        同时也不能访问父类中静态的成员变量和调用静态的成员方法
        super.sex="男";
        super.fly();
        super.func();
        super.count = 10;
     */
    }

    //不管定义几个构造函数，都必须显示调用父类中的有参构造函数
    public Cat(String name) {
        super(name);
    }
    /*
    super关键字不能用在静态方法中，与this相似，super关键字代表父类对象的引用，而静态是不依赖对象的
    public static void drink1() {
        System.out.println(super.name + "喝水");
    }
    */
}

public class TestDemo {
    public static void main(String[] args) {
        int c=0;
        TestDemo p = new TestDemo();
        Cat cat = new Cat("sbsss");
        //cat.name = "宋彪";
        cat.eat();
        cat.drink();
        //此处因为父类中的fly方法为私有，所以不能访问。
        /*本质上为子类从父类那里继承了私有的字段和方法, 但在子类中是无法对其访问的.
        cat.fly();
        */

        Cat cat1 = new Cat("sdsd");
        System.out.println(cat1.a);
    }
}


