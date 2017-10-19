package ru.tsystems;

/**
 * Conditions test.
 */
public class Conditions {

    public void testIf() {
        boolean check = false;
        if (!check || false) {
            System.out.println("Just if");
        }

        if (false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        System.out.println("printed");

        if (false) {
            System.out.println("false");
        } else if (false) {
            System.out.println("true");
        } else {
            System.out.println("not true, not false");
        }

        //rewrite me to if-elseif-else
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = true;
        if (check1) {
            System.out.println("a");
        } else if (check2){
            System.out.println("b");
        } else {
            System.out.println("c");
        }


    }

    public void testSwitch() {
        String selectMe = "some string here";
        switch (selectMe) {
            case "some string here":
                System.out.println("some string here");
                break;
            case "another string here":
                System.out.println("another string here");
                break;
            /*case "another string here":
                System.out.println("another string here");
                break;*/
            default:
                System.out.println("Nothing was found");
                break;
        }

        char ch = 'a';
        int i = 15;
        final int iCheck = 15;
        //double d = 15.15;
        switch (ch) {
            case 'a':
                switch (i) {
                    case iCheck:
                        System.out.print("15");
                        break;
                }
                System.out.println("a");
                break;
        }
    }

    public void testTricky() {
        //variable smaller than int
        short s = 32767;
        switch (s) {
            case 32767:
                System.out.println("32767");
                break;
            /*case 32768:
                System.out.println("32768");
                break;*/
        }

        //default not the last
        switch (s) {
            default:
                System.out.println("from the default");
                break;
            case 1:
                break;
        }
    }

}
