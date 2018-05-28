package com.niu.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: BufferedWriter示例
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\test\\io\\1.txt", true);
        BufferedWriter bfw = new BufferedWriter(fw);
        for (int x = 1;x<5;x++){
            bfw.write("abc test");
            bfw.newLine();
            bfw.flush();
        }
        bfw.flush();
        bfw.close();
        fw.close();
    }

}
