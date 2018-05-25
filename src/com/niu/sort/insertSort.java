package com.niu.sort;

import java.util.Arrays;

/**
 * Description:插入排序——直接插入排序
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/24.
 */
public class insertSort {

    public void insertSort(int a[]){
        for (int i = 1; i < a.length ;i++){
            if (a[i] < a[i-1]){
                int j = i-1;
                int x = a[i];
                a[i] = a[i-1];
                while (x < a[j]){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = x;
            }
        }
    }

    public void sortTest(int a[]){
        Arrays.sort(a);
    }

}
