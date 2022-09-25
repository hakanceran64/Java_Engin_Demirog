/*
 * @File: ReadingFileDemo.java
 * @Authors: Hakan CERAN, Engin DEMİROĞ
 * @Date: 26.09.2022
 * @Content: Reading File Exception Handling
 * @Notes:
 */

package exception_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileDemo {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader sayilarTXT = new FileReader("src/exception_handling/sayilar.txt");
            bufferedReader = new BufferedReader(sayilarTXT);
        } catch (FileNotFoundException exception) {
            System.out.println("File not found exception");
        } finally {
            bufferedReader.close();
        }
    }
}
