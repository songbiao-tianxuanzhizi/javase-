package connectionCreate;

import java.util.*;

/**
 * @author SongBiao
 * @Date 2021/1/18
 */
public class CreateConnection {
    public static void main2(String[] args) {
        //Map<K,V>
        Map<String,String> map = new HashMap<>();
        map.put("玄奘","唐僧");
        map.put("及时雨","宋江");
        map.put("国民女神","高圆圆");
        //注意此处修改了同一个key所对应的value值
        map.put("及时雨","宋江2");
        //存放的顺序  不一定就是打印的顺序 因为在往map当中存储元素的时候。不是按照顺序存放
        //他有一定的方式去存放，这个方式就是使用哈希函数进行映射
        //输出结果为{国民女神=高圆圆, 玄奘=唐僧, 及时雨=宋江2}
        System.out.println(map);


        //get方法
        String ret = map.get("玄奘");
        //输出结果为唐僧
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        Collection<Integer> connection=new ArrayList<>();
        connection.add(1);
        System.out.println(connection);
        connection.clear();
        System.out.println(connection);
    }
}
