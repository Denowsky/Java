// Создать множество, ключь и значение строки. Добавить шесть элементов. 
// Вывести в консоль значения. Добавить ко всем значениям символ "!".
// Создать второе множество с таким же обобщением. 
// Ключи второго множества частично совпадают с ключеми первого. 
// Объеденить значания во втором множестве и первом если ключи совподают. 
// Вывести результат в консоль.

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
        for(int i=1; i<db.size()+1;i++){
            db.compute(i, (k,v)-> v += "!");
        }
        System.out.println(db.values());
    }
}
