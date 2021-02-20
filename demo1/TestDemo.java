package com.bit.demo1;


import com.bit.demo.LeiHeDuiXiang;

class Person{
    protected String name;
}
class Person2 extends Person{
    //体现出protected所修饰的实例成员变量name可以在同一个包中的不同类进行访问
    public void print(){
        System.out.println(this.name+"打印物品");
    }
}
public class TestDemo {
    public static void main(String[] args) {

       /*
        因为b为别的包中权限为默认权限的实例成员变量，所以其不能在其他包中的类中进行访问
        而LeiHeDuiXiang为其他包中权限为public的类，所以其虽然为其他包中的类，
        但是仍可以在此进行对象的实例化，且并不会报错
        */
        LeiHeDuiXiang p = new LeiHeDuiXiang();
        /*
        因为b为别的包中权限为默认权限的实例成员变量，所以其不能在其他包中的类中进行访问
        System.out.println(p.b);
         */


    }
}
