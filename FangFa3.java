public class FangFa3 {
    //重载和重写的区别
    //重载的注意事项：
    /*
    1.方法名相同
    2.参数的个数类型不能相同
    3.返回值不做要求
    注意：只有在同一个类中方法才能发生重载
     */
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }
    public static double sum(double x,double y,double z){
        return x+y+z;
    }
    public static float sum(float x,float y,float z){
        return x+y+z;
    }

    /**
     * 可变参数编程
     * 传过来的数据可以看作是一个数组
     * 局限性：int...array传过来的一组数据，一定都是相同的数据类型

     */
    public static int sum(int... array){//只能是三个点
        int ret=0;
        for(int x:array){//for each循环，x中存放的是array中的整形数据
            ret+=x;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));

    }
}
