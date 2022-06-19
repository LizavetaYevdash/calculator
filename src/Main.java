import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите простой пример с числами от 1 до 10.");
        Scanner consol;
        consol = new Scanner(System.in);
        String numbers = consol.nextLine();
        String[] numbers1 = numbers.split(" ");

        if (numbers1.length != 3) throw new Exception("Формат математической операции не удовлетворяет заданию");
        String operator = numbers1[1];
        String num1 = numbers1[0];
        String num2 = numbers1[2];
        int result;
        if ((num1.equals("O") || num1.equals("I") || num1.equals("II") || num1.equals("III") || num1.equals("IV") || num1.equals("V") || num1.equals("VI") || num1.equals("VII") || num1.equals("VIII") || num1.equals("IX") || num1.equals("X")) && (num2.equals("O") || num2.equals("I") || num2.equals("II") || num2.equals("III") || num2.equals("IV") || num2.equals("V") || num2.equals("VI") || num2.equals("VII") || num2.equals("VIII") || num2.equals("IX") || num2.equals("X"))) {
            int number1 = romanToNumber(numbers1[0]);
            int number2 = romanToNumber(numbers1[2]);
            if ((number1 > 10 || number1 < 0) && (number2 > 10 || number2 < 0)) {
                throw new IllegalArgumentException("Калькулятор принимает числа от 1 до 10");
            } else {
                result = calc(number1, number2, operator);
                if (result < 0) {
                    throw new Exception("В римской системе нет отрицательных чисел");

                } else {
                    String romanswer = convertNumToRoman(result);
                    System.out.println(romanswer);
                }
            }
        } else if ((num1.equals("O") || num1.equals("1") || num1.equals("2") || num1.equals("3") || num1.equals("4") || num1.equals("5") || num1.equals("6") || num1.equals("7") || num1.equals("8") || num1.equals("9") || num1.equals("10")) && ((num1.equals("O") || num1.equals("1") || num1.equals("2") || num1.equals("3") || num1.equals("4") || num1.equals("5") || num1.equals("6") || num1.equals("7") || num1.equals("8") || num1.equals("9") || num1.equals("10")))) {


            int first = Integer.parseInt(numbers1[0]);
            int second = Integer.parseInt(numbers1[2]);
            if ((first > 10 || first < 0) || (second > 10 || second < 0))
                throw new IllegalArgumentException("Калькулятор принимает числа от 1 до 10");
            result = calc(first, second, operator);
            System.out.println(result);
        }
    else {throw new Exception("Неверный формат данных");}
    }



    private static String convertNumToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArabian];
    }


    private static int romanToNumber (String roman) throws Exception {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (Exception e) {
            throw new Exception("Неверный формат данных");
        }
        return 0;
    }


    public static int calc(int num1, int num2, String op) {
        int result;
        if ("+".equals(op)) {
            result = num1 + num2;
        } else if ("-".equals(op)) {
            result = num1 - num2;
        } else if ("*".equals(op)) {
            result = num1 * num2;
        } else if ("/".equals(op)) {
            result = num1 / num2;
        } else {
            throw new IllegalArgumentException("Калькулятор работает только со знаками деления(/), умножения(*), вычитания(-) и сложения(+).");
        }
        return result;
    }

}
