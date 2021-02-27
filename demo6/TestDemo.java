package com.bit.demo6;

import java.util.Arrays;

/**
 * 如果要实现自定义类型的克隆，就需要去实现Cloneable接口
 * clone接口以及深拷贝和浅拷贝
 * 面试问题：为什么Cloneable接口是空接口？
 * 答：空接口：我们也称作标记接口。一旦一个类实现了Cloneable这个标记接口，那么这个类便可以进行克隆
 * 同时虽然Cloneable接口中并没有clone方法，但是我们仍需要去重写Object类中的clone方法
 *
 * @author SongBiao
 * @Date 2021/1/18
 */
//Money类同样需要实现Cloneable接口
class Money  implements Cloneable {
    double money = 12.6;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    public int age;
     Money m = new Money();

    //重写Object类中的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //克隆person所指向的对象
        Person p = (Person) super.clone();
        //克隆Person类中的另一个引用类型m所指向的对象
        p.m = (Money) this.m.clone();
        return p;
    }
}

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 = (Person) person.clone();
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        System.out.println("===========对比===========");
        person1.m.money = 99.9;
        System.out.println("修改后的结果为"+person.m.money);
        System.out.println("修改后的结果为"+person1.m.money);
    }


    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        /*注意对于下面的调用clone方法有两点需要注意：
        1：首先引用在调用clone方法时需要抛出CloneNotSupportedException异常
        2：因为clone方法的返回值为引用类型Object,所以如果是其他类定义的引用就需要强制类型转换
         */
        Person person1 = (Person) person.clone();
        System.out.println(person.age);
        System.out.println(person1.age);
        System.out.println("===========对比===========");
        person1.age = 10;
        System.out.println(person.age);
        System.out.println(person1.age);
    }


    public static void main1(String[] args) {
        //以下发生的为深拷贝，因为此时数组中存放的是简单类型，并不是引用类型
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = arr.clone();
        arr1[0] = 99;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
