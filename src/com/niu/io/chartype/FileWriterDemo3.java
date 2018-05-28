package com.niu.io.chartype;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:示例3：对已有文件的数据进行续写
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class FileWriterDemo3 {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\test\\io\\1.txt", true);
            fw.write("\ntest hello world5");
            fw.close();

            FileReader fr = new FileReader("D:\\test\\io\\1.txt");
            char[] buf = new char[128];
            int num = 0;
            while ((num = fr.read(buf)) != -1){
                sop(new String(buf));
            }
            sop('\n');
        } catch (IOException e) {
            sop(e.toString());
        }

    }

    private static void sop(Object obj) {
        System.out.println(obj);
    }
}
