/*
 * @File: ArrayListClass.java
 * @Authors: Hakan CERAN, Engin DEMİROĞ
 * @Date: 23.09.2022
 * @Content: try catch ve finally kavramları
 * @Notes:
 */

package exception_handling;

public class ExceptionHandling {
    public static void main(String[] args){
        int[] sayilar = new int[]{1, 2, 3, 4};

        try {
            System.out.println(sayilar[10]);
        } catch (Exception exception) {
            System.out.println("Hata olustu.");
            System.out.println(exception);
        } finally {
            // finally her zaman çalışır.
            System.out.println("Bazı durumlarda istem başarılı veya başarısız da olsa sistemi kapatmak gerekebilir.");
        }
    }
}
