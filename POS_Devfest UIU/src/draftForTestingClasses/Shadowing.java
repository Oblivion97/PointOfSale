package draftForTestingClasses;

/**
 * @author Mir Ferdous
 */
class ShadowClass {

    String name = "Hridoy";

    public String aFunction() {
        String name="Mir";
        return name;
    }

}

public class Shadowing {

    public static void main(String[] args) {
        ShadowClass shadowClass=new ShadowClass();
        
        System.out.println(shadowClass.name);
        System.out.println(shadowClass.aFunction());
        
    }
}