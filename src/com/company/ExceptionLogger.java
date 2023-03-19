package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionLogger {
    public static void logException(Exception e, String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            PrintWriter printwriter = new PrintWriter(writer);
            e.printStackTrace(printwriter);
            writer.write("Произошла ошибка в строке кода " + e.getStackTrace()[0].getLineNumber() + ": " + e.toString());
            writer.write(System.lineSeparator());
            printwriter.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println("Ошибка записана в файл " + filename);
        }
    }
}
