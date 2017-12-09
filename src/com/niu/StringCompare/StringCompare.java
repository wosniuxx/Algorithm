package com.niu.StringCompare;

/**
 * Description:判断一个字符串中有没有重复的字符出现
 * User: Jiao
 * Date: 2017-12-06
 * Time: 20:32
 */
public class StringCompare {

    public static void main(String[] args) {
        System.out.println(compare("abcdega"));
    }

    public static boolean compare(String str){
        if (str.length()>256) {
            return false;
        }

        boolean[] char_set = new boolean[256];
        for (int i=0; i<str.length(); i++) {
            int a = str.charAt(i);
            if (char_set[a]) {
                return false;
            }
            char_set[a] = true;
            System.out.println(char_set[a]);
        }
        return true;
    }

}
