package draftForTestingClasses;



import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Mir Ferdous
 */
public class LinkedListJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("POS");

        Integer noOfInteger, x;
        System.out.println("How many do u want to add in LinkedList?");
        noOfInteger = sc.nextInt();

        LinkedList<Integer> id = new LinkedList();

        for (int i = 0; i < noOfInteger; i++) {
            System.out.print("\nEnter a Integer: ");
            x = sc.nextInt();
            id.add(x);
        }

        System.out.println(id);

        for (int i = 0; i < noOfInteger; i++) {
            System.out.print("Enter Integer to delete:");
            x = sc.nextInt();
            id.remove(x);
            System.out.println(id);
        }
    }

}
