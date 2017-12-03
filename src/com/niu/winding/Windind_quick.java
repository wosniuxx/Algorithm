package com.niu.winding;

import java.util.Scanner;

public class Windind_quick {

    public void result(){
        System.out.println("输入值");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        windind(str);
    }
    
    public boolean windind(String str){
        return windind(str, 0, str.length() - 1);
    }
    
    public boolean windind(String str, int low, int high){
        if(high <= low){
            System.out.println("当小于是");
            return true;
        }else if (str.charAt(low) != str.charAt(high)) {
            System.out.println("当大于时");
            return false;
        }else {
            return windind(str, low + 1, high - 1);
        }
    }
    
}
