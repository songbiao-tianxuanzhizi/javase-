package com.bit.demo7;

/**
 * String
 *
 * @author SongBiao
 * @Date 2021/1/18
 */
class Shape {
    public void draw() {
        System.out.println("打印图形");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个□");
    }
}

class React extends Cycle {
    @Override//注解
    public void draw() {
        System.out.println("画一个□");
    }
}

class Triangle extends Shape {
    @Override//注解
    public void draw() {
        System.out.println("画一个🔺");
    }
}


public class TestDemo {
    public static void fun(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {

        Shape shape = new Cycle();
        Shape shape2 = new React();
        Shape shape3 = new Triangle();
        fun(shape);
        fun(shape2);
        fun(shape3);
        System.out.println("===============================");
        System.out.println("另一种写法，与上面代码输出结果相同");
        Shape[] shapes = {new Cycle(), new React(), new Triangle()};
        for (Shape shape4 : shapes) {
            shape4.draw();
        }

    }
}
