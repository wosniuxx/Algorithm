package com.niu.factorial;

import java.util.Scanner;

/**
 * 兔子数列，又名斐波那契数列（Fibonacci sequence）
 * 提示用户输入下标，计算与这个下标相适应的斐波那契数列
 *
 *
 * @author 牛浩轩
 * @version 2017年6月27日
 * @see RabbitsSequence
 * @since
 */
public class RabbitsSequence {
    public void result(){
        System.out.println("请输入一个下标");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long begin = System.currentTimeMillis();
        System.out.println(num + "的兔子数列值为：" + rabbits(num));
        long end = System.currentTimeMillis() - begin;
        System.out.println("耗时：" + end + "豪秒");
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
