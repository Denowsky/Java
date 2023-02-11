package Lections;
/**
 * first
 */
public class FirstLect {
    public static void main(String[] args) {
        // System.out.println("bye world");
        int[] m1 = new int[1];
        int index = 0;
        for(int i = 0; i<11;i++){
            m1 = new int[m1.length+1];
            m1[index] = i;
            System.out.println(m1[index]);
            index+=1;
        }
        // System.out.println(m1.length);
        // for(int i = 0; i<=m1.length;i++){
        //     System.out.println(m1[i]);
        // }

    }
}