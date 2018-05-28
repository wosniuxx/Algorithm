package com.niu.io.bytetype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class CopyPic {

    public static void main(String[] args) {
        copyBmp();
        System.out.println("success!");
    }

    public static void copyBmp(){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\test\\io\\2.png");
            out = new FileOutputStream("D:\\test\\io\\3.png");
            byte[] copy = new byte[1024];
            while(in.read(copy) != -1){
                System.out.println(new String(copy));
                out.write(copy);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("error!");
        } finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
