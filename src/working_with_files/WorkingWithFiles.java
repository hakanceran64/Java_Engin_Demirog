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
        createFile();
        getFileInfo();
    }

    public static void createFile(){
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

    public static void getFileInfo(){
        File file = new File("src/working_with_files/students.txt");
        if(file.exists()){
            System.out.println("File Name: " + file.getName());
            System.out.println("File Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Path: " + file.getPath());
            System.out.println("Can File Write: " + file.canWrite());
            System.out.println("Can File Read: " + file.canRead());
            System.out.println("File Length Byte: " + file.length());
        }
    }
}
