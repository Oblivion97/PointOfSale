package draftForTestingClasses;

import pos.Inventory;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        try {
           System.out.println(5 / 0);           
        } catch (Exception e) {
           
            System.out.println("\n\n\nAnother Message\n");
            System.out.println(e);
            System.out.println("\n\n\nAnother Message\n");
            System.out.println(e.getMessage()); e.printStackTrace();

        }
     //   System.out.println("Complete");
    }
}
