package com.lqx;

import java.util.*;

public class traversMap {
    private static HashMap<String,Object> hashMap = new HashMap<>();

    static {
        hashMap.put("name","zhangsan");
        hashMap.put("age","20");
        hashMap.put("sex","male");
    }

    /**
     * 推荐使用entrySet()方法，效率较高。
     * 对于keySet其实是遍历了2次，一次是转为iterator，
     * 一次就是从HashMap中取出key所对于的value。
     * 而entryset只是遍历了第一次，它把key和value都放到了entry中，所以快了。
     *  两种遍历的遍历时间相差还是很明显的。
     */

    public static void main(String[] args) {
        /**
         * 方法一：使用hashMap.entrySet() 循环

        for (Map.Entry<String,Object> entry:hashMap.entrySet()){
           String key = entry.getKey();
           String value = (String) entry.getValue();
            System.out.println(key + "----->" + value);
        }*/

        /*
        方法二：使用Iterator接口遍历

        Iterator<Map.Entry<String,Object>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Object> entry = iterator.next();
            String key = entry.getKey();
            String value = (String)entry.getValue();
            System.out.println(key+"---->"+value);
        }*/

        /**
         * 方法三：使用hashMap.keySet()/
         * hashMap.value()/iterator

        Set<String> strings = hashMap.keySet();
        Collection<Object> values = hashMap.values();

        for (Iterator<String> iterator1 = strings.iterator();iterator1.hasNext();) {
            String key = iterator1.next();
            String value = (String)hashMap.get(key);
            System.out.println(key+"--->"+value);
        }

        for (Iterator i = values.iterator(); i.hasNext();) {
            String s = (String) i.next();
            //  循环输出value
            //  male
            //  zhangsan
            //  20
            System.out.println(s);
        }*/

        /**
         * 方法四：使用hashMap.keySet()
         * foreach()遍历
         */
        for (String key:hashMap.keySet()){
            String value = (String) hashMap.get(key);
            System.out.println(key+"--->"+value);
        }
    }
}
