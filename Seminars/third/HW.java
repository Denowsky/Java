// Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
// Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// Вставить элемент в список в первой позиции.
// Извлечь элемент (по указанному индексу) из заданного списка.
// Обновить определенный элемент списка по заданному индексу.
// Удалить третий элемент из списка.
// Поиска элемента в списке по строке.
// Создать новый список и добавить в него несколько елементов первого списка.
// Удалить из первого списка все элементы отсутствующие во втором списке.
// *Сортировка списка.
// *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

package Seminars.third;

import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Создаём список
        list.add("Cerbera"); // добавляем строки
        list.add("Cinnamomum");
        list.add("Daffodils");
        list.add("Roses");
        list.add("Lotus");
        list.add("Oldbros");
        list.forEach(n -> System.out.println(n)); // выводим коллекцию
        String temp;

        for (int index = 0; index < list.size(); index++) { //Итерация всех элементов с добавлением "!"
            temp = list.get(index)+"!";
            list.set(index,temp);
        }
        System.out.println(list);
        String newElement = "Citrus";
        list.add(0, newElement); // Вставляем новый элемент в начало коллекции... хм, по заданию нужно в первую позицию в смысле - 0 или всё же в 1?
        System.out.println(list);

        String takeoff = list.get(3); // Извлекаем 3 элемент
        System.out.println(takeoff);

        list.set(2, newElement); // Обновляем 2 элемент
        System.out.println(list);
        list.remove(3); // Удаляем третий элемент
        System.out.println(list);
        System.out.println(list.indexOf("Cerbera!")); // Ищем элемент по строке и находим его индекс

        ArrayList list2 = new ArrayList<>(); // Создаём ещё один список и добавляем в него половину элементов первого списка
        for (int i = 0; i<list.size()/2;i++){
            list2.add(list.get(i));
        }
        
        System.out.println(list);
        list.retainAll(list2); // Удаляем из первого списка все элементы отсутствующие во втором списке
        System.out.println(list);
        
        Collections.sort(list); // *Сортируем список
        System.out.print(list);
        
        ArrayList<String> arrlist = new ArrayList<>();
        long begin = System.currentTimeMillis(); // Засекаем время для сравнения
        for(int i = 0; i<=1000; i++){
            arrlist.add("Daffodils");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin); //
        
        LinkedList<String> linklist = new LinkedList<>();
        begin = System.currentTimeMillis();
        for(int i = 0; i<=1000; i++){
            linklist.add("Daffodils");
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin); //
    }
}
