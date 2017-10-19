package ru.tsystems;

public class Main {

    public static void main(String[] args) {
        //use JUnit tests to see some results

        /*for (int i =1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even number");
            } else {
                System.out.println(i + " Odd number");
            }
        }


        char[] chars = {'a', 'p', 'o', 'l', 'o', 'g', 'i', 'z', 'e'};
        int idx = 0, vowelsCount = 0, consonantCount = 0, otherCount = 0;
        do {
            char ch = chars[idx];
            switch (ch) {
                case 'a':
                    //here and below left empty specially
                case 'o':
                case 'i':
                case 'e':
                    vowelsCount += 1;
                    break;
                case 'p':
                    //here and below left empty specially
                case 'l':
                case 'g':
                case 'z':
                    consonantCount += 1;
                    break;
                default:
                    otherCount += 1;
                    break;
            }
        } while (idx < chars.length);
        System.out.println("Vowels = " + vowelsCount);
        System.out.println("Consonant = " + consonantCount);
        System.out.println("Other = " + otherCount);*/


        final int numbersLength = 100;
        long[] fibonachyNumbers = new long[numbersLength];

        for (int idx = 0; idx < numbersLength; idx++) {
            if (idx == 0) {
                fibonachyNumbers[0] = 0;

            } else if (idx == 1) {
                fibonachyNumbers[1] = 1;

            } else {
                fibonachyNumbers[idx] = fibonachyNumbers[idx - 1] + fibonachyNumbers[idx - 2];
            }
        }

        for (long fNumber : fibonachyNumbers) {
            System.out.print(fNumber +  " ");
        }

    }

}
