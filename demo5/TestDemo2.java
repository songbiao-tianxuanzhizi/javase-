package com.bit.demo5;

import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 *    接口的使用实例：
 *    一般情况下：自定义类型若要进行比较需要是可比较的类型，同时也必须实现Comparable接口或者Comparator接口，
 *    Comparable   Comparator  有区别的！！！
 * @author SongBiao
 * @Date 2021/1/18
 */

//自定义类型比较大小需要实现Comparable接口，<>为泛型
class Students implements Comparable<Students> {
    public String name;
    public int age;
    public int score;

    public Students(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    //因为此时实现了Compareable接口，则需要重写其内部的抽象方法compareTo
    @Override
    public int compareTo(Students o) {
        //通过分数来进行排序，如果想通过年龄等直接修改score替换成age即可
        if(this.score > o.score) {
            return 1;
        }else if(this.score == o.score) {
            return 0;
        }else {
            return -1;
        }
    }
}
public class TestDemo2 {

    public static void main(String[] args) {
        //如果想要对Student类的引用进行大小比较，就需要Student类去实现Comparable接口
        Students student1 = new Students("bit",18,79);
        Students student2 = new Students("gao",29,70);
        Students student3 = new Students("shasha",17,99);
        /*if(student1.compareTo(student2) < 0) {
            System.out.println("student1的年龄 < student2");
        }*/

        Students[] students ={new Students("bit",18,79), new Students("gao",29,70),
                new Students("shasha",17,99)};
       // Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        //sort方法默认从小到打排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        int[] array = {12,4,89,43,56};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int a = 10;
        int b = 20;
        if(a > b) {

        }
    }
}
