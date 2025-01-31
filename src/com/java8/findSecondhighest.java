package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findSecondhighest {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12,34,56,67,43,23,22);
        Integer i = li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);
    }
}
