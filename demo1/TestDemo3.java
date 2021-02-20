package com.bit.demo1;
//此处体现的是protected权限中不同包的子类
import com.bit.demo.TestDemo2;

public class TestDemo3 extends  TestDemo2{
    public static void main(String[] args) {
        TestDemo3 p=new TestDemo3();
        p.eat();
        System.out.println(p.b);
    }
}
