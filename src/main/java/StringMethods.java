import project_utils.Utils;

import static project_utils.Utils.isStringNotNullAndNotEmpty;

public class StringMethods {
    /**
     * 1. Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и
     * в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
     * Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */


    public String removeSpaces(String text, int a) {

        if (text.equals("")) {

            return (text.trim());

        }
        if (text.isEmpty() == true) {

            return "Строка пустая";
        }
        if (text.equals(text.trim())) {

            return (text.trim() + "Лишние пробелы удалены");
        } else {

            return "Пробелов не было";
        }
    }


    /**
     * 2. Написать алгоритм removeAllAs().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */

//    public  String removeAllAs(String text) {
//       boolean stringHasOnlyNumbers = Utils.checkTheNumbers(text);
//       if(!text.isEmpty())
//    }

//
//    public static void main(String[] args) {
//
//
//        String text = "panda";
//  removeAllAs(text);
//    }


    /**
     * 3. Написать алгоритм removeAllZeros().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает
     * обработанную строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is
     * a valid string”.
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */

    public String removeAllAsZeros(String text) {
        boolean stringHasOnlyNumbers = Utils.checkTheNumbers(text);
        if (!text.trim().isEmpty() && stringHasOnlyNumbers) {

            if (text.length() == text.replace("0", "").length()) {

                return "This is a valid string";
            } else {

                return text.replace("0", "").trim();
            }
        }


        return "Invalid string";
    }


    /**
     * 4. Написать алгоритм removeAllSpaces.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     * то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */


    public String removeAllSpaces() {
        String text = "";

        if (text.equals(null)) {
            return text.trim() + text.replace(" ", "");
        }

        return "error";
    }


    /**
     * 5.Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится
     * в строке. Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
     * Итоговый результат должен строится с помощью метода из видео 2.
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */


    public String countAs(String text) {
        if (text != null) {
            if (!text.isEmpty()) {
                String[] arr = text.trim().toLowerCase().split("");
                int counter = 0;
                int counter2 = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals("a")) {
                        counter += 1;
                    } else {
                        counter2 += 1;
                    }
                }
                if (counter + counter2 == text.trim().length()) {

                    return String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }

            return "Invalid value";
        }


        return "null";
    }


    // Можно не только через массивы, но и через строку, далее:


    public String countAs2(String text) {
        if (text != null) {
            if (!text.isEmpty()) {
                text = text.trim().toLowerCase();
                int counter = 0;
                int counter2 = 0;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ('a')) {
                        counter += 1;
                    } else {
                        counter2 += 1;
                    }
                }
                if (counter + counter2 == text.trim().length()) {

                    return String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }

            return "Invalid value";
        }


        return "null";
    }


    /**
     * 6. Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы
     * одно слово Java.
     * Test Data:
     * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term
     * support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java
     * 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public
     * updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8
     * and 11 that are still receiving security and other upgrades.” → true
     *
     * “99 little bugs in a code.
     * 99 little bugs in a code.
     * Take one down, and patch it around.
     * 235 critical bugs in the code.” → false
     */


//     public  String countJava(String text) {
//          text = "";
//        return (text.toLowerCase().contains("Java"));
//
//     }


    /**
     * 8.Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова
     * “писал”,  и оборачивает в кавычки вторую строку
     * (результат строится с помощью метода concat())
     * <p>
     * Test Data:
     * “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     * “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     * Задание со звездочкой:
     * “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     * "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
     */

    public String insertQuotes(String text, String text2) {
        if (isStringNotNullAndNotEmpty(text) && isStringNotNullAndNotEmpty(text2)) {
            String textNew = text.replace("\", ", ": ");

            String textNew2 = text2.replace("\"Надо любить жизнь больше, чем смысл жизни\"", "\"Надо"
                    + "любить жизнь больше, чем смысл жизни.\"");

            return textNew.concat(textNew2).concat("\"");
        }

        return "";
    }

    /**
     * 11. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
     * на одинаковую букву, и false иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */

    public boolean sameFirstLastLetterIndexOf(String str) {
        if (str != null && !str.trim().isEmpty() && !str.trim().contains(" ")) {
            str = str.trim().toLowerCase();

            return str.lastIndexOf(str.charAt(0)) == (str.length() - 1);
        }//взяли первую букву под нулевым индексом == последний индексу всего слова, и если str = последнему
        //индексу всего слоаа, то слово заканчивается на ту же букву

        return false;
    }


}



