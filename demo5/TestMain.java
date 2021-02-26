package com.bit.demo5;

/**
 * 接口,英文名叫作interface
 * <p>
 * 接口的出现是为了更好的实现多继承
 * 1、接口当中的方法，都是抽象方法。
 * 2、其实可以有具体实现的方法。这个方法是被default修饰的（JDK1.8加入的）
 * 3、接口当中定义的成员变量，默认是常量。
 * 4、接口当中的成员变量默认是：public static final   成员方法是：public abstract
 * 5、接口是不可以被实例化的。        Shape shape = new Shape();（不允许）
 * 6、接口和类之间的关系 : implements，当一个类实现了这个接口且接口中有抽象方法时，则这个类必须重写接口中的抽象方法
 * 7、接口的出现是为了解决Java单继承的问题.一个类可以实现多个接口。但是只能继承一个父类
 * 8、只要这个类 实现了该接口，那么你就可以进行向上转型了。
 *
 * @author SongBiao
 * @Date 2021/1/18
 */

interface Shape1 {
    //接口中定义的成员变量都会被默认为常量，由public  static final默认进行修饰，所以就算不写public  static final也无所谓，
    int a = 10;
    public static final String name = "sss";

    //接口中的方法几乎都为抽象方法,默认为public abstract进行修饰，所以就算不写public abstract也无所谓
    void draw();

    //当然接口中也可以定义非抽象方法，用default关键字即可，default是在java8中引入的关键字，具体可看csdn博客
    default void drink() {
        System.out.println("喝水");
    }
}

class Cycle1 implements Shape1 {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }

}

class React1 implements Shape1 {
    @Override//注解
    public void draw() {
        System.out.println("画一个□");
    }

}

public class TestMain {
    public static void fun(Shape1 shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        //接口也是可以发生向上转型的，前提是一个类必须实现了这个接口
        //例如下面的代码，因为Cycle1类实现了Shape1这个接口，所以此时接口类型的shape引用可以指向Cycle1类的实例了
        Shape1 shape = new Cycle1();
        Shape1 shape1=new React1();
        shape.draw();
        shape1.draw();
    }
}
