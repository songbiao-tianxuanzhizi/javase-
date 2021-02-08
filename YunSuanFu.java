public class YunSuanFu {
    public static void main(String[] args) {
        //+，-，*，/运算符
        System.out.println("------------------------------------------------------------------------");
        System.out.println(4 / 8.0);
        System.out.println(10 % 3);
        System.out.println(11.5 % 2.0);//java中不同于c语言的是此处可以进行小数的取余

        /*System.out.println(8/0);会抛出异常
        System.out.println("dd");当前面出现了异常后，此段及以后的代码便不会在执行了*/

        System.out.println("------------------------------------------------------------------------");
        //++，--运算符
        int a = 10;
        a = a++;
        System.out.println(a);//在c语言中此时a输出的值为11，但是在java中输出的值为10，原因是java的反汇编原理
        int o=10;
        int l=o++;
        System.out.println(l);
        int t=10;
        int p=++t;
        System.out.println(p);
        System.out.println("------------------------------------------------------------------------");
        //布尔表达式
        int b = 10;
        int c = 20;

        System.out.println(!(b >= c));//逻辑非在c语言中!后面可以加上整数，而在java中其后面只能加上布尔表达式，输出结果为true
        System.out.println(b == c);//false

        System.out.println(b != c);//true

        System.out.println(b < c);//true

        System.out.println(b > c);//false

        System.out.println(b <= c);//true

        System.out.println(b >= c);//false

        System.out.println("------------------------------------------------------------------------");
        //逻辑运算符
        //逻辑与：布尔表达式1&&布尔表达式2&&布尔表达式3...,当所有布尔表达式都为真才是真，只要有一个为假整体就为假
        //逻辑或：布尔表达式1||布尔表达式2||布尔表达式3...只要其中一个布尔表达式为真整体为真，所有布尔表达式为假便为假
        System.out.println(10 > 20 && 10 / 0 == 0); // 打印 false，短路与
        System.out.println(10 < 20 || 10 / 0 == 0); // 打印 true，短路或

        System.out.println("------------------------------------------------------------------------");
        //条件运算符(?)
        boolean flg = true ? true == true ? false : true : false;//最终结果为false
        System.out.println(flg);

    }
}
