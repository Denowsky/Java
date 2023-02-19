package Seminars.third;

import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.Iterator;

public class HW {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cerbera");
        list.add("Cinnamomum");
        list.add("Daffodils");
        list.forEach(n -> System.out.println(n));
        String temp;

        for (int index = 0; index < list.size(); index++) {
            temp = list.get(index)+"!";
            list.set(index,temp);
        }
        System.out.println(list);
        String newElement = "Citrus";
        list.add(0, newElement);
        System.out.println(list);

        String takeoff = list.get(3);
        System.out.println(takeoff);

        list.set(2, newElement);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.indexOf("Cerbera!"));

        ArrayList list2 = new ArrayList<>();
        
    }
}
