package com.bit.demo1;

class Grand{

}
public class TestDemo1 {
    public static void main(String[] args) {
        Person person = new Person();
        //体现出protected所修饰的实例成员变量name可以在同一个包中的不同类进行访问
        person.name = "ss";
    }
}
