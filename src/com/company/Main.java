package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\GB_attempt2\\myProjects\\untitled\\src\\com\\company\\demo.txt"))) {
            int x;
            while ((x = in.read()) > -1) {
                System.out.print((char) x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File file = new File("D:\\GB_attempt2\\myProjects\\untitled\\src\\com\\company\\demo1.txt");
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\GB_attempt2\\myProjects\\untitled\\src\\com\\company\\demo1234.txt"));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(in.readAllBytes());
            System.out.println(in.hashCode());
            System.out.println(in.readNBytes(5));
        }catch (Exception e) {
            e.printStackTrace();
            ExceptionLogger.logException(e,"D:\\GB_attempt2\\myProjects\\untitled\\src\\com\\company\\log.txt" );
        }
    }
}
