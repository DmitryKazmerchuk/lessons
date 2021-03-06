import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Main calculator = new Main();
        calculator.calc("");
    }
    public static String calc(String input) {
        System.out.println("Введите арифметическую операцию");
        Scanner cons = new Scanner(System.in);
        String st = cons.next();

        //Обработка строки с помощью регулярных выражений
        Pattern pattern0 = Pattern.compile ("[^ivx1234567890+[-]/*]", Pattern.CASE_INSENSITIVE);
        Matcher matcher0 = pattern0.matcher(st);
        Pattern pattern1 = Pattern.compile ("[ivx]", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(st);
        Pattern pattern2 = Pattern.compile ("[(0-9)]", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(st);
        Pattern pattern3 = Pattern.compile ("([+](\\w*)){2,}|([-](\\w*)){2,}|([*](\\w*)){2,}|([/](\\w*)){2,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(st);
        Pattern pattern4 = Pattern.compile ("((([+](\\w*)){1})|(([-](\\w*)){1})|(([*](\\w*)){1})|(([/](\\w*)){1}))", Pattern.CASE_INSENSITIVE);
        Matcher matcher4 = pattern4.matcher(st);
        Pattern pattern5 = Pattern.compile ("(((1)|(2)|(3)|(4)|(5)|(6)|(7)|(8)|(9))(\\w*)){2,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher5 = pattern5.matcher(st);
        Pattern pattern6 = Pattern.compile ("([0](\\w*)){2,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher6 = pattern6.matcher(st);

        // Условия срабатывания исключений
        if (matcher0.find()) {
                throw new NumberFormatException("т.к. строка не является математической операцией");
        }
        if (matcher1.find() && matcher2.find()) {
            throw new NumberFormatException("т.к. используются одновременно разные системы счисления");
        }
        if (matcher3.find()) {
            throw new NumberFormatException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (!matcher4.find()) {
            throw new NumberFormatException("т.к. строка не является математической операцией");
        }
        if (matcher5.find()) {
            throw new NumberFormatException("т.к. формат математической операции не удовлетворяет заданию");
        }
        if (matcher6.find()) {
            throw new NumberFormatException("т.к. формат математической операции не удовлетворяет заданию");
        }
        // Декларирую и инициализирую переменные
        char ch1 = st.charAt(0);
        char ch2 = st.charAt(1);
        char ch3 = st.charAt(2);
        int a = 111;
        int b = 111;
        int s = 111;

        // Создание массива для обработки римских цифр и перевода строчных символов в заглавные
        char[] myArray = new char[st.length()];
                for (int i = 0; i < st.length(); i++) {
                    if (i > st.length()) {
                        break;}
                    myArray[i] = Character.toUpperCase(st.charAt(i));
                }

        //Арабские цифры
        //Пять символов
        while (st.charAt(0) != 'I' && st.charAt(0) != 'i' && st.charAt(0) != 'V' && st.charAt(0) != 'v' && st.charAt(0) != 'X' && st.charAt(0) != 'x' ) {
        if (ch3 == '+' && ch1 == '1' && ch2 == '0' && st.length() == 5) {
            char ch4 = st.charAt(3);
            char ch5 = st.charAt(4);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                int s5 = Integer.parseInt(String.valueOf(ch5));
                int s100 = s4 + s5;
                if (s100 > 1 || s100 == 0){
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат " + (10 + 10));
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }
        if (ch3 == '-' && ch1 == '1' && ch2 == '0' && st.length() == 5) {
            char ch4 = st.charAt(3);
            char ch5 = st.charAt(4);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                int s5 = Integer.parseInt(String.valueOf(ch5));
                int s100 = s4 + s5;
                if (s100 > 1 || s100 == 0){
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат 0");
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }
        if (ch3 == '*' && ch1 == '1' && ch2 == '0' && st.length() == 5) {
            char ch4 = st.charAt(3);
            char ch5 = st.charAt(4);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                int s5 = Integer.parseInt(String.valueOf(ch5));
                int s100 = s4 + s5;
                if (s100 > 1 || s100 == 0){
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат 100");
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }
        if (ch3 == '/' && ch1 == '1' && ch2 == '0' && st.length() == 5) {
            char ch4 = st.charAt(3);
            char ch5 = st.charAt(4);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                int s5 = Integer.parseInt(String.valueOf(ch5));
                int s100 = s4 + s5;
                if (s100 > 1 || s100 == 0){
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат 1");
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }

        //Четыре символа (10ка слева)
            if (ch2 != '0' && ch2 != '+' && ch2 != '-' && ch2 != '*' && ch2 != '/') {
                throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
            }
            if (ch2 == '0' && (ch1 == '2' || ch1 == '3' || ch1 == '4' || ch1 == '5' || ch1 == '6' || ch1 == '7' || ch1 == '8' || ch1 == '9')){
                throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
            }

        if (ch3 == '+' && st.length() == 4) {
            char ch4 = st.charAt(3);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                if (ch4 == '0') {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат " + (10 + s4));
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }
        if (ch3 == '-' && st.length() == 4) {
            char ch4 = st.charAt(3);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                if (ch4 == '0') {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат " + (10 - s4));
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }
        if (ch3 == '*' && st.length() == 4) {
            char ch4 = st.charAt(3);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                if (ch4 == '0') {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат " + (10 * s4));
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }
        if (ch3 == '/' && st.length() == 4) {
            char ch4 = st.charAt(3);
            try {
                Integer.parseInt(String.valueOf(ch1));
                Integer.parseInt(String.valueOf(ch2));
                int s4 = Integer.parseInt(String.valueOf(ch4));
                if (ch4 == '0') {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                System.out.println("Результат " + (10 / s4));
                System.exit(0);
                break;
            }   catch (NumberFormatException e) {
                break;
            }
        }

        //Четыре символа (10ка справа)
            if (ch1 == '0'){
                throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
            }
            if (ch2 == '+' && st.length() == 4) {
                char ch4 = st.charAt(3);
                try {
                    int s1 = Integer.parseInt(String.valueOf(ch1));
                    int s3 = Integer.parseInt(String.valueOf(ch3));
                    int s4 = Integer.parseInt(String.valueOf(ch4));
                    int s100 = s3 + s4;
                    if (s100 >= 0){
                        throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                    }
                    System.out.println("Результат " + (s1 + 10));
                    System.exit(0);
                    break;
                }   catch (NumberFormatException e) {
                    break;
                }
            }
            if (ch2 == '-' && st.length() == 4) {
                char ch4 = st.charAt(3);
                try {
                    int s1 = Integer.parseInt(String.valueOf(ch1));
                    int s3 = Integer.parseInt(String.valueOf(ch3));
                    int s4 = Integer.parseInt(String.valueOf(ch4));
                    int s100 = s3 + s4;
                    if (s100 >= 0){
                        throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                    }
                    System.out.println("Результат " + (s1 - 10));
                    System.exit(0);
                    break;
                }   catch (NumberFormatException e) {
                    break;
                }
            }
            if (ch2 == '*' && st.length() == 4) {
                char ch4 = st.charAt(3);
                try {
                    int s1 = Integer.parseInt(String.valueOf(ch1));
                    int s3 = Integer.parseInt(String.valueOf(ch3));
                    int s4 = Integer.parseInt(String.valueOf(ch4));
                    int s100 = s3 + s4;
                    if (s100 >= 0){
                        throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                    }
                    System.out.println("Результат " + (s1 * 10));
                    System.exit(0);
                    break;
                }   catch (NumberFormatException e) {
                    break;
                }
            }
            if (ch2 == '/' && st.length() == 4) {
                char ch4 = st.charAt(3);
                try {
                    int s1 = Integer.parseInt(String.valueOf(ch1));
                    int s3 = Integer.parseInt(String.valueOf(ch3));
                    int s4 = Integer.parseInt(String.valueOf(ch4));
                    int s100 = s3 + s4;
                    if (s100 >= 0){
                        throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                    }
                    System.out.println("Результат " + (s1 / 10));
                    System.exit(0);
                    break;
                }   catch (NumberFormatException e) {
                    break;
                }
            }

            //Три символа
                if (ch3 == '0'){
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
                if (ch2 == '+' && st.length() == 3) {
                    try {
                        int s1 = Integer.parseInt(String.valueOf(ch1));
                        int s3 = Integer.parseInt(String.valueOf(ch3));
                        System.out.println("Результат " + (s1 + s3));
                        System.exit(0);
                        break;
                    } catch (NumberFormatException e) {
                        break;
                    }

                } else if (ch2 == '-' && st.length() == 3) {
                    try {
                        int s1 = Integer.parseInt(String.valueOf(ch1));
                        int s3 = Integer.parseInt(String.valueOf(ch3));
                        System.out.println("Результат " + (s1 - s3));
                        System.exit(0);
                        break;
                    } catch (NumberFormatException e) {
                        break;
                    }

                } else if (ch2 == '*' && st.length() == 3) {
                    try {
                        int s1 = Integer.parseInt(String.valueOf(ch1));
                        int s3 = Integer.parseInt(String.valueOf(ch3));
                        System.out.println("Результат " + (s1 * s3));
                        System.exit(0);
                        break;
                    } catch (NumberFormatException e) {
                        break;
                    }

                } else if (ch2 == '/' && st.length() == 3) {
                    try {
                        int s1 = Integer.parseInt(String.valueOf(ch1));
                        int s3 = Integer.parseInt(String.valueOf(ch3));
                        System.out.println("Результат " + (s1 / s3));
                        System.exit(0);
                        break;
                    } catch (NumberFormatException e) {
                        break;
                    }
                }
            }

            //Римские цифры
            while (st.length() == 3) {
                if (myArray[0] == 'I' && myArray[2] == 'I') {
                    a = 1;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[2] == 'V') {
                    a = 1;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'I') {
                    a = 5;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[2] == 'X') {
                    a = 1;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'I') {
                    a = 10;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'X') {
                    a = 5;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'V') {
                    a = 10;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'V') {
                    a = 5;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'X') {
                    a = 10;
                    b = 10;
                    break;
                }
            }
            while (st.length() == 4) {
                if (myArray[0] == 'I' && myArray[2] == 'I' && myArray[3] == 'I') {
                    a = 1;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'I') {
                    a = 2;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'I') {
                    a = 4;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[2] == 'I' && myArray[3] == 'V') {
                    a = 1;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'I') {
                    a = 6;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[2] == 'V' && myArray[3] == 'I') {
                    a = 1;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'I') {
                    a = 9;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[2] == 'I' && myArray[3] == 'X') {
                    a = 1;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'I' && myArray[3] == 'I') {
                    a = 10;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'X') {
                    a = 2;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'X') {
                    a = 4;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'I' && myArray[3] == 'V') {
                    a = 10;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'X') {
                    a = 6;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'V' && myArray[3] == 'I') {
                    a = 10;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'X') {
                    a = 9;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'I' && myArray[3] == 'X') {
                    a = 10;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'I' && myArray[3] == 'I') {
                    a = 5;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'V') {
                    a = 2;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'V') {
                    a = 4;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'I' && myArray[3] == 'V') {
                    a = 5;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'V') {
                    a = 6;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'V' && myArray[3] == 'I') {
                    a = 5;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'V') {
                    a = 9;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'I' && myArray[3] == 'X') {
                    a = 5;
                    b = 9;
                    break;
                }
                if (a == 111 && b == 111) {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
            }
            while (st.length() == 5) {

                if (myArray[0] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 1;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I') {
                    a = 3;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'I' && myArray[2] == 'V' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 1;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I') {
                    a = 7;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 5;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V') {
                    a = 3;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'V' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 5;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V') {
                    a = 7;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 10;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'X') {
                    a = 3;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'V' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 10;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'X') {
                    a = 7;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'V') {
                    a = 2;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 4;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'V' && myArray[4] == 'I') {
                    a = 2;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 6;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'X') {
                    a = 2;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 9;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'V' && myArray[4] == 'I') {
                    a = 4;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'V') {
                    a = 6;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'I' && myArray[4] == 'X') {
                    a = 4;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'I' && myArray[4] == 'V') {
                    a = 9;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'X') {
                    a = 6;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'V' && myArray[4] == 'I') {
                    a = 9;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'I') {
                    a = 2;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'I' && myArray[4] == 'V') {
                    a = 4;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'V' && myArray[4] == 'I') {
                    a = 6;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'I' && myArray[4] == 'X') {
                    a = 9;
                    b = 9;
                    break;
                }
                if (a == 111 || b == 111) {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
            }
            while (st.length() == 6) {
                if (myArray[0] == 'I' && myArray[2] == 'V' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 1;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'I') {
                    a = 8;
                    b = 1;
                    break;
                }
                if (myArray[0] == 'V' && myArray[2] == 'V' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 5;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'V') {
                    a = 8;
                    b = 5;
                    break;
                }
                if (myArray[0] == 'X' && myArray[2] == 'V' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 10;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'X') {
                    a = 8;
                    b = 10;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 2;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 3;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 4;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'V') {
                    a = 3;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 6;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V' && myArray[5] == 'I') {
                    a = 3;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 9;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'X') {
                    a = 3;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 7;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 2;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'V') {
                    a = 7;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 4;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V' && myArray[5] == 'I') {
                    a = 7;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 6;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'X') {
                    a = 7;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I') {
                    a = 9;
                    b = 7;
                    break;
                }
                if (a == 111 && b == 111) {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
            }
            while (st.length() == 7) {
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 2;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 8;
                    b = 2;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'V' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 4;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'I' && myArray[6] == 'V') {
                    a = 8;
                    b = 4;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 6;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'V' && myArray[6] == 'I') {
                    a = 8;
                    b = 6;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'X' && myArray[3] == 'V' && myArray[4] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 9;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'I' && myArray[6] == 'X') {
                    a = 8;
                    b = 9;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 3;
                    b = 7;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 7;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'I' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 3;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V' && myArray[5] == 'I' && myArray[6] == 'I') {
                    a = 7;
                    b = 7;
                    break;
                }
                if (a == 111 && b == 111) {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
            }
            while (st.length() == 8) {
                if (myArray[0] == 'I' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V' && myArray[5] == 'I' && myArray[6] == 'I' && myArray[7] == 'I') {
                    a = 3;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'I' && myArray[6] == 'I' && myArray[7] == 'I') {
                    a = 8;
                    b = 3;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[4] == 'V' && myArray[5] == 'I' && myArray[6] == 'I' && myArray[7] == 'I') {
                    a = 7;
                    b = 8;
                    break;
                }
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'V' && myArray[6] == 'I' && myArray[7] == 'I') {
                    a = 8;
                    b = 7;
                    break;
                }
                if (a == 111 && b == 111) {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
            }
            while (st.length() == 9) {
                if (myArray[0] == 'V' && myArray[1] == 'I' && myArray[2] == 'I' && myArray[3] == 'I' && myArray[5] == 'V' && myArray[6] == 'I' && myArray[7] == 'I' && myArray[8] == 'I') {
                    a = 8;
                    b = 8;
                    break;
                }
                if (a == 111 && b == 111) {
                    throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
                }
            }
        // Срабатывание исключения в случае ввода не подходящих символов для работы с римскими числами
        if (a == 111 && b == 111) {
            throw new NumberFormatException("Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно");
        }
        // Условия арифметических операций с римскими числами
            if (st.length() > 5 && myArray[4] == '+') {
                s = a + b;
            }
            if (st.length() > 5 && myArray[4] == '-') {
                s = a - b;
            }
            if (st.length() > 5 && myArray[4] == '*') {
                s = a * b;
            }
            if (st.length() > 5 && myArray[4] == '/') {
                s = a / b;
            }

            if (st.length() > 4 && myArray[3] == '+') {
                s = a + b;
            }
            if (st.length() > 4 && myArray[3] == '-') {
                s = a - b;
            }
            if (st.length() > 4 && myArray[3] == '*') {
                s = a * b;
            }
            if (st.length() > 4 && myArray[3] == '/') {
                s = a / b;
            }

            if (st.length() > 3 && st.charAt(2) == '+') {
                s = a + b;
            }
            if (st.length() > 3 && st.charAt(2) == '-') {
                s = a - b;
            }
            if (st.length() > 3 && st.charAt(2) == '*') {
                s = a * b;
            }
            if (st.length() > 3 && st.charAt(2) == '/') {
                s = a / b;
            }

            if (myArray[1] == '+') {
                s = a + b;
            }
            if (myArray[1] == '-') {
                s = a - b;
            }
            if (myArray[1] == '*') {
                s = a * b;
            }
            if (myArray[1] == '/') {
                s = a / b;
            }

        if (s < 1) {
            throw new NumberFormatException("Если результат работы c римскими числами меньше единицы, выбрасывается исключение");
        }
        // Вывод в консоль ответа операции с римскими числами
        switch (s) {
            case 1 -> System.out.println("Результат: I");
            case 2 -> System.out.println("Результат: II");
            case 3 -> System.out.println("Результат: III");
            case 4 -> System.out.println("Результат: IV");
            case 5 -> System.out.println("Результат: V");
            case 6 -> System.out.println("Результат: VI");
            case 7 -> System.out.println("Результат: VII");
            case 8 -> System.out.println("Результат: VIII");
            case 9 -> System.out.println("Результат: IX");
            case 10 -> System.out.println("Результат: X");
            case 11 -> System.out.println("Результат: XI");
            case 12 -> System.out.println("Результат: XII");
            case 13 -> System.out.println("Результат: XIII");
            case 14 -> System.out.println("Результат: XIV");
            case 15 -> System.out.println("Результат: XV");
            case 16 -> System.out.println("Результат: XVI");
            case 17 -> System.out.println("Результат: XVII");
            case 18 -> System.out.println("Результат: XVIII");
            case 19 -> System.out.println("Результат: XIX");
            case 20 -> System.out.println("Результат: XX");
            case 21 -> System.out.println("Результат: XXI");
            case 22 -> System.out.println("Результат: XXII");
            case 23 -> System.out.println("Результат: XXIII");
            case 24 -> System.out.println("Результат: XXIV");
            case 25 -> System.out.println("Результат: XXV");
            case 26 -> System.out.println("Результат: XXVI");
            case 27 -> System.out.println("Результат: XXVII");
            case 28 -> System.out.println("Результат: XXVIII");
            case 29 -> System.out.println("Результат: XXIX");
            case 30 -> System.out.println("Результат: XXX");
            case 31 -> System.out.println("Результат: XXXI");
            case 32 -> System.out.println("Результат: XXXII");
            case 33 -> System.out.println("Результат: XXXIII");
            case 34 -> System.out.println("Результат: XXXIV");
            case 35 -> System.out.println("Результат: XXXV");
            case 36 -> System.out.println("Результат: XXXVI");
            case 37 -> System.out.println("Результат: XXXVII");
            case 38 -> System.out.println("Результат: XXXVIII");
            case 39 -> System.out.println("Результат: XXXIX");
            case 40 -> System.out.println("Результат: XL");
            case 41 -> System.out.println("Результат: XLI");
            case 42 -> System.out.println("Результат: XLII");
            case 43 -> System.out.println("Результат: XLIII");
            case 44 -> System.out.println("Результат: XLIV");
            case 45 -> System.out.println("Результат: XLV");
            case 46 -> System.out.println("Результат: XLVI");
            case 47 -> System.out.println("Результат: XLVII");
            case 48 -> System.out.println("Результат: XLVIII");
            case 49 -> System.out.println("Результат: XLIX");
            case 50 -> System.out.println("Результат: L");
            case 51 -> System.out.println("Результат: LI");
            case 52 -> System.out.println("Результат: LII");
            case 53 -> System.out.println("Результат: LIII");
            case 54 -> System.out.println("Результат: LIV");
            case 55 -> System.out.println("Результат: LV");
            case 56 -> System.out.println("Результат: LVI");
            case 57 -> System.out.println("Результат: LVII");
            case 58 -> System.out.println("Результат: LVIII");
            case 59 -> System.out.println("Результат: LIX");
            case 60 -> System.out.println("Результат: LX");
            case 61 -> System.out.println("Результат: LXI");
            case 62 -> System.out.println("Результат: LXII");
            case 63 -> System.out.println("Результат: LXIII");
            case 64 -> System.out.println("Результат: LXIV");
            case 65 -> System.out.println("Результат: LXV");
            case 66 -> System.out.println("Результат: LXVI");
            case 67 -> System.out.println("Результат: LXVII");
            case 68 -> System.out.println("Результат: LXVIII");
            case 69 -> System.out.println("Результат: LXIX");
            case 70 -> System.out.println("Результат: LXX");
            case 71 -> System.out.println("Результат: LXXI");
            case 72 -> System.out.println("Результат: LXXII");
            case 73 -> System.out.println("Результат: LXXIII");
            case 74 -> System.out.println("Результат: LXXIV");
            case 75 -> System.out.println("Результат: LXXV");
            case 76 -> System.out.println("Результат: LXXVI");
            case 77 -> System.out.println("Результат: LXXVII");
            case 78 -> System.out.println("Результат: LXXVIII");
            case 79 -> System.out.println("Результат: LXXIX");
            case 80 -> System.out.println("Результат: LXXX");
            case 81 -> System.out.println("Результат: LXXXI");
            case 82 -> System.out.println("Результат: LXXXII");
            case 83 -> System.out.println("Результат: LXXXIII");
            case 84 -> System.out.println("Результат: LXXXIV");
            case 85 -> System.out.println("Результат: LXXXV");
            case 86 -> System.out.println("Результат: LXXXVI");
            case 87 -> System.out.println("Результат: LXXXVII");
            case 88 -> System.out.println("Результат: LXXXVIII");
            case 89 -> System.out.println("Результат: LXXXIX");
            case 90 -> System.out.println("Результат: XC");
            case 91 -> System.out.println("Результат: XCI");
            case 92 -> System.out.println("Результат: XCII");
            case 93 -> System.out.println("Результат: XCIII");
            case 94 -> System.out.println("Результат: XCIV");
            case 95 -> System.out.println("Результат: XCV");
            case 96 -> System.out.println("Результат: XCVI");
            case 97 -> System.out.println("Результат: XCVII");
            case 98 -> System.out.println("Результат: XCVIII");
            case 99 -> System.out.println("Результат: XCIX");
            case 100 -> System.out.println("Результат: C");
        }
            return input;
        }
}