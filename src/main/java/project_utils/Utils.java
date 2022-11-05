package project_utils;

public class Utils {


    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "__  Pass";
        } else {

            return "__  Fail";
        }

    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == (actualResult)) {
            return "__  Pass";
        } else {

            return "__  Fail";
        }

    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == (actualResult)) {
            return "__  Pass";
        } else {

            return "__  Fail";
        }

    }


    public static int getRandomInt(int upper, int lower) {

        return (int)(Math.random() * (upper - lower) + lower);
    }


    public static double getRandomDouble(int upper, int lower) {

        return ((Math.random() * (upper - lower) + lower));
    }


    public static  int[] createArrayRandomInt(int length, int upper, int lower){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i ++) {
            array[i] = getRandomInt(upper, lower);
        }

        return array;
    }

    //длина массива
    public static int lengthArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }


    public static int lengthArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }


    public static int lengthArray(boolean[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }


    public static int lengthArray(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }


    public static void convertTemp(double celsius) {
        System.out.println(" C = " + celsius);
        System.out.println(" F = " + ((celsius * 9 / 5) + 32));
    }


    public static void speedAverage(double distance, double time) {
        if (time != 0) {
            double speed = (distance / time);
            System.out.println("Speed = " + speed + "mph");
        }
    }


    public static String getPrice(double price) {
        if (price > 0) {
            double intNumber = Math.floor(price);
            double subNumber = price % intNumber;
            subNumber = subNumber * 100;

            return (int) intNumber + " руб " + (int) subNumber + " коп";
        }

        return "Enter number then bigger then 0";
    }


    public static String convertNumberWeight(double weight) {
        if (weight >= 0) {
            int kg = (int) weight;
            int gr = (int) (Math.round((weight - kg) * 1000));

//            String gr1;
//            if (gr >= 0 && gr < 9) {
//                gr1 = "00" + gr;
//            } else if (gr >= 10 && gr < 99) {
//                gr1 = "0" + gr;
//            }
//               else {
//                   gr1 = "" + gr;
//            }
            return kg + " кг " + gr + " гр";
        }

        return "Error";
    }


    public static void printParameterStartEnd(double start, double end, double step) {
        if (step != 0) {
            if (start <= end && step > 0) {
                for (double i = start; i <= end; i += step) {
                    System.out.println(i);
                }
            } else if (start >= end && step < 0) {
                for (double i = start; i >= end; i += step) {
                    System.out.println(i);
                }
            }
        }
    }


    public static String returnL(int l) {
        String str = " ";
        for (int i = 0; i < l; i++) {
            str += (i * 2) + " ";
        }

        return str;
    }


    public static String returnMonth(int number) {                              //Задание 1
        if (number > 0 && number < 13) {
            switch (number) {
                case 1:
                    return "Jan";
                case 2:
                    return "Feb";
                case 3:
                    return "Mar";
                case 4:
                    return "Apr";
                case 5:
                    return "May";
                case 6:
                    return "Jun";
                case 7:
                    return "Jul";
                case 8:
                    return "Aug";
                case 9:
                    return "Sep";
                case 10:
                    return "Oct";
                case 11:
                    return "Nov";
                case 12:
                    return "Dec";
            }
        }
        return "Error";
    }


    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {

            switch (number) {
                case 1:
                    return "Mon";
                case 2:
                    return "Tue";
                case 3:
                    return "Wed";
                case 4:
                    return "Thu";
                case 5:
                    return "Fri";
                case 6:
                    return "Sat";
                case 7:
                    return "Sun";
            }
        }
        return "Error";
    }


    public static int returnDayOfTheWeek(String day) {

        switch (day) {
            case "Mon":
                return 1;
            case "Tue":
                return 2;
            case "Wed":
                return 3;
            case "Thu":
                return 4;
            case "Fri":
                return 5;
            case "Sat":
                return 6;
            case "Sun":
                return 7;
        }

        return 0;
    }


    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.valueOf(number); //добавляем ноль для 1-9
        } else {
            return date;
        }
    }


    public static int daysInMonth(int month, int year) {

        int numDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:

                return -1;
        }

        return numDays;
    }


    public void printEightDaysFromDate(String day, int month, int date, int year) {

        int currentYear = year; //использовал для метода без агумета year. Для текущего года.

        if (returnDayOfTheWeek(day) == 0 ||
                returnMonth(month).equals("Error") ||
                month <= 0 || // лишнее т.к. уже проверяется в returnMonth
                date <= 0 ||
                date > (daysInMonth(month, year))) {

            System.out.println("Please enter correct data.");

        } else {
            int currentDay = returnDayOfTheWeek(day);
            int currentMonth = month;
            int currentDate = date;
// print day
            for (int i = 0; i <= 7; i++) {
                if (currentDay != 7) {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay++;
                } else {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay = 1;
                }
// print month + date
                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                } else {
                    if (currentMonth != 12) {
                        currentMonth++;
                    } else {
                        currentMonth = 1;
                        currentYear = year + 1;
                    }
                    currentDate = 1;
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                }
            }
        }
    }


    public static void sequenceWithStep(int start, int end, int step) {
        if (step == 0) {
            System.out.println("Error! Enter correct step number");
        } else if (start == end && step != end) {
            System.out.println("Error! Start and end number equals, and entered step don't work ");

        } else {
            int newStart = start - start % step;

            if (start <= end && step > 0) {
                if (newStart < start) {
                    newStart += step;
                }
                for (int i = newStart; i <= end; i += step) {

                    System.out.print(i + " ");
                }

            } else if (start >= end && step > 0) {

                if (newStart > start) {
                    newStart -= step;
                }
                for (int i = newStart; i >= end; i -= step) {

                    System.out.print(i + " ");
                }
            } else if (start <= end) {

                if (newStart < start) {
                    newStart -= step;

                }
                for (int i = newStart; i <= end; i -= step) {

                    System.out.print(i + " ");
                }

            } else {
                if (newStart > start) {
                    newStart += step;
                }
                for (int i = newStart; i >= end; i += step) {

                    System.out.print(i + " ");
                }
            }
        }
    }


    public static void printAverageOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Среднее значение всех элементов массива - " + sum / array.length);
    }


    public static boolean checkForEmptyArray(int[] array) {
        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }


    public static boolean checkForEmptyArray(double[] array) {
        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }


    public static boolean checkForEmptyArray(String[] array) {
        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }


    public static boolean checkTheNumbers(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    public static boolean isStringNotNullAndNotEmpty(String text) {
        if (text != null ) {


            return !text.trim().isEmpty();
        }

        return false;
    }
}
