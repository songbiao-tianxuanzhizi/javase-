package com.bit.demo5;

/**
 * 抽象类：
 * 1、抽象方法：一个方法如果被abstract修饰，那么这个方法就是抽象方法。抽象方法可以没有具体的实现。
 * 2、包含抽象方法的类称作抽象类，其必须被abstract所修饰，一个抽象类中可以没有抽象方法，但是如果一个类中有抽象方法，那么这个类一定是抽象类，其必须被abstract所修饰
 * 注意：
 * 1、抽象类不可以被实例化。不能使用例如Shape shape = new Shape();这样的语句
 * 但是不影响抽象类发生向上转型
 * 2、类内的数据成员，和普通类没有区别。
 * 3、抽象类主要就是用来被继承的.
 * 4、如果一个非抽象类类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。(重要）
 * 5、当抽象类A 继承 抽象类B 那么A可以不重写B中的方法，但是一旦A要是再被继承，
 * 那么一定还要重写这个抽象方法。
 * 6、抽象类或者抽象方法一定是不能被final修饰的，因为一旦类被final修饰，便不能继承，方法被final修饰，不能被重写
 * 抽象类不能实例化的目的也就是为了继承和重写，所以两者不能同时使用
 * <p>
 * <p>
 * <p>
 * 面试问题：
 * 1：抽象类和普通类的区别？
 * 答：抽象类自身不能实例化，且包含抽象方法的类称作抽象类，其必须被abstract所修饰，一个抽象类中可以没有抽象方法，
 * 但是如果一个类中有抽象方法，那么这个类一定是抽象类，其必须被abstract所修饰。除了这些其他都跟普通类相同
 * 2：抽象类和接口的区别？
 *
 * @author SongBiao
 * @Date 2021/1/18
 */

abstract class Shape {
    public String name;
    public int age;
    private String sex;

    public void fly() {
        System.out.println(this.name + "飞翔");
    }

    public static void eat() {
        System.out.println("吃饭");
    }

    public abstract void draw();
}

abstract class Cycle extends Shape {
    //一个类如果要继承抽象类的话，那么就必须重写父类中的抽象方法,假如此时不想重写的话，可以用抽象类去继承抽象类
    //注意此时就算不重写父类中的抽象方法，也不会报错，原因是此时为子类加上了abstract

     /*@Override//注解
    public void draw() {
        System.out.println("画一个⚪");
    }*/
}

//注意此时继承Cycle类
class React extends Cycle {
    //注意此时如果不去重写draw方法的话，此时便会出错，为什么？
    /*答：虽然此时我们继承了Cycle类，并且Cycle类中并没有重写draw方法，但是Cycle类却从其父类Shape那里继承了
    用abstract修饰的draw方法，所以此时如果React类不加abstract修饰的话，仍需要重写draw方法。
    */
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

        //抽象类虽然不能实例化，但是可以发生向上转型

        //在这里正好说明下多态：
        /*
        首先来看下多态发生的前提：
        1：父类引用引用子类对象
        2：父类子类拥有同名的覆写方法
        3：父类引用此时调用这个覆写的方法
        那么此时我们来看下面的代码，此时首先我们写了向上转型的代码，用父类引用此时指向了子类对象，并且在子类中我们重写了
        父类的方法
        当类的调用者在编写fun这个方法的时候, 参数类型为 Shape (父类), 此时在该方法内部并不知道,
        也不关注当前的 shape引用指向的是哪个类型(哪个子类)的实例. 此时 shape 这个引用调用fun
        方法可能会有多种不同的表现(和 shape 对应的实例相关), 而这不同的表现确是由运行时绑定引起的，
        那么这种行为就被称为多态。
        有时候我们把运行时绑定+向上转型就叫做多态，多态顾名思义其实就是 "一个引用, 能表现出多种不同形态"

        Shape shape=new React();
        Shape shape1=new Triangle();
        fun(shape);
        fun(shape1);
        */

        //另一种写法，与上面代码输出结果相同
        Shape[] shapes = {new React(), new Triangle()};
        for (Shape shape : shapes) {
            shape.draw();
        }

        /*
        代码会报错，因为Cycle类是抽象类，是不能发生new Cycle()这一实例化对象的过程的
        Shape shape=new Cycle();
         */

    }
}
