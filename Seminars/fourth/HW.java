package Seminars.fourth;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Фамилию, имя, отчество, пол и возраст: ");
        String in = scan.nextLine();
        String[] data = in.split(" ");
    }
}
