package com.niu.factorial;

import java.util.Scanner;

/**
 * 
 * ��ʾ�û�����һ���Ǹ�������Ȼ����ʾ����Ǹ������Ľ׳�
 *
 * @author ţ����
 * @version 2017��6��27��
 * @see Factorial
 * @since
 */
public class Factorial {
    public void result(){
        Scanner input = new Scanner(System.in);
        System.out.println("������һ���Ǹ�����");
        int num = input.nextInt();
        System.out.println(num + "�Ľ׳��ǣ�" + multiplication(num));
    }
    
    public long multiplication(int n){
        if(n == 0){
            return 1;
        }else{
            return n * multiplication(n - 1);
        }
    }
}
