package com.bit.demo5;

/**
 * 多继承问题
 *接口的出现是为了更好的实现多继承
 * 在这里根据此代码我来重点阐述下什么是java中的多继承
 * 首先java是没有多继承的，Java中只支持单继承,一个类只能extends一个父类.但是可以同时实现多个接口,也能达到多继承类似的效果.
 * 那么为什么要引入接口呢？我们以下面的这串代码为例来阐述下：
 * 首先动物是有很多种的，每个动物会的都不一样，例如猫会跑但是不能飞，鱼会游泳但是不能飞，青蛙能跑能游泳但不能飞，鸭子是既可以跑
 也可以跳也可以飞，那么此时如果我们将飞，跳，游泳这三种方法都写入到Animal类中，然后让猫，鱼，青蛙，鸭子都去继承Animal类的话，
 我们会发现有些方法是根本用不到的，造成了浪费，所以此时我们想多继承，例如哪个类有我想要的方法就去继承它即可，但是万一想要的两个
 方法在两个不同的类中怎么办呢？java是不支持多继承的，所以此时我们便引入了接口，把我们想要的每个功能都封装成接口，我们想用哪个接口了
 直接去实现哪个接口即可，这样子表面上看起来我们便实现了多继承。

 所以我们在编写代码时，便把飞，跳，游泳这三个功能每个都写了一个接口，然后把动物们共有的属性全部放入我们的Animal类中，哪个
 动物具有哪个功能直接实现对应接口并重写里面的抽象方法即可，并且继承Animal类获得共有的属性，这样同时提高了代码的复用性，并且
 一个类是可以实现多个接口的，对应到鸭子是既可以跑也可以跳也可以飞，那么其对应的类便可以实现三个接口。


 * @author SongBiao
 * @Date 2021/1/18
 */
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    //省略了public abstract
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

//1、 一个类可以继承一个普通类/抽象类，并且可以同时实现多个接口
//extends与implements的书写顺序为   extends在前，implements在后
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

//猫可以游泳
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

//青蛙既能跑，也能游泳，则此时可以通过实现多个接口来完成代码编写
class Frog extends Animal implements IRunning, ISwimming {

    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + " 正在跑！");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " 正在游！");

    }
}

//鸭子是既可以跑也可以游泳也可以飞
class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
    super(name);
}

    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");

    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }

    @Override
    public void swim() { System.out.println(this.name + "正在漂在水上");
    }
}
class Robot implements IFlying{
    @Override
    public void fly() {
        System.out.println("飞翔");
    }
}

public class TestMoreExtends {
    public static void fun(IRunning iRunning){
        iRunning.run();
    }
    public static void main(String[] args) {

        //由于接口也可以进行向上转型，那么请看代码：
        //因为此时Cat类实现的是IRunning接口，所以此时可以使用向上转型如下所示，若没有实现IRunning接口，则会报错
        IRunning iRunning=new Cat("dd");
        iRunning.run();
        //同样的因为此时Frog类实现的是IRunning接口，所以此时可以使用向上转型如下所示，若没有实现IRunning接口，同样会报错
        IRunning iRunning1=new Frog("ss");
        iRunning1.run();
        System.out.println("=========================");
        //或者此时利用方法传参也可以
        fun(iRunning);
        fun(iRunning1);


    }
}
