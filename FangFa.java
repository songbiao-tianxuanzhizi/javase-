import java.util.Arrays;
import java.util.Scanner;

public class FangFa {
    public static int fac(int n){//方法还可以写在main方法后面
        int ret=1;
        for(int i=1;i<=n;i++){
            ret=ret*i;
        }
        return ret;
    }
    public static void main(String[] args) {
        //用方法实现n的阶乘相加
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数，并计算他的阶乘");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            sum+=fac(i);
        }
        System.out.println("阶乘的和为"+sum);




    }
}
