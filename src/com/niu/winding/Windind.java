package com.niu.winding;

import java.util.Scanner;

/**
 * 
 * ���ĵݹ飬���ļ���mom,dad������
 * ��������������ַ����Ƿ�Ϊ����
 *
 * @author ţ����
 * @version 2017��6��28��
 * @see Windind
 * @since
 */
public class Windind {

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
     * Description:�ݹ�ʵ�� 
     * 
     *@param str
     *@return boolean
     *
     * @see
     */
    public boolean windind(String str){
        if(str.length() <= 1){
            System.out.println("���ַ��������ϣ��ǻ��ģ�");
            return true;
        }else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            System.out.println("���ַ��������ϣ����ǻ��ģ�����");
            return false;
        }else {
            return windind(str.substring(1, str.length() - 1));
        }
    }
    
}
