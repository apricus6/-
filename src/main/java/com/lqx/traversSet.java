package com.lqx;

import java.util.HashSet;
import java.util.Iterator;

public class traversSet {
    private static HashSet<String> hashSet = new HashSet<>();

    static{
        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
    }

    public static void main(String[] args) {
        /*
        方法一：Iterator遍历

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        */

        /*
        方法二：增强for循环

        for (String string:hashSet){
            System.out.println(string);
        }*/

        /*set遍历不能用普通for，因为set里面存储的信息时无序的，没有索引
        for (int i=0,size=hashSet.size();i<size;i++){
            System.out.println(hashSet.getClass());
        }
         */

    }
}
