public class FangFa1 {
    public static int add(int x,int y){//每一个方法都要在栈上开辟内存，栈的特点是先进后出，由高地址指向低地址增长
        return x+y;
    }
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(add(x,y));
    }
}
