package com.niu.iteration;
/**
 * 
 * ����������������ı����ַ���A���ĸ���
 *
 * @author ţ����
 * @version 2017��6��26��
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
     * �ݹ顪����������ı����ַ���A���ĸ���
     *
     * @author ţ����
     * @version 2017��6��26��
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


