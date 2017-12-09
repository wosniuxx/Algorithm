package com.niu.factorial;

import java.util.Scanner;

/**
 *
 * 提示用户输入一个非负整数，然后显示这个非负整数的阶乘
 *
 * @author 牛浩轩
 * @version 2017年6月27日
 * @see Factorial
 * @since
 */
public class Factorial {
    public void result(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个非负整数");
        int num = input.nextInt();
        System.out.println(num + "的阶乘是：" + multiplication(num));
    }

    
    public long multiplication(int n){
        if(n == 0){
            return 1;
        }else{
            return n * multiplication(n - 1);
        }
    }
}
