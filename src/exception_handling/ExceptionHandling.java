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
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Catch: Array Index Out Of Bounds Exception");
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Catch: String Index Out Of Bounds Exception");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Catch: Index Out Of Bounds Exception");
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Hata olustu.");
            System.out.println(exception);
        } finally {
            // finally her zaman çalışır.
            System.out.println("Bazı durumlarda istem başarılı veya başarısız da olsa sistemi kapatmak gerekebilir.");
        }
    }
}
