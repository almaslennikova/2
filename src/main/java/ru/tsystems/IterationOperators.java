package ru.tsystems;

public class IterationOperators {

    public void testWhile() {
        char c = 'a';
        do {
            c = (char) (c + 1);
            System.out.print(c + " "); //simplify with c++
        } while(c <= 'z');
        System.out.println();

        int i = 1, j = 10;
        while (i++ < j--) {
            System.out.println(i + " " + j);
        }
        System.out.println();
    }

    public void testDoWhile() {
        boolean[] bools = {true, true, true};
        int idx = 0;
        boolean result = true;
        do {
            if (idx == 0) {
                result &= bools[idx++]; // result = result & bools[idx++];
            }
            if (idx == 1) {
                result |= bools[idx++];
            }
            if (idx == 2) {
                result ^= bools[idx++];
            }
        } while (idx < bools.length);
        System.out.println(result);

        //what do code below?
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j += 1;

            } while (j <= 9);

            i += 1;

        } while (i <= 9);
    }

    public void testFor() {
        int index;
        for (index = 0; index < 10; index++) {
            System.out.print(index + " ");
        }
        System.out.println(index + "\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("No access to initial value :(\n");

        for (int a=1, b=4; a < b; a++, b--) {
            System.out.println("a " + a + " b " + b);
        }
        System.out.println();

        //tricky snippets below
        for (;;) {
            System.out.println("I can executes forever");
            break;
        }
        System.out.println();

        for (int i = 100; i > 90; System.out.print(i + " ")) {
            i -= 1;
        }
        System.out.println();
    }

    public void testForEach() {
        int array[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i : array) {
            System.out.print(i + " ");
            //will not have any effect
            // i = 999;
        }
        System.out.println();

        int array2[][] = {array};
        for (int arr1[] : array2) {
            for (int value : arr1) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

}
