/**
 * 类和对象
 * 代码的封装
 *
 * @author SongBiao
 * @Date 2021/1/08
 */
class Woman {
    //代码的封装private
    private String name;
    private int age;
    public String sex;

    //this代表当前对象的引用，很多参考书上说this代表当前对象，这种说法是错误的。
    /*同时要注意以下情况:如果此时我们的形参name和实例成员变量name命名相同时，要加上this(不同也要加上，这是良好的编程习惯）
    public void setName(String  name) {
        name = name;
    }
    此时我们会发现在括号中就算输入name值，但是并没有传过来，最终name输出值为null
    正确写法：
    public void setName(String  name) {
        this.name = name;
    }
    */
    //就算形参跟实例成员变量名称不相同，也最好加上，这是一个良好的编程习惯
    public void setName(String myname) {
        this.name = myname;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }





    public void print() {
        System.out.println("name=" + this.name + " " + "age=" + this.age);
    }
}

public class LeiHeDuiXiang2 {
    public static void main(String[] args) {
        Woman person = new Woman();
        person.setName("宋彪");
        person.setAge(100);
        person.print();
    }
}
