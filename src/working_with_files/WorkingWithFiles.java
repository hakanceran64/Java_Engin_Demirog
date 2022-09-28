/*
 * @File: WorkingWithFiles.java
 * @Authors: Hakan CERAN, Engin DEMİROĞ
 * @Date: 28.09.2022
 * @Content: Working With Files
 * @Notes:
 */

package working_with_files;

import java.io.File;
import java.io.IOException;

public class WorkingWithFiles {
    public static void main(String[] args) {
        File file = new File("src/working_with_files/students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya Olusturuldu.");
            } else {
                System.out.println("Dosya zaten var.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
