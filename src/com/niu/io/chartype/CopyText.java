package com.niu.io.chartype;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:将的一个文件复制到其他目录。
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class CopyText {

    public static void main(String[] args) {
        characters("D:\\test\\io\\1.txt", "D:\\test\\1.txt");
    }

    public static void characters(String source, String destination){
        try {
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            char[] sub = new char[1024];
            int s = 0;
            while((fr.read(sub)) != -1){
                fw.write(new String(sub));
            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
