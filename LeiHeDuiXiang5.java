/**
 * 类和对象
 * 代码块
 *
 * @author SongBiao
 * @Date 2021/1/08
 */

class Animal {
    public String name;
    public int age;
    public static int a ;

    Animal() {
        System.out.println("不带有参数的构造方法");
    }

    Animal(String name) {
        System.out.println("带有1个参数，String的构造方法！");
    }

    Animal(String name, int age) {
        System.out.println("带有2个参数，String，int的构造方法！");
    }


    //实例代码块：在类里面，在方法外面
    {
        //在实例代码块中是可以访问静态成员变量和实例成员变量的
        age = 50;
        //a = 30;
        System.out.println("实例代码块");
    }

    //静态代码块:在类里面，在方法外面
    static {
        /*
        在静态代码块中是不能访问实例成员变量的，与静态方法中不能访问静态成员变量和方法类似
        age=20;
        */
        a = 10;
        System.out.println("静态代码块");
    }

}

public class LeiHeDuiXiang5 {
    public static void main(String[] args) {

        {
            //本地代码块
        }

        /*
          对比分析两次的输出结果：
          第一次输出结果为：
          静态代码块
          实例代码块
          不带有参数的构造方法
          第二次输出结果为：
          实例代码块
          不带有参数的构造方法

          总结：1：代码的执行顺序为静态代码块到实例代码块再到构造函数
               2：静态代码块执行一次后便不再执行了

          静态代码块和实例代码块的作用一般是什么呢？
          答：一般是提前初始化一些数据

               */
        Animal animal = new Animal();
        System.out.println("================================");
        Animal animal1 = new Animal();
        System.out.println("================================");
        /**
         * 下面继续来思考一个问题：当我们在static代码块和类中都定了静态变量时，哪个会最先初始化，以及最终的输出结果是什么？
         *  答；这是根据代码的书写顺序来决定的，根据最后的定义的值进行输出
         */



        /*分析：1：此时若只单独执行下面这一行，a最终的输出值为20，原因是此时首先在类中定义a为10后，在静态代码块中又对a重新赋值了一个20
                  假如此时我们调换类中代码的书写顺序，即静态代码块在前，类中的赋值在后的话，则最终输出结果为10
               2：此时我们会发现若单独执行这一条语句，实例代码块和构造函数是不会被执行的，只会执行一次静态代码块，
               原因是我们是a是静态的变量，是不依赖对象的，是可以通过类直接访问的，这期间并没有发生对象的实例化，所以
               没有了对象实例代码块以及构造函数是都不会执行的。
         */
        System.out.println(Animal.a);

    }
}






