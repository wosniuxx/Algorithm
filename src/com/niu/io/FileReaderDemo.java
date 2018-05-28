package com.niu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        //characters();
        singleReader();
        try {
            FileWriter fw = new FileWriter("D:\\test\\io\\1.txt", true);
            fw.write("test hello world");
            fw.close();
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        characters();
    }

    //按照行数读取
    public static void characters(){
        try {
            FileReader fr = new FileReader("D:\\test\\io\\1.txt");
            char[] buf = new char[128];
            int num = 0;
            while ((num = fr.read(buf)) != -1){
                sop(new String(buf, 0, num));
            }
            sop('\n');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            sop(e.toString());
        }
    }

    //按照单个字符读取
    public static void singleReader(){
        try {
            FileReader fr = new FileReader("D:\\test\\io\\1.txt");
            int ch = 0;
            while((ch = fr.read()) != -1){
                sop((char)ch);
            }
            sop('\n');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private  static void sop(Object obj){
        System.out.print(obj);
    }
}
