package draftForTestingClasses;


import java.util.Scanner;
import java.util.Vector;

public class Vector2D {

    public static void main(String[] args) {

        Vector<String> rowVec = new Vector<>();
        Vector<Vector<String>> vec2d = new Vector<>();

        for (int i = 0; i < vec2d.size(); i++) {
            for (int j = 0; j < rowVec.size(); j++) {
                rowVec.add(Integer.toString(j));
            }
            vec2d.add(rowVec);
        }

        for (int i = 0; i < vec2d.size(); i++) {
            for (int j = 0; j < rowVec.size(); j++) {
                System.out.println(rowVec.get(j)+"\t");
            }
            System.out.println();
        }
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        return s;
    }
}
