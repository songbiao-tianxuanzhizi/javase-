/**
 * 类和对象
 * 构造方法
 *
 * @author SongBiao
 * @Date 2021/1/08
 */
class People {
    private String name;
    private int age;
    public String sex;
    public static int count;

    //构造方法
    People() {
        System.out.println("不带有参数的构造方法");
    }

    People(String name) {
        System.out.println("带有1个参数，String的构造方法！");
    }

    People(String name, int age) {
        System.out.println("带有2个参数，String，int的构造方法！");
    }

    People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void print() {
        System.out.println("name=" + name + " " + "age=" + age + " " + "sex=" + sex);
    }
}

public class LeiHeDuiXiang3 {

    public static void main(String[] args) {
        //不同的构造方法的调用主要是看括号内部参数是什么，就调用相对应的即可
        //输出结果为 System.out.println("不带有参数的构造方法");
        People person = new People();
        //输出结果为 System.out.println("带有1个参数，String的构造方法！");
        People person1 = new People("songbiao");
        //输出结果为System.out.println("带有2个参数，String，int的构造方法！");
        People person2 = new People("songbiao", 100);
        /*
         * 在这里注意一个点。假若我们此时去掉People()这个任何参数的构造函数的话，当我们new People()的时候程序便会报错，为什么？
         * 答：因为当我们不定义构造函数时，其实编译器会默认给我们生成一个无参数的构造函数而当我们定义了其他的
         有参的构造函数，而没有定义无参数的构造函数时，此时系统不会再默认为我们定义无参数的构造函数了，
         那么当我们通过语句new People()实例化一个对象时，便找不到对应的构造函数了，那么此时需要我们自己定义一个无参数的构造函数
         */

        System.out.println("==============================================");
        //构造函数的作用就是构造对象，同时也可以在构造对象的同时对对象的成员进行初始化
        People person3 = new People("songbiao", 100, "男");
        person3.print();
    }
}
