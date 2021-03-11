package Genetic;

/**
 * @author SongBiao
 * @Date 2021/1/18
 * 不用泛型的书写方式
 */
//顺序表
class MyArrayList1 {
    //定义一个Object类型的数组
    public Object[] elem;
    public int usedSize;

    public MyArrayList1() {
        this.elem = new Object[10];
    }

    public void add(Object data) {
        this.elem[this.usedSize] = data;
        usedSize++;
    }

    public Object get(int pos) {
        return this.elem[pos];
    }
}

public class TestDemo {
    public static void main(String[] args) {

        MyArrayList1 myArrayList = new MyArrayList1();
        //什么类型都可以放到数组里
        myArrayList.add(19);
        myArrayList.add(20);
        myArrayList.add("sdsd");
        //缺点：取数据的时候需要强制类型转换
        int a=(int)myArrayList.get(1);
        System.out.println(a);
    }
}
