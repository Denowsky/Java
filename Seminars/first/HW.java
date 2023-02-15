package Seminars.first;

import java.util.Random;

public class HW {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        i = random.nextInt(2000);
        System.out.println(i);
        int n = Bit2(i);
        System.out.println(n);
        int[] m1 = new int[1];
        int[] m2 = new int[1];
        m1 = ArrayAddShortMax(m1, n);
        m2 = ArrayAddShortMin(m2, n);
    }

    static int Bit2(int x) {
        int res = 0;
        while (x != 1) {
            x >>= 1;
            res++;
        }
        return res;
    }

    static int[] ArrayAddShortMax(int[] myArray, int num) {
        int index = 0;
        for (int j = 0; j <= Short.MAX_VALUE; j++) {
            if (j % num == 0) {
                myArray = new int[myArray.length + 1];
                myArray[index] = j;
                index += 1;
                continue;
            }
        }
        System.out.println(myArray.length);
        return myArray;
    }

    static int[] ArrayAddShortMin(int[] myArray, int num) {
        int index = 0;
        for (int j = 0; j >= Short.MIN_VALUE; j--) {
            if (j % num != 0) {
                myArray = new int[myArray.length + 1];
                myArray[index] = j;
                index += 1;
                continue;
            }
        }
        System.out.println(myArray.length);
        return myArray;
    }
}
