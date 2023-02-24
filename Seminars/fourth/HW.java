package Seminars.fourth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        ArrayList<String> firstname = new ArrayList<>();
        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Фамилию, имя, отчество, пол и возраст: ");
        Integer count = 0;
        boolean run = true;
        while (run) {
            String in = scan.nextLine();
            if (in.equals("x")) {
                run = false;
            } else {
                String[] data = in.split(" ");
                lastname.add(data[0]);
                firstname.add(data[1]);
                patronymic.add(data[2]);
                sex.add(data[3]);
                age.add(Integer.parseInt(data[4]));
                count++;
                continue;
            }
        }

        System.out.println("Отсортировать список по возрасту? 'y' или 'n':");
        String out = scan.nextLine();
        scan.close();
        ArrayList<Integer> sorted = age;
        sorted.sort(null);
        if (out.equals("y")) {
            for (int i = 0; i < sorted.size(); i++) {
                Integer j = age.indexOf(sorted.get(i));
                StringBuilder str = new StringBuilder();
                str.append(lastname.get(j)).append(" ")
                        .append(firstname.get(j).charAt(0)).append(".")
                        .append(patronymic.get(j).charAt(0)).append(". ")
                        .append(age.get(j)).append(sex.get(j).charAt(0));
                System.out.println(str);
            }
        } else {
            for (int i = 0; i < sorted.size(); i++) {
                StringBuilder str = new StringBuilder();
                str.append(lastname.get(i)).append(" ")
                        .append(firstname.get(i).charAt(0)).append(".")
                        .append(patronymic.get(i).charAt(0)).append(". ")
                        .append(age.get(i)).append(sex.get(i).charAt(0));
                System.out.println(str);
            }
        }
    }
}