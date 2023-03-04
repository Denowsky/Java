// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, метод toString 
// возвращающий строку с элементами множества и метод позволяющий 
// читать элементы по индексу(get). Формат данных Integer.

package Seminars.Final;

import java.util.ArrayList;
import java.util.HashMap;

public class HW {
    public static void main(String[] args) {
        Myset set = new Myset();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(5);
        set.add(8);
        System.out.println(set.toString());
        System.out.println(set.get(2));
    }
}

class Myset {
    HashMap<Integer, Object> values = new HashMap<>();

    private static final Object X = new Object();

    void add(int data) {
        values.put(data, X);
    }

    public String toString() {
        return values.keySet().toString();
    }

    int size() {
        return values.size();
    }

    int get(int ind) {
        return (int) values.keySet().toArray()[ind];
    }
}