package com.bit.demo4;

/**
 * 理解多态
 *
 * @author SongBiao
 * @Date 2021/1/18
 */

class Shape {
    public void show() {
        System.out.println();
    }
}

class Cycle extends Shape {

    @Override//注解
    public void show() {
        System.out.println("画一个⚪");
    }
}

class React extends Shape {
    @Override//注解
    public void show() {
        System.out.println("画一个□");
    }
}

class Triangle extends Shape {
    @Override//注解
    public void show() {
        System.out.println("画一个🔺");
    }
}

public class TestMain {
    public static void main(String[] args) {
        //多态的体现
        //另一种写法
        Shape[] shape = {new Cycle(), new React(), new Triangle()};
        for (Shape shape1 : shape) {
            //发生动态绑定
            shape1.show();
        }
    }
}
