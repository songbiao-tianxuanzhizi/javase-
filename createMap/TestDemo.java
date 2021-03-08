package createMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SongBiao
 * @Date 2021/1/18
 */
public class TestDemo {
    public static void main(String[] args) {
        //Map<K,V>
        Map<String, String> map = new HashMap<>();
        map.put("玄奘", "唐僧");
        map.put("及时雨", "宋江");
        map.put("国民女神", "高圆圆");
        //注意此处修改了同一个key所对应的value值,即当key重复时，value值会改变
        map.put("及时雨", "宋江2");


        //key和value都可以put一个null
        map.put(null, null);

        //存放的顺序  不一定就是打印的顺序 因为在往map当中存储元素的时候。不是按照顺序存放
        //他有一定的方式去存放，这个方式就是使用哈希函数进行映射
        //输出结果为{null=null, 国民女神=高圆圆, 玄奘=唐僧, 及时雨=宋江2}
        System.out.println(map);

        //get方法，返回 key 对应的 value
        String ret = map.get("玄奘");
        //输出结果为唐僧
        System.out.println(ret);

        //getOrDefault方法，返回 key 对应的 value，若key 不存在，返回默认值
        String ret1 = map.getOrDefault("玄奘2", "5555");
        //返回结果为默认值5555
        System.out.println(ret1);


        //keyset方法，返回所有 key 的不重复集合
        //Set为集合，里面不能存放相同元素
        Set<String> set = map.keySet();
        //输出结果为[null, 国民女神, 玄奘, 及时雨]
        System.out.println(set);


        //entrySet()方法返回所有的 key-value 映射关系

        //entrySet()方法的返回值为 Set<Map.Entry<String, String>>
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        //key-value 映射关系所对应的数据类型为Map.Entry<String, String>，所以在这里遍历输出映射关系时可以用for循环
        /*
        输出结果为：
         null null
        国民女神 高圆圆
        玄奘 唐僧
        及时雨 宋江2
         */
        for (Map.Entry<String, String> entry : set2) {
            //getKey方法和getValue方法为返回entry中每个映射关系所对应的key和value
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        //key也可以为String类型，value也可以为整数类型（其他基本数据类型均可）
        HashMap<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


    }
}
