package com.niu.winding;

import java.util.Scanner;

/**
 * 
 * ���ĵݹ飬���ļ���mom,dad������
 * ��������������ַ����Ƿ�Ϊ����,���װ�
 *
 * @author ţ����
 * @version 2017��6��28��
 * @see Windind
 * @since
 */
public class Windind_quick {

    /**
     * 
     * Description:������� 
     *  void
     *
     * @see
     */
    public void result(){
        System.out.println("����������жϵ��ַ���");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        windind(str);
    }
    
    /**
     * 
     * Description:�ݹ鸨���������������ɵ����ַ������������Ч�� 
     * 
     *@param str
     *@return boolean
     *
     * @see
     */
    public boolean windind(String str){
        return windind(str, 0, str.length() - 1);
    }
    
    /**
     * 
     * Description:�ݹ�ʵ�� 
     * 
     *@param str
     *@return boolean
     *
     * @see
     */
    public boolean windind(String str, int low, int high){
        if(high <= low){
            System.out.println("���ַ��������ϣ��ǻ��ģ�");
            return true;
        }else if (str.charAt(low) != str.charAt(high)) {
            System.out.println("���ַ��������ϣ����ǻ��ģ�����");
            return false;
        }else {
            return windind(str, low + 1, high - 1);
        }
    }
    
}
