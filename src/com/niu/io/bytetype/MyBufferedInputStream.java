package com.niu.io.bytetype;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description: 字节流缓冲区
 * 复制MP3文件   1.MP3 -->  2.MP3
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/28.
 */
public class MyBufferedInputStream {

    private InputStream in;

    private byte[] buf = new byte[1024*4];
    private int count = 0 , pos = 0;
    public MyBufferedInputStream(InputStream in){
        this.in = in;
    }

    public int myRead(){
        try {
            if (count == 0){
                count = in.read(buf);
                pos = 0;
                byte b = buf[pos];
                count--;
                pos++;
                return b&255;
            } else if (count > 0){
                byte b = buf[pos];
                pos++;
                count--;
                return b&0xff;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
