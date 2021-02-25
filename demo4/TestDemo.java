package com.bit.demo4;

class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "   Animal::eat()");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
    }
    public void drink() {
        System.out.println("this.name" + "喝水");
    }
    @Override
    public void eat() {
        System.out.println(this.name + "Cat::eat()");
    }
}

public class TestDemo{
    public static void main(String[] args) {
        //运行时绑定
        Animal animal=new Cat("豆豆");
        animal.eat();
    }
}
