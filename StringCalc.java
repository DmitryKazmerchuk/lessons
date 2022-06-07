import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalc {
    public static void main(String[] args){

        ScanAndStringException pat = new ScanAndStringException();
        String sc = pat.stException("");

        String []myArray = sc.split("\"");

        String part1 = myArray[1]; //Первая строка
        int dlpart1 = part1.length(); //Длинна первой строки
        int n = 0; //Количество итераций при умножении

        String part2 = myArray[2]; //Знак + число
        Pattern patternPart2 = Pattern.compile("[^1234567890+[-]/*]", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart2 = patternPart2.matcher(part2);
        if (matcherPart2.find()) {
            throw new NumberFormatException("т.к. выражение не удовлетворяет заданию");
        }
        Pattern patternPart20 = Pattern.compile("(([+]{2,})|([-]{2,})|([*]{2,})|([/]{2,}))", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart20 = patternPart20.matcher(part2);
        if (matcherPart20.find()) {
            throw new NumberFormatException("т.к. выражение не удовлетворяет заданию");
        }
        Pattern patternPart21 = Pattern.compile("(([+]\\d)|([-]\\d))", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart21 = patternPart21.matcher(part2);
        if (matcherPart21.find()) {
            throw new NumberFormatException("т.к. выражение не удовлетворяет заданию");
        }
        Pattern patternPart22 = Pattern.compile("((\\d[+])|(\\d)[-])|(\\d[*])|(\\d)[/]", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart22 = patternPart22.matcher(part2);
        if (matcherPart22.find()) {
            throw new NumberFormatException("т.к. выражение не удовлетворяет заданию");
        }
        if(part1.length() > 10){
            throw new NumberFormatException("т.к. калькулятор должен принимать на вход строки длинной не более 10 символов");
        }

        if (Objects.equals(myArray[2], "+")) {
            String part3 = myArray[3]; //Вторая строка
            if (myArray[3].length() > 10){
                throw new NumberFormatException("т.к. калькулятор должен принимать на вход строки длинной не более 10 символов");
            }
            System.out.print("Сумма строк: " + part1.concat(part3));
        }

        while (Objects.equals(myArray[2], "-")) {
            if (myArray[3].length() > 10){
                throw new NumberFormatException("т.к. калькулятор должен принимать на вход строки длинной не более 10 символов");
            }
            int razn = myArray[1].length() - myArray[3].length();
            boolean sravn = myArray[1].contains(myArray[3]);
            if (sravn) {
                System.out.println("Разница строк: " + myArray[1].subSequence(0, razn));
                break;
            } else {
                System.out.println("Разница строк: " + myArray[1]);
                break;
            }
        }
        Pattern patternPart0 = Pattern.compile("[*]", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart0 = patternPart0.matcher(part2);
        if (matcherPart0.find() && myArray[2].length() == 3) {
            int intpart21 = Integer.parseInt(String.valueOf(myArray[2].charAt(1)));//проверка на 0
            if (intpart21 == 0){
                throw new NumberFormatException("т.к. калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
            }
            if (10 * part1.length() > 40){
                n = 1;
            }
            for (int i = n; i < 10; i++) {
                if (i*part1.length() > 40){
                    int ostpart1 = i*part1.length() - 40;
                    System.out.print(part1.substring(0,dlpart1-ostpart1) + "..."); break;}
                System.out.print(part1);
            }
        }
        Pattern patternPart01 = Pattern.compile("[*]", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart01 = patternPart01.matcher(part2);
        if (matcherPart01.find() && myArray[2].length() == 2) {
            int intpart21 = Integer.parseInt(String.valueOf(myArray[2].charAt(1)));
            if (intpart21 == 0){
                throw new NumberFormatException("т.к. калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
            }
            if (intpart21 * part1.length() > 40){
                n = 1;
            }
            for (int i = n; i < intpart21; i++) {
                if (i*part1.length() > 40){
                    int ostpart1 = i*part1.length() - 40;
                    System.out.print(part1.substring(0,dlpart1-ostpart1) + "..."); break;}
                System.out.print(part1);
            }
        }
        Pattern patternPart02 = Pattern.compile("[/]", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart02 = patternPart02.matcher(part2);
        if (matcherPart02.find() && myArray[2].length() == 3) {
            int intpart21 = Integer.parseInt(String.valueOf(myArray[2].charAt(1)));//проверка на 0
            if (intpart21 == 0){
                throw new NumberFormatException("т.к. калькулятор должен принимать на вход числа от 1 до 10 включительно, не более и деление на ноль запрещено");
            }
            System.out.println("Результат: " + myArray[1].subSequence(0,1));
        }
        Pattern patternPart03 = Pattern.compile("[/]", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart03 = patternPart03.matcher(part2);
        if (matcherPart03.find() && myArray[2].length() == 2) {
            int intpart21 = Integer.parseInt(String.valueOf(myArray[2].charAt(1)));//проверка на 0
            if (intpart21 == 0){
                throw new NumberFormatException("т.к. калькулятор должен принимать на вход числа от 1 до 10 включительно, не более и деление на ноль запрещено");
            }
            int d = myArray[1].length()/intpart21;
            System.out.println("Результат: " + myArray[1].subSequence(0,d));
        }
    }
}
class ScanAndStringException{
    public String stException(String st){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию вычисления: ");
        st = scan.nextLine();

        Pattern pattern0 = Pattern.compile("(\"(.*)\"{1,})", Pattern.CASE_INSENSITIVE);
        Matcher matcher0 = pattern0.matcher(st.replace(" ",""));
        if (!matcher0.find()) {
            throw new NumberFormatException("т.к. значения строк передаваемых в выражении выделяются двойными кавычками");
        }
        Pattern pattern7 = Pattern.compile("((((1)|(2)|(3)|(4)|(5)|(6)|(7)|(8)|(9))(\\w*)){2,})", Pattern.CASE_INSENSITIVE);
        Matcher matcher7 = pattern7.matcher(st);
        if (matcher7.find()) {
            throw new NumberFormatException("т.к. калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
        }
        Pattern patternPart23 = Pattern.compile("(([*]\\D)|([/]\\D))", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart23 = patternPart23.matcher(st);
        if (matcherPart23.find()) {
            throw new NumberFormatException("т.к. выражение не удовлетворяет заданию");
        }
        Pattern patternPart25 = Pattern.compile("((\\D[+]\\D)|(\\D[+]\\d)|(\\D[-]\\D)|(\\D[-]\\d)|(\\D[*]\\D)|(\\D[*]\\d)|(\\D[/]\\D)|(\\D[/]\\d))", Pattern.CASE_INSENSITIVE);
        Matcher matcherPart25 = patternPart25.matcher(st);
        if (!matcherPart25.find()) {
            throw new NumberFormatException("т.к. выражение не удовлетворяет заданию");
        }
        return st;
    }
}