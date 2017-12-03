package com.niu.factorial;

import java.util.Scanner;

public class RabbitsSequence {
    public void result(){
        System.out.println("结果测试");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long begin = System.currentTimeMillis();
        System.out.println(num + "结果测试" + rabbits(num));
        long end = System.currentTimeMillis() - begin;
        System.out.println("end" + end + "end");
    }
    
    public long rabbits(int n){
        if(n == 0){
            return 0;
        }else if(n == 1) {
            return 1;
        }else{
            return rabbits(n - 1)+rabbits(n - 2);
        }
    }
}
