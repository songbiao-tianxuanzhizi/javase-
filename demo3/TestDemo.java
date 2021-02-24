package com.bit.demo3;
//final关键字

class Animal1  {
    public String name;
    public int age;
}

/**
 * final关键字修饰类：称作密封类
 * 一旦一个类被final所修饰，那么这个类必然不能被继承
 * final关键字修饰方法：称作密封方法
 * 一个需要重写的的方法是不能被final所修饰的，原因是一旦被final修饰后，此方法为密封方法，是不能被重写的
 */
/*final class Cat extends Animal1{

}*/
/*class GardenCat extends Cat{

}*/
public class TestDemo {
    public static void main(String[] args) {

    }
}

