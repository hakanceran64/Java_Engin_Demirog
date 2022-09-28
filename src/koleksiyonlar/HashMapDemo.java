/*
 * @File: HashMapDemo.java
 * @Authors: Hakan CERAN, Engin DEMİROĞ
 * @Date: 24.09.2022
 * @Content:
 * @Notes: Bazı programlama dillerinde bulunan sözlük yapılarına benzer. Sırasızdırlar.
 */

package koleksiyonlar;

import java.util.HashMap;

public class HashMapDemo {
    public static void main (String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();

        // HashMap'e eleman eklemek için.
        sozluk.put("car", "araba");
        sozluk.put("window", "pencere");
        sozluk.put("dog", "kopek");
        sozluk.put("cat", "kedi");
        sozluk.put("computer", "bilgisayar");

        // HashMap üzerindeki tüm elemanlara ulaşmak için.
        System.out.println(sozluk);

        // HashMap'te bir elemana ulaşmak istediğimizde.
        System.out.println(sozluk.get("window"));

        // HashMap eleman sayısına ulaşmak için.
        System.out.println("HashMap eleman sayısı: " + sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.print("item: " + item);
            System.out.println(" -> get(item): " + sozluk.get(item));
        }

        // HashMap'ten bir eleman silmek için.
        sozluk.remove("dog");

        // HashMap'teki bütün elemanları silmek için.
        sozluk.clear();
    }
}
