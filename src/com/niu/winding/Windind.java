package com.niu.winding;

import java.util.Scanner;

public class Windind {


    public void result(){
        System.out.println("输入值");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        windind(str);
    }
    
    public boolean windind(String str){
        if(str.length() <= 1){
            System.out.println("如果长度小于1");
            return true;
        }else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            System.out.println("长度大于一");
            return false;
        }else {
            return windind(str.substring(1, str.length() - 1));
        }
    }
    
}
