package Genetic;

/**
 * @author SongBiao
 * @Date 2021/1/18
 * 使用泛型的书写方式
 * 题目：写一个通用的顺序表？
 * Object是所有类的父类，哪怕这个类没有继承Object
 * 泛型：只存在于编译时期 ，运行时就没有泛型的概念了
 * 意义：
 * 1、自动进行类型的检查
  为什么可以自动进行类型的检查，是这样的：T处的数据类型可以有很多种，例如简单数据类型的包装类，引用类型以及自定义数据类型，假如此时我们在泛型类内部
  定义一个数组的话，这个数组的类型可以跟T处定义的类型有关，并且后期往数组里面插入数据的时候
 会自动检查插入的数据是否跟T中的数据类型匹配，如果匹配，那么就直接插入，这样子我们就制作出来了
 一个通用的顺序表
 * 2、自动进行类型转换
 紧接着上面，根据之前我们写通用顺序表的写法，是直接定义一个Object类型的数组，这样就会导致
 最终我们在获取顺序表中的某个值的时候必须进行强制类型转换(具体可参照Genetic包下的TestDemo代码)，而当我们
 使用了泛型之后，便不再存在这样的问题，因为泛型会帮我们自动进行类型的转换。例如String str = myArrayList.get(1);
这段代码，他就自动进行了类型转换

 泛型的注意事项：
1：简单类型不能做泛型类型的参数，例如下面的int就不能做参数，尖括号中只能是引用类型，而像java当中的八种基本数据类型
就不能放在尖括号里面，此时放入的应该是这八种基本类型所对应的包装类，因为包装类是引用类型
 MyArrayList<int> myArrayList1 = new MyArrayList<>();

2：泛型 在 编译的时候  并不会进行指定类型的替换 而是拿着指定的类型进行检查，
  也就是说 在编译的时候 ，拿着你指定的类型进行类型检查 ，记住我并没有说是替换
  例如下面的代码：
  MyArrayList<String> myArrayList = new MyArrayList<>();
  myArrayList.add("sss");
 此时插入的时候会拿着String这个类型进行检查，如果插入的是字符串，就不会报错，否则便报错。此时并不是说我把T替换成了
 String。

3：编译的时候 会进行类型擦除，编译的时候都会把泛型擦除为Object，并不是我们所理解的替换为Object，从而此时的泛型具有了Object的特质
 这样就很好解释下面的代码为什么我们可以在<>中放入很多不同的引用类型，例如String,Interger,Double，这些，
 因为在编译的时候已经将泛型T擦除为Object类型，而Object是所有类的父类，所以就可以放入许多引用类型以及包装类(包装类本质上也是引用类型)

4：不能new 泛型类型的数组  this.elem = new T[10];
 因为T的类型不能确定，编译和运行时候都不知道T的类型，所以不能new出来一个泛型类型的数组，只能强转。

 5：所以T就是个模板，里面可以放不同的引用类型。
 6：泛型类型的参数 不参与类型的组成-》 即泛型就是在编译时期的一种机制
 */






class MyArrayList<T> {
    //定义一个T类型的数组，此时并不知道到底是什么类型的数组
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        /*此处为什么要用强制类型转换：我来解释下：
        首先这么写是因为泛型类的原因，当我们强转其为T类型的数组时，此时我们并不知道这个数组强转后到底是什么数组，因为
        T此时并没有给定一个合适的引用类型，而数组的类型是由后续我们填入的引用类型来决定的，这就提供类一个通用的数组模板，且后期
        不需要进行强制类型转换
        */
        this.elem = (T[]) new Object[10];
        /*为什么不直接定义一个T类型的数组，因为此时发生了泛型的擦除机制，即将泛型擦除为Object，从而此时的泛型具有了Object的特质
        所以此时的this.elem=new T[10];就等价于this.elem=new Object[10];
        而我们是想要一个非Object类型的通用的数组，且后期不需要进行强制类型转换，所以才需要像上面那样写
        //this.elem=new T[10];


        /*
        此时大家还是会有疑问，此时创建数组可否换一个写法：如下所示：
         this.elem = (T[]) new Integer[10];
         此时我们会发现编译器会报出一个ArrayStoreException异常，原因是T与Object其实在这里是绑定的，
         举个例子，假如我们此时T处为String类型的话，(T[]) new Object[10];就等价于(String[]) new Object[10],
         此时String是Object类的子类，此时便会创造出一个String类型的数组，
         如果此时是(T[]) new Integer[10]；这段代码的话，就等价于(String[]) new Integer[10],此时String并不是Integer的子类
         那么最终便会抛出ArrayStoreException异常。
         */

    }

    //插入数据，插入的数据类型由T处的数据类型决定
    public void add(T data) {
        this.elem[this.usedSize] = data;
        usedSize++;
    }

    //根据T处的数据类型来返回相应的值
    public T get(int pos) {
        return this.elem[pos];
    }
}
class Person{

}

public class TestMain {
    public static void main1(String[] args) {
        //T为String类型
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("sss");
        myArrayList.add("ddd");
        myArrayList.add("fff");
        String str = myArrayList.get(1);
        System.out.println(str);


        //T为整数类型
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        int val = myArrayList2.get(1);
        System.out.println(val);

        //T为浮点数类型
        MyArrayList<Double> myArrayList3 = new MyArrayList<>();

    }
    public static void main2(String[] args) {
        Person person = new Person();
        //输出结果为Genetic.Person@4554617c
        System.out.println(person);
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        //输出结果为Genetic.MyArrayList@74a14482
        System.out.println(myArrayList1);
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        MyArrayList<Double>  myArrayList3 = new MyArrayList<>();
        //输出结果为Genetic.MyArrayList@1540e19d
        System.out.println(myArrayList2);
        //输出结果为Genetic.MyArrayList@677327b6
        System.out.println(myArrayList3);

        //上述的输出结果充分说明泛型类型的参数 不参与类型的组成-》 即泛型就是在编译时期的一种机制
    }



    /**
     * 装包/装箱：把简单类型 包装成 对应的包装类
     *    自动装包：
     *    显示装包：
     * 拆包/拆箱：把包装类变为简单类型
     *    自动拆箱：
     *    显示拆箱：
     */
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
        Integer c=139;
        Integer d=139;
        System.out.println(c==d);

    }
    public static void main6(String[] args) {
        //拆包/拆箱
        //自动拆箱
        Integer integer =10;
        int b=integer;
        //输出结果为10
        System.out.println(b);

        //显示拆箱
        //调用intValue方法
        int c=integer.intValue();
        //输出结果为10
        System.out.println(c);
    }

    public static void main3(String[] args) {
        //装包/装箱
        int a = 10;
        //显示装包
        Integer integer1 = new Integer(a);
        //输出结果为10
        System.out.println(integer1);
        //显示装包
        Integer integer2 = Integer.valueOf(a);
        //输出结果为10
        System.out.println(integer2);
        //自动装包 其实程序内部也是调用了Integer.valueof方法
        Integer integer3 = a;
        //输出结果为10
        System.out.println(integer3);
    }

}
