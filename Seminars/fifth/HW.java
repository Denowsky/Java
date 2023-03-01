// Создать множество, ключь и значение строки. Добавить шесть элементов. +
// Вывести в консоль значения. Добавить ко всем значениям символ "!". +
// Создать второе множество с таким же обобщением. +
// Ключи второго множества частично совпадают с ключеми первого. +
// Объеденить значания во втором множестве и первом если ключи совподают. +
// Вывести результат в консоль.+

package Seminars.fifth;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HW {
    public static void main(String[] args) {
        Map<Integer,String> db = new HashMap<>();
        db.put(1, "Значение 1");
        db.put(2, "Значение 2");
        db.put(3, "Значение 3");
        db.put(4, "Значение 4");
        db.put(5, "Значение 5");
        db.put(6, "Значение 6");
        // System.out.println(db.values());
        for(Integer s:db.keySet()){
            System.out.println(db.get(s));
        }
        // for(int i=1; i<db.size()+1;i++){
        //     db.compute(i, (k,v)-> v += "!");
        // }
        for(Integer key: db.keySet()){
            db.compute(key, (k,v)-> v + "!");
        }
        System.out.println(db.values());

        Map<Integer,String> db2 = new HashMap<>();
        db2.put(3, "Значение 1");
        db2.put(7, "Значение 2");
        db2.put(6, "Значение 3");
        db2.put(8, "Значение 1");
        db2.put(2, "Значение 2");
        db2.put(9, "Значение 3");
        for(Integer key: db2.keySet()){
            db2.merge(key, db.getOrDefault(key, "null"), (k,v)->k + " + " + v);
            System.out.println(db2.get(key));
        }
    }
}
