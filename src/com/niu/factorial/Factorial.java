package com.niu.factorial;

import java.util.Scanner;


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
