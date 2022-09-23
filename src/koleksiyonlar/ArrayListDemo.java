package koleksiyonlar;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){

        // Array tanımlama
        int[] sayilar = new int[]{1,2,3,4,5};

        // new kelimesi sayilar için yeni bir alan tanımlar.
        // bu nedenle eski elemanlar silinir ve Array'lerin varsayılan elemanı olan 0 gösterilir.
        sayilar = new int[10];

        System.out.println("sayilar[0]: " + sayilar[0]);

        // Array List tanımlama.
        ArrayList sayilarArrayList = new ArrayList();

        // ArrayList'e eleman ekleme.
        sayilarArrayList.add(1);
        sayilarArrayList.add(2);
        sayilarArrayList.add("Ankara");
        sayilarArrayList.add("Istanbul");

        // 0. indecteki elemanı değiştirme
        sayilarArrayList.set(0, 100);

        // ArrayList'ten istenilen index'teki elemanı silme.
        // Eleman silindikten sonra diğer elemanlar silinen elemanın yerine doğru kayar.
        sayilarArrayList.remove(3);

        // ArrayList'teki bütün elemanları silmek için.
        sayilarArrayList.clear();

        // ArrayList'lerin for döngüsünde kullanımı.
        for (Object i : sayilarArrayList){
            System.out.println("Eleman: " + i);
        }

        System.out.println("sayilarArrayList.size(): " + sayilarArrayList.size());

    }

}
