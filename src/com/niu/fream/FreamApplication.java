package com.niu.fream;

import com.niu.factorial.Factorial;
import com.niu.iteration.Iteration;

/**
 * 
 * �����������ֹ��ܵ�������
 *
 * @author ţ����
 * @version 2017��6��27��
 * @see FreamApplication
 * @since
 */
public class FreamApplication {
    public static void main(String[] args) {
        /**
         * ���������ı��еġ�A��
         */
        //System.out.println(new Iteration().countA("AoefkopsemfIJIOAAA")); 
        
        /**
         * �ݹ�����ı��еġ�A��
         */
        //System.out.println(new Iteration().countB("AAA rating"));
        
        /**
         * ��ʾ�û�����һ���Ǹ�������Ȼ����ʾ����Ǹ������Ľ׳�
         */
        new Factorial().result();
    }
}
