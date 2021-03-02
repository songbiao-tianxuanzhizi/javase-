
package com.bit.demo8;

class Money {
    double money = 12.6;
}

class Person implements Cloneable {
    public int age;
    Money m = new Money();

    @Override
    //此处的clone方法必须抛出CloneNotSupportedException异常
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
}