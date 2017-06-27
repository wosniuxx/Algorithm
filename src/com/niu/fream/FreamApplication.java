package com.niu.fream;

import com.niu.iteration.Iteration;

public class FreamApplication {
    public static void main(String[] args) {
        /**
         * 迭代计算文本中的“A”
         */
        System.out.println(new Iteration().countA("AoefkopsemfIJIOAAA")); 
        
        /**
         * 递归计算文本中的“A”
         */
        System.out.println(new Iteration().countB("AAA rating"));
    }
}
