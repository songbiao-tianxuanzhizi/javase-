package createSet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SongBiao
 * @Date 2021/1/18
 */
public class CreateSet {
    public static void main(String[] args) {
        //set中不能存储相同的元素
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(2);
        set.add(21);
        set.add(12);
        set.add(null);
        //输出结果为[null, 2, 21, 10, 12]，说明set也是一个无序的集合
        System.out.println(set);
    }
}
