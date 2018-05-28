package com.niu.io.bytetype;

import java.io.*;

/**
 * Description:复制媒体文件
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class BufferedCopyDemo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        copy1();
        long end = System.currentTimeMillis();
        System.out.println("时间:"+(end-start)+"ms");
    }

    public static void copy1(){
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream("D:\\test\\io\\2.png"));
            out = new BufferedOutputStream(new FileOutputStream("D:\\test\\io\\3.png"));
            byte[] copy = new byte[1024*4];
            while(in.read(copy) != -1){
                out.write(copy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
