package com.niu.iteration;
/**
 * 
 * 迭代——计算给定文本内字符“A”的个数
 *
 * @author 牛浩轩
 * @version 2017年6月26日
 * @see Iteration
 * @since
 */
public class Iteration {
    public int countA(String str){
        if(str == null || str.length() == 0){
            return 0;
        }
        
        int count = 0;
        for(int i=0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("A")){
                count++;
            }
        }
        return count;
    }
    
    
    /**
     * 
     * 递归——计算给定文本内字符“A”的个数
     *
     * @author 牛浩轩
     * @version 2017年6月26日
     * @see Recursion
     * @since
     */
    public int countB(String str){
        if(str == null || str.length() == 0){
            return 0;
        }
        int count = 0;
        if(str.substring(0, 1).equals("A")){
            count = 1;
        }
        return count + countB(str.substring(1));
    }
}


