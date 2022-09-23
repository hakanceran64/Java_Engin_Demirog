/*
 * @File: ArrayListClass.java
 * @Authors: Hakan CERAN, Engin DEMİROĞ
 * @Date: 23.09.2022
 * @Content: ArrayList'lerin Class'lar ile birlikte kullanılması.
 */

package koleksiyonlar;

import java.util.ArrayList;

public class ArrayListWithClass {

    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer engin = new Customer(1, "Engin", "DEMİROĞ");

        customers.add(engin);
        customers.add(new Customer(1, "Hakan", "CERAN"));
        customers.add(new Customer(1, "Özkan", "CERAN"));
        customers.add(new Customer(1, "Serkan", "CERAN"));

        customers.remove(engin);

        for(Customer customer : customers){
            System.out.println(customer.firstName);
        }

    }

}
