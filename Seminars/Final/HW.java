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
}