package com.niu.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description:
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\test\\io\\1.txt");
        BufferedReader bfr = new BufferedReader(fr);

        for(;;){
            String s = bfr.readLine();
            if (s == null){
                break;
            }
            System.out.println(s);
        }

        bfr.close();
        fr.close();
    }

}
