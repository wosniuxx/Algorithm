package com.niu.fream;

import com.niu.factorial.Factorial;
import com.niu.factorial.RabbitsSequence;
import com.niu.iteration.Iteration;
import com.niu.winding.Windind;

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
        //new Factorial().result();
        
        /**
         * ��ʾ�û������±꣬����������±�����Ӧ��쳲���������
         */
        //new RabbitsSequence().result();
        
        /**
         * ����ַ����Ƿ�Ϊ����
         */
        new Windind().result();
    }
}
