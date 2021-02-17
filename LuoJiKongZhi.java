import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.Scanner;

public class LuoJiKongZhi {
    public static void main(String[] args) {
        //if分支结构
        /*int a = 10;
        if (a > 5) {//if()中必须是一个布尔表达式，此处为一个双分支结构

        } else {

        }
        int b = 10;
        if (b > 5) {
            System.out.println("1");
        }
        if (b > 6) {
            System.out.println("2");
        } else {  //悬空else  else 会和 最近的if进行匹配
            System.out.println("3");
        }*/

       /* //判断是否为闰年
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 ||
                year % 400 == 0) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }
        */


        //switch语句
        //面试问题：不能做switch的参数的数据类型 有哪些?
        //1、long   float    double    boolean
        //JDK1.5引入了枚举   switch的参数也可以是枚举，switch中可以作为参数的数有int,short,byte,char,string
       /* int a = 1;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        */

        /*while循环
        //打印1-10这10个数字
        int a=1;
        while(a<=10){//while括号中放的是布尔表达式
            三种不同的输出方式输出1-10这10个数字
            System.out.println(a);换行输出
            System.out.print(a+" ");不换行且空一格进行输出
            System.out.printf("%d ",a);格式化输出且空一格
            a++;

        }

        //计算n！
        int sum=1;
        Scanner scanner = new Scanner(System.in);2
        System.out.println("请输入一个数字，并计算他的阶乘");

        int a=scanner.nextInt();
        for(int i=a;i>=1;i--){
            sum=sum*i;
        }
        System.out.println("结果为"+sum);


        //求100-200中第一个3的倍数
        int i=100;
        while(i<=200){
            if(i%3!=0){
                i++;
                continue;
            }else{
                System.out.println(i);
            }
            break;
        }
        */


        /*
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(str);
        String str1=scanner.next();//nextline方法与next方法的区别在于使用next方法时在命令框输入时若有空格，那么空格后面的输入便不会再显示，而nextLine方法并不会
        System.out.println(str1);

        //一般在程序中nextInt方法不要写在nextLine方法前，这样当我们在命令框中输入一个整数后便会结束，根本不会有字符串的输入
        int a=scanner.nextInt();
        String str2=scanner.nextLine();//此行并不会执行*/

        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int num = 0;
        while (sc.hasNextDouble()) {
            double tmp = sc.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / num);
        sc.close();
    }
}

