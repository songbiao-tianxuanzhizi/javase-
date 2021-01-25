
public class Hello {//在一个java文件中只能有一个公共类，且此公共类的名字一定要和文件名相同/

      /**
       * 整形int4个字节，不区分多少位机器，int的取值范围为-2147483648---
       * java中int既可以表示正数，也可以表示负数，其不存在无符号数据类型
       * 标识符：字母，数字，下划线，
       * int的包装类为Integer------int的plus版本
       * int在定义变量且赋值的时候，不能给一个超过其范围的数据，这题体现了java的安全性
       * 当变量在定义的时候没有初始化，则一定要在使用的时候初始化，否则便会编译错误
       */
      public static void main1(String[] args) {
            //int a=2147483648;此处代码会报错的原因是此时给a所赋的值超过了其取值范围
            /*int a;
            System.out.println(a);此段代码直接编译错误，因为java是非常安全的，*/



            System.out.println(Integer.MAX_VALUE);//int的包装类为Integer,结果为2147483647(2^31-1)，即取值范围的最右端
            System.out.println(Integer.MIN_VALUE);//结果为-2147483648(-2^31)，即取值范围的最左端
            System.out.println(Integer.MAX_VALUE + 1);/*结果为-2147483648，因为加1后相当于一个圆回到了取值范围的最小值,
                                                      系统在进行编译时并不知道MAX_VALUE的具体值是多少，所以当其加1时虽然明面上
                                                       其已经越界了，但是输出是没有问题的.*/


            System.out.println(Integer.MIN_VALUE - 1);//2147483647，因为减1后相当于一个圆回到了取值范围的最大值

            int e = Integer.MAX_VALUE;
            e++;//此e最后输出的结果为-2147483648
            e += 1;//此e最后输出的结果为-2147483648
            System.out.println(e);

      }

      /**
       * 讲解的是长整型以及字符串和数据类型的拼接
       * long占8个字节(-2^63-2^63-1)
       * long的包装类为Long
       */
      public static void main2() {
            long a = 10L;//一般不写小写的l，会与大写L混淆
            System.out.println("a的值是" + a);
            System.out.println("a的最大值是" + Long.MAX_VALUE);//拼接，长整型的最大值的取值范围
            System.out.println("a的最小值是" + Long.MIN_VALUE);//长整型最小值的取值范围，长整形的包装类为Long
            int a1 = 10;
            int b = 5;
            System.out.println(a + b);
            System.out.println("hhhh" + a + b);//拼接因为有了字符串,任何类型的数据和字符串进行拼接结果就是字符串
            System.out.println("a+b的和为" + (a + b));
            System.out.print(a1);//此处没有换行，只是打印
            System.out.println(b);//打印且换行
      }


      /**
       * 单精度 浮点型
       * float 占4个字节
       * float的包装类为Float
       */
      public static void main3(String[] args) {
            float f = 12.3f;/*12.3默认是double类型，而此时将double类型不能赋给float类型，
                            因为double类型是八个字节，而float类型是四个字节，将八个字节赋给四个字节，会编译错误，体现了java的安全性
                            此外Java是一个强类型语言，C语言是一个弱类型语言，
                            这也是为什么将double类型赋值给float类型时c语言只会给出警告而java会编译错误的原因*/

            System.out.println(Float.MAX_VALUE);//float的包装类为Float
            System.out.println(Float.MIN_VALUE);
      }


      /**
       * 双精度 浮点型
       * double 占8个字节
       * double的包装类为Double
       * 在真正的程序设计中没有精确的小数，他都是有精度的
       */
      public static void main(String[] args) {
            //在写项目时，遇到小数一般用双精度类型
            double b1 = 12.5;//12.5默认是双精度类型，所以才能将12.5赋值给b1
            System.out.println(b1);
            System.out.println(Double.MAX_VALUE);//double的包装类为Double
            System.out.println(Double.MIN_VALUE);
            int a = 1, b = 2;
            System.out.println(a / b);//输出结果为0
            System.out.println(a % b);//输出结果为1
            double c = 3.0, d = 8.0;
            System.out.println(c / d);///输出结果为0.375

            double e = 1.1;
            System.out.println(e * e);//输出结果为1.2100000000000002，因为小数一般没有精确值，只有精度，所以结果为此值
            System.out.printf("%.2f", e * e);//输出结果为小数点后两位，并用printf方法进行输出，输出结果为1.21
      }


      /**
       * 字符数据类型
       * char 2个字节 取值范围为0-65535
       * char为两个字节，那么就可以给其定义一个汉字，因为汉字也为2个字节
       * Unicode-->包含了很多新的。例如中文等
       * char类型的包装类为Character
       */
      public static void main5(String[] args) {
            char ch = 'a';
            System.out.println(ch);//输出结果为a
            char ch1 = 97;
            System.out.println(ch1);//输出结果为a，其找到是97这个十进制数字所对应的字符(Unicode表 )
            char ch2 = '高';
            System.out.println(ch2);//输出结果为高，汉字为2个字节

      }


      /**
       * 字节数据类型 byte 1个字节 取值范围为-128--->+127
       * byte的包装类为Byte
       * 一般来说四个字节以下的数据类型会进行整形的提升
       */
      public static void main6(String[] args) {
            //byte o=128;//出错
            byte b = 12;
            byte c = 21;
            byte a = Byte.MAX_VALUE - 1;//此时没有出错是因为a的值为126，因为126在byte的范围内，所以没有出错

            /*byte d=b+c;此句子会发生错误的原因是虽然b与c本身是byte，由于计算机的 CPU 通常是按照 4 个字节为单位从内存中读写数据.
            为了硬件上实现方便, 诸如 byte 和 short 这种低于 4 个字节的类型, 会先提升成 int, 再参与计算.
             所以此时等式的右边是变成了int类型，而将int类型赋给byte类型的时候会报错*/
            //若要使上式正确，则应该将等式右边进行强制类型转换或者将左边改成int类型
            byte d = (byte) (b + c);
            System.out.println(d);//此时输出的结果为33

            System.out.println(Byte.MAX_VALUE);//输出结果为127
            System.out.println(Byte.MIN_VALUE);//输出结果为-128


            /*byte d=Byte.MAX_VALUE+1;此句的错误原因在于左边是byte类型，而右边是int类型（因为MAX_VALUE+1此时值为
             128，而128此时已经超过了byte的取值范围变成了int类型,发生了整形的提升），所以当int类型赋给byte类型时会编译错误*/

            System.out.println(Byte.MAX_VALUE + 1);/*输出结果为128,因为println的输出方法中默认是以整形进行打印的，
                                                   而当MAX_VALUE等于127加1等于128，此时byte类型进行了整型提升
                                                   变成了int类型，所以结果不再是-128，而是+128*/
            System.out.println(Byte.MIN_VALUE - 1);/*因为println的输出方法中默认是以整形进行打印的，
                                                   而当MAX_VALUE等于127加1等于128，此时byte类型进行了整型提升
                                                   变成了int类型，所以结果不再是-128，而是-129*/

            byte f = 127;
            f++;//此f最后的单独输出结果为-128，并不会进行自动类型转换
            f += 1;//此f最后的单独输出结果为-128，并不会进行自动类型转换，+=为复合运算符


            final byte g=10;
            final byte h=20;//因为final常量是在编译时期确定的，所以byte l=g+h就等价于byte l=30，然后30并未超出byte的取值范围，故不会报错
            byte l=g+h;

      }


      /**
       * 短整型：short  2个字节 取值范围为-32768-32767
       * short的包装类为Short
       */
      public static void main7(String[] args) {
            System.out.println(Short.MAX_VALUE);//输出结果为d32767
            System.out.println(Short.MIN_VALUE);//输出结果为-32768

            /*short e=Short.MAX_VALUE+1;此句子有错误，原因是当Short.MAX_VALUE+1后已经超出了short的取值范围，所以
            等式右边会转换到int类型，此时 将一个int类型是不能赋值给short类型的会发生编译错误*/

            System.out.println(Short.MAX_VALUE + 1);//输出结果为32768
            System.out.println(Short.MIN_VALUE - 1);//输出结果为-32769
      }

      /**
       * 布尔类型  没有明确的大小
       * 在Java当中boolean类型只有两个取值，一个true，一个false
       * 在Java当中没有所谓的0是假，非0是真，真只有true,假只有false
       * boolean的包装类为Boolean
       */
      public static void main8(String[] args) {
            boolean ch = true;
            System.out.println(ch);//输出结果为true

      }



//以上为java当中的八种基本的数据类型










//以下String为java中的引用数据类型,
/**
 * 字符串数据类型 String
 * +号，表示任何类型的数据和字符串进行拼接后最终都为字符串
 */

        public static void main9(String[] args) {
          String ch="helloworld";
          System.out.println(ch);//输出结果为helloworld
          String ch1="\"helloworld\"";//转义字符\
          System.out.println(ch1);//输出结果为“helloworld”

}



      /**
       * 常量：1：字面常量 2：final定义的常量
       * 常量：即在程序运行过程中不可改变的量
       *final定义的常量只初始化一次，且使用的时候，一定要记得初始化
       * @param args
       */
      public static void main10(String[] args) {
              final int MAXNUM=99;//已经初始化了
              //int MAXNUM=999;因为第一个MAXNUM已经初始化了，所以此处不可以在进行初始化
             System.out.println(MAXNUM);//此处的输出结果为99

            final int MAXNUM1;//此处先不进行初始化
            //System.out.println(MAXNUM1);此句子编译错误的原因是MAXNUM1未进行初始化
      }

      /**
       *标识符：由字母，数字，下划线，美元符号组成，一般不以下划线，美元符号开头或者结尾，即合法不合理，编译也是可以通过的
       * java中定义变量的时候一般以小驼峰命名，例如maxNum,且不能以数字开头
       * @param args
       */

      /**
       * 数据类型转换
       *
       */

      public static void main13(String[] args) {
            int a=10;
            long b=a;
            System.out.println(b);//隐形类型转换，即把一个小类型数据（字节数小）给大类型数据（字节数大），输出结果为10

            long d=30L;
            int c=(int)d;//此处为显性类型转换，即将一个大类型数据(字节数大)赋给小类型数据（字节数小），则此时必须进行强制类型转换
            System.out.println(c);//输出结果为30

            int e=10;
            //boolean f=e;boolean类型的数据变量不能跟int进行相互赋值，所以此处会报错

            int f=10;
            double g=f;
            System.out.println(g);//此处为隐形类型转换，输出结果为10.0

            double h=10.0;
            int i=(int)h;//此处为显性类型转换，必须进行强制类型转换，否则会编译错误
            System.out.println(i);//输出结果为10

            int j=10;
            long k=20;
            int l=(int)(j+k);
            long m=j+k;
            System.out.println(m);
            System.out.println(l);


            //int和String之间的类型转换
            int num=20;
            String str=num+"";//方法一：可为一个数字加上一个空的字符串，这样这个数字最后变成了字符串
            String str2=String.valueOf(num);//方法2：用valueOf方法将一个int类型转变成为String类型
            int n=str2.length();
            System.out.println(str);
            System.out.println(n);//输出字符串的长度为2


            String str3="30";
            int o=Integer.parseInt(str3);//用parseInt方法将字符串参数解析为带符号的十进制整数
            System.out.println(o);//输出结果为30

     

      }

}

