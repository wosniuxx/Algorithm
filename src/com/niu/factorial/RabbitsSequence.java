package com.niu.factorial;

import java.util.Scanner;

/**
 * 
 * �������У�����쳲��������У�Fibonacci sequence��
 * ��ʾ�û������±꣬����������±�����Ӧ��쳲���������
 * 
 *
 * @author ţ����
 * @version 2017��6��27��
 * @see RabbitsSequence
 * @since
 */
public class RabbitsSequence {
    public void result(){
        System.out.println("������һ���±�");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long begin = System.currentTimeMillis();
        System.out.println(num + "����������ֵΪ��" + rabbits(num));
        long end = System.currentTimeMillis() - begin;
        System.out.println("��ʱ��" + end + "����"); 
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
