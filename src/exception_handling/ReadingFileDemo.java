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
        int total = 0;

        try {
            FileReader sayilarTXT = new FileReader("src/exception_handling/sayilar.txt");
            bufferedReader = new BufferedReader(sayilarTXT);
            String line = null;

            while ((line= bufferedReader.readLine()) != null){
                total += Integer.valueOf(line);
            }

            System.out.println("Total: " + total);

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();

            System.out.println("File not found exception");
        } finally {
            bufferedReader.close();
        }
    }
}
