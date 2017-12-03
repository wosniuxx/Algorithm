package com.niu.winding;

import java.util.Scanner;

/**
 *
 * 回文递归，回文即“mom,dad”类型
 * 问题描述：检测字符串是否为回文
 *
 * @author 牛浩轩
 * @version 2017年6月28日
 * @see Windind
 * @since
 */
public class Windind {

    /**
     *
     * Description:输入操作
     *  void
     *
     * @see
     */
    public void result(){
        System.out.println("请输入接受判断的字符串");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        windind(str);
    }

    /**
     *
     * Description:递归实现
     *
     *@param str
     *@return boolean
     *
     * @see
     */
    public boolean windind(String str){
        if(str.length() <= 1){
            System.out.println("该字符串检测完毕，是回文！");
            return true;
        }else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            System.out.println("该字符串检测完毕，不是回文！！！");
            return false;
        }else {
            return windind(str.substring(1, str.length() - 1));
        }
    }

}