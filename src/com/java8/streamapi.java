package com.java8;

import java.util.Arrays;
import java.util.List;

public class streamapi
{
    public static void main(String[] args) {

        System.out.println("java 8");

        List<Integer> li= Arrays.asList(1,3,5,76,5,4,3,22);
        li.stream().filter(e->e%2!=0).forEach(System.out::println);
    }

}
