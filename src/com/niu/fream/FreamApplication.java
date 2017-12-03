package com.niu.fream;

import com.niu.winding.Windind_quick;

/**
 *
 * 主函数，各种功能的启动类
 *
 * @author 牛浩轩
 * @version 2017年6月27日
 * @see FreamApplication
 * @since
 */
public class FreamApplication {
    public static void main(String[] args) {
        /**
         * 迭代计算文本中的“A”
         */
        //System.out.println(new Iteration().countA("AoefkopsemfIJIOAAA"));

        /**
         * 递归计算文本中的“A”
         */
        //System.out.println(new Iteration().countB("AAA rating"));

        /**
         * 提示用户输入一个非负整数，然后显示这个非负整数的阶乘
         */
        //new Factorial().result();

        /**
         * 提示用户输入下标，计算与这个下标相适应的斐波那契数列
         */
        //new RabbitsSequence().result();

        /**
         * 检测字符串是否为回文
         */
        //new Windind().result();
        new Windind_quick().result();
    }
}
