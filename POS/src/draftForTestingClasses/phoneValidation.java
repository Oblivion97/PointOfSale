package draftForTestingClasses;

import java.util.Scanner;

public class phoneValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String no;

        do {
            System.out.print("\nEnter Phone Number : ");
            no = sc.next();

            if (phoneValidation(no)==true) {
                System.out.println("UR GiVEN Number is VALID ");
                flag = false;
            } else {
                System.out.println("Not a Valid Number.TRY AGAIN");
            }
        } while (flag);

    }

    public static boolean phoneValidation(String no) {
        boolean valid = true;
        String start = "01";

        try {

            if (no.length() != 11 && no.charAt(0) != '0' && no.charAt(1) != '1') {

                for (int i = 2; i < no.length(); i++) {
                    if ((no.charAt(i) != 43
                            || no.charAt(i) != 44
                            || no.charAt(i) != 45
                            || no.charAt(i) != 46
                            || no.charAt(i) != 47
                            || no.charAt(i) != 48
                            || no.charAt(i) != 49
                            || no.charAt(i) != 50
                            || no.charAt(i) != 51
                            || no.charAt(i) != 52)) {
                        valid = false;
                    }
                }

            }

        } catch (Exception e) {
        }

        return valid;
    }

}
