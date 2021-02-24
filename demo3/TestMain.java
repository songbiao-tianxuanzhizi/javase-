package com.bit.demo3;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * 多态
 * User:
 * Date: 2020-04-27
 * Time: 20:08
 */

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name + "   Animal::eat()");
    }
}

class Cat extends Animal {
    public int count = 99;

    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        System.out.println("Cat(String)");
    }

    public void drink() {
        System.out.println("this.name" + "喝水");
    }

    //此时子类重写了父类中的方法
    /*
    方法的重写：1.返回值相同
              2.方法名称相同
              3.参数列表相同
              4.方法的重写是建立在继承关系上的，即子类继承父类时可重写父类的方法

    方法重写需要注意的几点：
    1。被重写的方法不能用final进行修饰，否则不能进行重写
    2.被重写的方法不能被private修饰
    3.重写的方法的访问修饰限定符的权限一定要大于等于被重写的方法的权限
    其遵循这样的规则：privated<default<protected<public
    4.被static所修饰的方法是不能被重写的
    */
    @Override
    public void eat() {
        System.out.println(this.name + "Cat::eat()");
    }
}

class Bird extends Cat {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "Bird::fly()");
    }

}

public class TestMain {
    //向上转型的第二种情况
    public static void func(Animal animal) {
        animal.eat();
    }

    //向上转型的第三种情况
    public static Animal func1() {
        Cat cat = new Cat("豆豆");
        return cat;

    }

    public static void main(String[] args) {
        /*
        向下转型,即将一个父类引用赋给子类
        注意：向下转型并不安全
        Animal animal = new Bird("豆豆");
        Bird bird = (Bird) animal;
        bird.fly();
        */

        /*
        注意这里的坑：此时我们让animal引用去引用子类的Cat的对象，
        然后将父类animal引用赋给子类bird引用，再调用子类bird中的fly方法时虽然编译器在你书写时
        并不会报错，但是在编译运行后便会抛出异常了，原因是此时我们让animal引用去引用子类的Cat的对象
        而并没有让animal引用去引用子类的Bird的对象,所以会抛出ClassCastException异常，即类型转换异常

        那么这个时候我们便引入了一个关键字instanceof，格式为A instanceof B
        作用是判断A是否是B的一个实例，同时也可理解为判断A之前是否引用了B这个对象
        那么下述代码出错的原因便一目了然了，此时animal之前并没有引用Bird对象，那么怎么能进行向下转型呢
        所以当对animal引用进行强制类型转换后再调用子类中特有的fly方法时便会出错
        */
        Animal animal = new Cat("豆豆");
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("ERROR");
        }


     /*
        //正确写法：
        Animal animal = new Bird("豆豆");
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("ERROR");
        }
    }
    */

    }


    public static void main2(String[] args) {
        /*
        运行时绑定：即当父类引用去引用子类对象且父类引用调用父类在子类中被重写的方法时会发生运行时绑定
        当animal这个引用调用eat方法时，其在编译过程中调用的还是父类Animal中的eat方法，但是
        在运行时调用的却是子类Cat中重写的eat方法，这便叫做运行时绑定
         */
        Animal animal = new Cat("豆豆");
        animal.eat();
        //因为Bird间接继承了animal，所以下面的语句也是对的
        Animal animal1 = new Bird("豆豆");
        /*
        此时在Bird当中虽然没有重写Animal中的eat方法，其最终的输出结果与其父类Cat中的eat方法的
        输出结果相同，原因是此时Bird当中虽然没有重写Animal当中的eat方法，但是Bird继承了其父类
        Cat重写其父类Animal的eat方法，等价于此时Bird当中重写了其父类Animal当中的eat方法，所以下面的
        语句输出时仍为豆豆Cat::eat()
         */
        animal1.eat();
    }

    public static void main1(String[] args) {
        //向上转型：即将一个子类对象赋给父类的引用，统称为父类引用去引用子类对象
        /*向上转型发生的时机有三种，
        一：直接赋值，如下所示
        Animal animal = new Cat("豆豆");
        animal.eat();
*/
        /*二：方法传参
        Cat cat = new Cat("豆豆");
        func(cat);
        */

        /*
        三：返回值
        func1().eat();
        或者按照下面这样书写也可以
        Animal animal=func1();
        animal.eat();
        */

        /*此时的父类引用只能访问自己的属性或者调用自己的方法，不能访问子类中特有的属性和调用子类中特有的方法
        animal.count;
        animal.drink();
         */
    }
}
