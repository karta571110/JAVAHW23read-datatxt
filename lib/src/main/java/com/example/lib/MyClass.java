package com.example.lib;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String args[]){
        try {
            File data=new File("data.txt");
            FileInputStream readin=new FileInputStream(data);
            InputStreamReader read=new InputStreamReader(readin,"UTF-8");  //引數 in物件通過 InputStream in = System.in;獲得。//讀取鍵盤上的資料。
            BufferedReader bufferedReader=new BufferedReader(read);
            String oneLine=null;
            while ((oneLine=bufferedReader.readLine() )!= null){
                System.out.println(oneLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("讀取出錯");
            e.printStackTrace();
        }
    }

}
