package Seminars.fourth;

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

        boolean run = true;
        while (run){
            String in = scan.nextLine();
            if (in.equals("x")){
                run = false;
            }
            else{
                String[] data = in.split(" ");
                lastname.add(data[0]);
                firstname.add(data[1]);
                patronymic.add(data[2]);
                sex.add(data[3]);
                age.add(Integer.parseInt(data[4]));
            }

        for(int i = 0; i<lastname.size();i++){
            StringBuilder str = new StringBuilder();
            str.append(lastname.get(i)).append(" ")
                .append(firstname.get(i).charAt(0)).append(" ")
                .append(patronymic(i).charAt(0)).append(" ")
                .append(sex(i).charAt(0)).append(" ").append(age.get(i));
            sout(str);
        }

        }
    }
}
