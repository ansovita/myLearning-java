package classroom;


public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44, 20));

        //Print Hello World 10 times:
        printTextMultipleTimes("Hey all", 3);

        //Call method printAllValuesFromStringArray
        //You pass: array with fruits
        String[] fruits = {"Banana", "Apple", "Grape", "Melon"};
        printAllValuesFromStringArray(fruits);

        //Call method printAllValuesFromStringArray
        //You pass: Weekly day
        String[] weeklyDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        printAllValuesFromStringArray(weeklyDays);

        System.out.println(isEven(10));
        System.out.println(isEven(11));

        int[] numbers = {1, 2, 3, 4, 5};
        int arraySum = printSumOfArrayNumbers(numbers);
        System.out.println(arraySum);
    }

    private static int printSumOfArrayNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }


    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    //Task: Create method that receives String array and print all values

    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    //Task: Create method that will true if number is even or false if odd;

    public static boolean isEven (int number) {
        boolean result = number % 2 == 0;
        return result;
    }

    //    public static boolean isEven (int number) {
    //        if(number % 2 == 0) {
    //          return true;
    //    } else {
    //      return false;
    //    }

    //Task: Create method that accepts int array end return sum of number

    }