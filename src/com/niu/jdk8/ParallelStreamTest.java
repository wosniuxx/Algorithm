package com.niu.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @description: ${description}
 * @author: Niu Haoxuan
 * @create: 2018-06-13 11:06
 **/
public class ParallelStreamTest {

    public static void streamsTest(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.parallelStream()
                .forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        streamsTest();



    }

}
