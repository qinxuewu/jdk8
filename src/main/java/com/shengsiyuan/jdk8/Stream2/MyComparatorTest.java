package com.shengsiyuan.jdk8.Stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/5/3
 * @desciption
 */
public class MyComparatorTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao","hello","world","welcome");

       // Collections.sort(list);
       // Collections.sort(list,(item1,item2) -> item1.length() - item2.length());
        //Collections.sort(list,(item1, item2) -> item2.length() - item1.length());
       // Collections.sort(list,Comparator.comparingInt(String::length).reversed());
        Collections.sort(list,Comparator.comparingInt((String item) -> item.length()).reversed());
        System.out.println(list);
    }
}