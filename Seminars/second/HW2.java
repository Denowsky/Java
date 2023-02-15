/*
1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
*/
package Seminars.second;


public class HW2 {
    static String ReverseRec(String arg) {
        String rightPart;
        String leftPart;
        int length = arg.length();
        if (length <= 1) {
            return arg;
        }
        leftPart = arg.substring(0, length / 2);
        rightPart = arg.substring(length / 2, length);
        return ReverseRec(rightPart) + ReverseRec(leftPart);
    }
    static StringBuilder LetsAppend(StringBuilder arg1, StringBuilder arg2, String operand){
        StringBuilder result = new StringBuilder();
        if(operand==" + "){
        return result.append(arg1)
                     .append(operand)
                     .append(arg2)
                     .append(" = ")
                     .append(Integer.parseInt(arg1.toString())+Integer.parseInt(arg2.toString()));
                     }
        else if(operand==" - "){
            return result.append(arg1)
            .append(operand)
            .append(arg2)
            .append(" = ")
            .append(Integer.parseInt(arg1.toString())-Integer.parseInt(arg2.toString()));
            }
            else if(operand==" * "){
                return result.append(arg1)
                .append(operand)
                .append(arg2)
                .append(" = ")
                .append(Integer.parseInt(arg1.toString())*Integer.parseInt(arg2.toString()));
                }
        else{
            return result.append("This is not a calculator (not yet)");
        }
    }
    static StringBuilder InsertAndDeleteChar(StringBuilder arg, int variant){
        String operand = "=";
        if(variant == 1){
        for(int i = 0; i<arg.length();i++){
            if (arg.charAt(i) == operand.charAt(0)){
                arg.delete(i, i+1);
                arg.insert(i, "равно");
                return arg;
            }
        }
        }
        if(variant == 2){
            for(int i = 0; i<arg.length();i++){
                if (arg.charAt(i) == operand.charAt(0)){
                    arg.replace(i, i+1, "равно");
                    return arg;
                }
            }
        }
            return arg;
    }
    public static void main(String[] args) {

        String str = "habudabu";
        String str2 = "abudabu";

        // if(str.compareTo(str2)==0){ // работает как contentEquals и contains
        // if(str.contentEquals(str2)==true){ // то же
        // if(str.contains(str2)==true){ // не подходит условию, так как проверяет частичное содержание
        if (str.equals(str2) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        StringBuilder build1 = new StringBuilder("habudabu");
        StringBuilder build2 = new StringBuilder("ubadubah");

        if (build1.toString().equals(build2.reverse().toString()) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //habudabu -> ubadubah
        System.out.println(ReverseRec(str));

        build1.delete(0, build1.length());
        build1.append("3");
        build2.delete(0, build2.length());
        build2.append("56"); 
        System.out.println(LetsAppend(build1, build2," + "));
        System.out.println(LetsAppend(build1, build2," - "));
        System.out.println(LetsAppend(build1, build2," * "));
        StringBuilder result = LetsAppend(build1, build2," + ");
        System.out.println(InsertAndDeleteChar(result,1));
        result = LetsAppend(build1, build2," - ");
        System.out.println(InsertAndDeleteChar(result,2));

        String pleaseDontBurnMyPc = "=";
        for(int i = 0; i<10000;i++){
            pleaseDontBurnMyPc+= "=";
        }

        StringBuilder itsAlmoustBrandnew = new StringBuilder();
        for(int i = 0; i<10000;i++){
            itsAlmoustBrandnew.append("=");
        }

        long begin = System.currentTimeMillis();
        for(int i = 0; i<pleaseDontBurnMyPc.length();i++){
            pleaseDontBurnMyPc.replace("=", "равно");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);


    }
}
